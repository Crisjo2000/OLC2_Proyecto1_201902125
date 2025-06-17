package repl

import (
	"compiler/value"
	"fmt"

	"github.com/antlr4-go/antlr/v4"
)

type ScopeTrace struct {
	GlobalScope  *BaseScope
	CurrentScope *BaseScope

	Reporte string
}

func (s *ScopeTrace) PushScope(name string) *BaseScope {

	newScope := NewLocalScope(name)
	s.CurrentScope.AddChild(newScope)
	s.CurrentScope = newScope

	return s.CurrentScope
}

func (s *ScopeTrace) PopScope() {
	s.CurrentScope = s.CurrentScope.Parent()
}

func (s *ScopeTrace) Reset() {
	s.CurrentScope = s.GlobalScope
}

func (s *ScopeTrace) AddVariable(name string, varType string, value value.IVOR, isConst bool, allowNil bool, token antlr.Token) (*Variable, string) {
	return s.CurrentScope.AddVariable(name, varType, value, isConst, allowNil, token)
}

func (s *ScopeTrace) GetVariable(name string) *Variable {
	return s.CurrentScope.GetVariable(name)
}

func (s *ScopeTrace) AddFunction(name string, function value.IVOR) (bool, string) {
	return s.CurrentScope.AddFunction(name, function)
}

func (s *ScopeTrace) GetFunction(name string) (value.IVOR, string) {
	return s.CurrentScope.GetFunction(name)
}

func (s *ScopeTrace) IsMutatingEnvironment() bool {
	return s.CurrentScope.IsMutatingScope()
}

func NewScopeTrace() *ScopeTrace {
	globalScope := NewGlobalScope()
	return &ScopeTrace{
		GlobalScope:  globalScope,
		CurrentScope: globalScope,
	}
}

func NewVectorScope() *BaseScope {
	var scope = &BaseScope{
		name:      "vector",
		variables: make(map[string]*Variable),
		children:  make([]*BaseScope, 0),
		functions: make(map[string]value.IVOR),
		parent:    nil,
	}

	return scope
}

func NewStructScope() *BaseScope {

	newGlobal := NewGlobalScope()

	return &BaseScope{
		name:      "struct",
		variables: make(map[string]*Variable),
		children:  make([]*BaseScope, 0),
		functions: make(map[string]value.IVOR),
		structs:   make(map[string]*Struct),
		parent:    newGlobal,
		isStruct:  true,
	}
}

type ReportTable struct {
	GlobalScope ReportScope
}

type ReportScope struct {
	Name        string
	Vars        []ReportSymbol
	Funcs       []ReportSymbol
	Structs     []ReportSymbol
	ChildScopes []ReportScope
}

type ReportSymbol struct {
	Name   string
	Type   string
	Line   int
	Column int
}

// nuevooooooo
type HTMLReport struct {
	Reporte string
}

func (s *ScopeTrace) Report() ReportTable {
	return ReportTable{
		GlobalScope: s.CurrentScope.Report(),
	}
}

