package repl

import compiler "compiler/parser"

type REPLVisitor struct {
	compiler.BaseV4LangGrammarVisitor
	ErrorTable *ErrorTable
	Console    *Console
}

func NewVisitor(dclVisitor *dclVisitor) *REPLVisitor {
	return &REPLVisitor{
		//Scope Trace: dclVisitor.ScopeTrace,
		ErrorTable: dclVisitor.ErrorTable,
		//StructNames: dclVisitor.StructNames,
		//CallStack: NewCallStack(),
		Console: NewConsole(),
	}
}

func (*REPLVisitor) VisitProg(ctx *parser.ProgContext) interface{} {
	for _, stmt := range ctx.AllStmt() {
		v.Visit(stmt)
	}

	return nil
}