func (s *BaseScope) Report() ReportScope {

	reportScope := ReportScope{
		Name:        s.name,
		Vars:        make([]ReportSymbol, 0),
		Funcs:       make([]ReportSymbol, 0),
		Structs:     make([]ReportSymbol, 0),
		ChildScopes: make([]ReportScope, 0),
	}

	for _, v := range s.variables {

		token := v.Token
		line := 0
		column := 0

		if token != nil {
			line = token.GetLine()
			column = token.GetColumn()
		}

		s.reportito += "<tr><td>" + v.Name + "</td><td>" + v.Type + "</td><td>" + v.Value.Type() + "</td><td>" + s.name + "</td></tr>"
		reportScope.Vars = append(reportScope.Vars, ReportSymbol{
			Name:   v.Name,
			Type:   v.Type,
			Line:   line,
			Column: column,
		})

	}

	for _, f := range s.functions {
		switch function := f.(type) {
		case *BuiltInFunction:
			reportScope.Funcs = append(reportScope.Funcs, ReportSymbol{
				Name:   function.Name,
				Type:   "Embebida: " + function.Name,
				Line:   0,
				Column: 0,
			})
		case *Function:

			line := 0
			column := 0

			if function.Token != nil {
				line = function.Token.GetLine()
				column = function.Token.GetColumn()
			}

			reportScope.Funcs = append(reportScope.Funcs, ReportSymbol{
				Name:   function.Name,
				Type:   function.ReturnType,
				Line:   line,
				Column: column,
			})
		}
	}

	for _, v := range s.structs {
		reportScope.Structs = append(reportScope.Structs, ReportSymbol{
			Name:   v.Name,
			Type:   v.Name,
			Line:   v.Token.GetLine(),
			Column: v.Token.GetColumn(),
		})
	}

	for _, v := range s.children {
		reportScope.ChildScopes = append(reportScope.ChildScopes, v.Report())
	}

	return reportScope
}

func (s *ScopeTrace) GenerateHTMLReport() string {
	reportTable := s.Report()
	html := `
    <!DOCTYPE html>
    <html>
    <head>
        <title>Tabla de Símbolos - V-Lang Cherry</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 20px;
                background-color: #f5f5f5;
            }
            h1 {
                color: #2c3e50;
                text-align: center;
            }
            .report-container {
                background-color: white;
                border-radius: 8px;
                box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                padding: 20px;
                margin-bottom: 20px;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 15px;
            }
            th, td {
                border: 1px solid #ddd;
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #3498db;
                color: white;
            }
            tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            .scope-title {
                color: #e74c3c;
                margin-top: 20px;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Tabla de Símbolos</h1>
        <div class="report-container">
    `

	html += s.generateScopeHTML(reportTable.GlobalScope, 0)

	html += `
        </div>
    </body>
    </html>
    `

	return html
}

func (s *ScopeTrace) generateScopeHTML(scope ReportScope, level int) string {
	indent := ""
	for i := 0; i < level; i++ {
		indent += "&nbsp;&nbsp;&nbsp;&nbsp;"
	}

	html := fmt.Sprintf(`<h3 class="scope-title">%sScope: %s</h3>`, indent, scope.Name)

	if len(scope.Vars) > 0 {
		html += `
        <h4>Variables:</h4>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Tipo</th>
                <th>Línea</th>
                <th>Columna</th>
            </tr>
        `

		for _, variable := range scope.Vars {
			html += fmt.Sprintf(`
            <tr>
                <td>%s%s</td>
                <td>%s</td>
                <td>%d</td>
                <td>%d</td>
            </tr>
            `, indent, variable.Name, variable.Type, variable.Line, variable.Column)
		}

		html += `</table>`
	}

	if len(scope.Funcs) > 0 {
		html += `
        <h4>Funciones:</h4>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Tipo Retorno</th>
                <th>Línea</th>
                <th>Columna</th>
            </tr>
        `

		for _, function := range scope.Funcs {
			html += fmt.Sprintf(`
            <tr>
                <td>%s%s</td>
                <td>%s</td>
                <td>%d</td>
                <td>%d</td>
            </tr>
            `, indent, function.Name, function.Type, function.Line, function.Column)
		}

		html += `</table>`
	}

	if len(scope.Structs) > 0 {
		html += `
        <h4>Structs:</h4>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Línea</th>
                <th>Columna</th>
            </tr>
        `

		for _, structItem := range scope.Structs {
			html += fmt.Sprintf(`
            <tr>
                <td>%s%s</td>
                <td>%d</td>
                <td>%d</td>
            </tr>
            `, indent, structItem.Name, structItem.Line, structItem.Column)
		}

		html += `</table>`
	}

	for _, childScope := range scope.ChildScopes {
		html += s.generateScopeHTML(childScope, level+1)
	}

	return html
}
