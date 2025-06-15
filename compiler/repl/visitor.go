package repl

import (
	compiler "compiler/parser"
	parser "compiler/parser"
	"compiler/value"
	"fmt"
	"log"
	"strconv"
	"strings"

	"github.com/antlr4-go/antlr/v4"
)

type Value interface {
	// métodos comunes que necesites
}

type IntValue struct {
	Value int
}

// Visitor personalizado para recorrer el árbol de sintaxis

// Constructor del visitor
type ReplVisitor struct {
	parser.BaseVlangVisitor
	ScopeTrace  *ScopeTrace
	CallStack   *CallStack
	Console     *Console
	ErrorTable  *ErrorTable
	StructNames []string
}

/*
NOTA: para testear estoy usando un constructor
para ReplVisitor que solo recibe la tabla de errores
y luego inicializar el ScopeTrace y el CallStack
y la Consola

PERO: el metodo NewVisitor(dclVisitor *DclVisitor)
lo que hace es que recibe un DclVisitor que hace una pasada
antes para ver que cosas estan declaradas.

ENTONCES: NewVisitor es el que inicializa el ReplVisitor
y le pasa el ScopeTrace, ErrorTable y StructNames, estructuras
que ya tienen inicializadas las listas con lo que se agrego.

*/

// Recibe DclVisitor e inicializa el ReplVisitor
func NewVisitor(dclVisitor *DclVisitor) *ReplVisitor {
	return &ReplVisitor{
		ScopeTrace:  dclVisitor.ScopeTrace,
		ErrorTable:  dclVisitor.ErrorTable,
		StructNames: dclVisitor.StructNames,
		CallStack:   NewCallStack(),
		Console:     NewConsole(),
	}
}

// tambien podemos crear un ReplVisitor sin DclVisitor
// Esto es util para hacer tests de una vez
func NewReplVisitor(errorTable *ErrorTable) *ReplVisitor {
	return &ReplVisitor{
		ScopeTrace:  NewScopeTrace(),
		ErrorTable:  errorTable,
		StructNames: []string{},
		CallStack:   NewCallStack(),
		Console:     NewConsole(),
	}
}

// GetReplContext devuelve el contexto del REPL
// que contiene la consola, el ScopeTrace, el CallStack y la ErrorTable
func (v *ReplVisitor) GetReplContext() *ReplContext {
	return &ReplContext{
		Console:    v.Console,
		ScopeTrace: v.ScopeTrace,
		CallStack:  v.CallStack,
		ErrorTable: v.ErrorTable,
	}
}

// ValidType verifica si el tipo es valido en el ScopeTrace
// Esto se usa para validar tipos de variables, funciones, etc.
func (v *ReplVisitor) ValidType(_type string) bool {
	return v.ScopeTrace.GlobalScope.ValidType(_type)
}

// Visit es el metodo que se llama para visitar un nodo del arbol de sintaxis
// Dependiendo del tipo de nodo, se llama al metodo correspondiente
// Si es un ErrorNodeImpl, se lanza un error
func (v *ReplVisitor) Visit(tree antlr.ParseTree) interface{} {
	if tree == nil {
		fmt.Println("⚠️ Árbol nulo recibido.")
		return nil
	}
	fmt.Println("Enrutado------------------")
	switch node := tree.(type) {
	case *antlr.ErrorNodeImpl:
		log.Fatal(node.GetText())

	case *parser.ProgramaContext:
		return v.VisitPrograma(node)

	case *parser.PrintlnStmtContext:
		return v.VisitPrintlnStmt(node)

	case *parser.PrintStmtContext:
		return v.VisitPrintStmt(node)
	case *parser.ValorexpresionContext:
		// Visitamos el hijo de valorexpresion
		return v.VisitValorexpresion(node)

	// Declaraciones de variables
	case *parser.FuncMainContext:
		// Visitamos el hijo de valorexpresion
		return v.VisitFuncMain(node)

	case *parser.IncrementoContext:
		// Visitamos el hijo de valorexpresion
		return v.VisitIncremento(node)

	case *parser.Incremento2Context:
		return v.VisitIncremento2(node)

	case *parser.DecrementoContext:
		// Visitamos el hijo de valorexpresion
		return v.VisitDecremento(node)

	case *compiler.DeclAssignContext:
		fmt.Println("🔍 Visitando DeclAssign:", node.GetText())
		return v.VisitValueDeclAssign(node)
	case *parser.DeclAssignTypeContext:
		fmt.Println("🔍 Visitando DeclAssignType:", node.GetText())
		return v.VisitDeclAssignType(node)

	// tiramos todos los case de los nodos literales
	case *parser.ValorEnteroContext:
		fmt.Println("🔍 Visitando ValorEntero:", node.GetText())
		return v.VisitValorEntero(node)
	case *parser.ValorFloatContext:
		return v.VisitValorFloat(node)
	case *parser.ValorDecimalContext:
		return v.VisitValorDecimal(node)
	case *parser.ValorCadenaContext:
		return v.VisitValorCadena(node)
	case *parser.ValorBooleanoContext:
		return v.VisitValorBooleano(node)
	case *parser.ValorCaracterContext:
		return v.VisitValorCaracter(node)
	case *parser.IdContext:
		return v.VisitId(node)

	// Expresiones binarias
	case *parser.BinaryExpContext:
		return v.VisitBinaryExp(node)
	/// Agregamos las declaraciones
	// asignaciones posibles
	case *parser.StmtContext:
		return v.VisitStmt(node)

	// parte de los If
	case *parser.IfStmtContext:
		fmt.Println("**-* VISITANDO IF STMT:", node.GetText())
		return v.VisitIfStmt(node)
	case *parser.IfChainContext:
		return v.VisitIfChain(node)
	case *parser.ElseStmtContext:
		return v.VisitElseStmt(node)
	case *parser.DirectAssignContext:
		return v.VisitDirectAssign(node)
	case *parser.UnarioContext:
		return v.VisitUnario(node)
	case *parser.ParentesisexpreContext:
		return v.VisitParentesisexpre(node)
	case *parser.Decremento2Context:
		fmt.Println("🔔 Visitando nodo decremento2")
		return v.VisitDecremento2(node)
	case *parser.WhileStmtContext:
		return v.VisitWhileStmt(node)
	case *parser.ClasicForContext:
		return v.VisitClasicFor(node)
	case *parser.ForStmtContext:
		return v.VisitForStmt(node)
	default:
		fmt.Printf("⚠️ Tipo inesperado en Visit(): %T\n", tree)
		return tree.Accept(v) // fallback por si acaso
	}

	return nil
}

// VisitPrograma es el metodo que se llama para visitar el nodo Programa
// Este nodo es el nodo raiz del arbol de sintaxis
// En este metodo recorremos todos los statements del programa
func (v *ReplVisitor) VisitPrograma(ctx *parser.ProgramaContext) interface{} {

	fmt.Println("🔍 Visitando el programa...")
	// Vamos a recorrer todos los statements y los visitamos
	for _, stmt := range ctx.AllStmt() {
		fmt.Println("---🔍 Visitando statement*:(text)", stmt.GetText())
		v.Visit(stmt)
	}

	return nil
}

/*

Ahora recorremos todos los stmts que tenemos en el programa

*/

func (v *ReplVisitor) VisitStmt(ctx *parser.StmtContext) interface{} {

	//fmt.Println("🔍 Visitando statement*:", ctx.GetText())
	fmt.Println("Entrando a instrucciones disponibles ", ctx.GetText())

	if ctx == nil || ctx.GetChildCount() == 0 {
		fmt.Println("⚠️ Stmt vacío o nulo.")
		return nil
	}

	node := ctx.GetChild(0)

	// Aquí van todos los ifs como los que hicimos antes:
	switch node := node.(type) {
	case *parser.FuncMainContext:
		fmt.Println("🔔 Visitando nodo main")
		v.VisitFuncMain(node)
	case *parser.PrintlnStmtContext:
		fmt.Println("🔔 Visitando nodo println")
		v.VisitPrintlnStmt(node)
	case *parser.PrintStmtContext:
		fmt.Println("🔔 Visitando nodo print")
		v.VisitPrintStmt(node)
	case *parser.DeclAssignContext:
		fmt.Println("🔔 Visitando nodo declAssign")
		v.VisitValueDeclAssign(node)
	case *parser.DeclAssignTypeContext:
		fmt.Println("🔔 Visitando nodo declAssignType")
		v.VisitDeclAssignType(node)
	case *parser.DirectAssignContext:
		fmt.Println("🔔 Visitando nodo directAssign")
		v.VisitDirectAssign(node)
	case *parser.IfStmtContext:
		fmt.Println("----🔔 Visitando nodo ifStmt")
		v.VisitIfStmt(node)
	case *parser.WhileStmtContext:
		fmt.Println("🔔 Visitando nodo whileStmt")
		v.VisitWhileStmt(node)
	case *parser.ForStmtContext:
		fmt.Println("🔔 Visitando nodo forStmt")
		v.VisitForStmt(node)

	case *parser.IncrementoContext:
		fmt.Println("🔔 Visitando nodo incremento")
		v.VisitIncremento(node)

	case *parser.DecrementoContext:
		fmt.Println("🔔 Visitando nodo decremento")
		v.VisitDecremento(node)

	case *parser.Decremento2Context:
		fmt.Println("🔔 Visitando nodo decremento")
		v.VisitDecremento2(node)

	case *parser.UnarioContext:
		v.VisitUnario(node)

	case *parser.ParentesisexpreContext:
		v.VisitParentesisexpre(node)

	case *parser.Incremento2Context:
		v.VisitIncremento2(node)

	case *parser.ClasicForContext:
		v.VisitClasicFor(node)

	default:
		fmt.Printf("⚠️ Tipo no reconocido dentro de stmt->: %T\n", node)
	}

	return nil
}

func (v *ReplVisitor) VisitDirectAssign(ctx *parser.DirectAssignContext) interface{} {
	// Vamos a visitar la asignacion
	// Primero vamos a ver si es una asignacion de variable
	// lo que queremos hacer para una asignacion
	// es ver si tenemos el ID
	fmt.Println(" // Parte de asignacion ")

	varName := ctx.Id_pattern().GetText()

	varValue := v.Visit(ctx.Expresion()).(value.IVOR)

	//varValue := v.Visit(ctx.Expresion()).(value.IVOR)
	// le pedimos la variable al ScopeTrace
	variable := v.ScopeTrace.GetVariable(varName)
	fmt.Println(varValue, " -*- ", varName, " /*/ ")

	if variable == nil {
		fmt.Println("ERROR NO EXISTE LA VARIABLE")
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable "+varName+" no encontrada")
		varType := varValue.Type()

		// Añadir la variable al ámbito
		newVar, msg := v.ScopeTrace.AddVariable(varName, varType, varValue, true, false, ctx.GetStart())

		if newVar == nil {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
		} else {
			v.ErrorTable.NewSemanticError(ctx.GetStart(),
				"Variable '"+varName+"' no declarada - se creó automáticamente")
		}
		return nil

	} else {

		// Se copia el objeto

		// Aqui se deberia agregar la validacion del vector

		// // verificamos si es un struct
		// if v.ScopeTrace.CurrentScope.isStruct {
		// 	canMutate = v.ScopeTrace.IsMutatingEnvironment()
		// }

		ok, msg := variable.Assign(varValue, true)

		if !ok {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
		}
	}

	return nil

}

/*
Con este metodo subimos el valor de la expresion
*/
func (v *ReplVisitor) VisitValorexpresion(ctx *parser.ValorexpresionContext) interface{} {
	// solo vamos a subir al hijo
	fmt.Println("🔍 Visitando Valorexpresion:", ctx.GetText())

	/*
		Todo esta bien, pero, tenemos que verificar el tipo de objeto que
		es el ctx y mandarlo al visit de nuevo para que suba pero
		con una forma de expresion con valores atomicos

		volvemos a subir el valor a la expresion

	*/
	valor := ctx.Valor()

	return v.Visit(valor)
}

// print normal
func (v *ReplVisitor) VisitPrintStmt(ctx *parser.PrintStmtContext) interface{} {

	fmt.Println("🔍 Visitando PrintStmt22:", ctx.GetText())
	fmt.Println("---------------------- Print", ctx.GetText())

	// Total de expresiones
	exprs := ctx.AllExpresion()

	// Lista de resultados para imprimir
	resultados := []string{}

	for _, expr := range exprs {
		result := v.Visit(expr)
		if result == nil {
			v.ErrorTable.NewSemanticError(expr.GetStart(), "Expresión vacía dentro de print")
			continue
		}

		val, ok := result.(value.IVOR)
		if !ok {
			v.ErrorTable.NewSemanticError(expr.GetStart(), "La expresión no devuelve un valor válido")
			continue
		}

		// Convertir el valor a string y agregar a resultados
		text := fmt.Sprintf("%v", val.Value())
		resultados = append(resultados, text)
	}

	// Unir con espacios y enviar a la consola
	finalOutput := strings.Join(resultados, " ")
	v.Console.Println(finalOutput)

	return nil
}

func (v *ReplVisitor) VisitPrintlnStmt(ctx *parser.PrintlnStmtContext) interface{} {
	fmt.Println("🔍 Visitando PrintlnStmt22:", ctx.GetText())

	// Obtener todas las expresiones
	exprs := ctx.AllExpresion()
	if len(exprs) == 0 {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Println sin argumentos")
		return nil
	}

	// Construir el resultado concatenando todos los argumentos
	var result strings.Builder
	for i, expr := range exprs {
		if i > 0 {
			result.WriteString(" ")
		}

		val := v.Visit(expr)
		if val == nil {
			continue
		}

		if ivor, ok := val.(value.IVOR); ok {
			result.WriteString(fmt.Sprintf("%v", ivor.Value()))
		} else {
			result.WriteString(fmt.Sprintf("%v", val))
		}
	}

	// Imprimir el resultado
	output := result.String()
	v.Console.Println(output)
	fmt.Println("🔔 Imprimiendo valor2:", output)
	return nil
}

// VisitIfStmt(ctx *IfStmtContext) interface{}
func (v *ReplVisitor) VisitIfStmt(ctx *parser.IfStmtContext) interface{} {

	fmt.Println(("----- parte donde se ejefuta el If "))
	fmt.Println("🔍 Visitando IfStmt:", ctx.GetText())
	executed := false

	for _, ifChain := range ctx.AllIf_chain() {
		condition := v.Visit(ifChain).(value.IVOR)

		// Verificar que la condición sea booleana
		if condition.Type() != value.IVOR_BOOL {
			v.ErrorTable.NewSemanticError(ifChain.GetStart(), "La condición del if debe ser booleana")
			continue
		}

		// Si la condición es verdadera, ejecutar el bloque
		if condition.Value().(bool) {
			executed = true
			break
		}
	}

	// 2. Si ninguna condición se cumplió y hay else, ejecutarlo
	if !executed && ctx.Else_stmt() != nil {
		v.Visit(ctx.Else_stmt())
	}

	return nil
}

func (v *ReplVisitor) VisitIfChain(ctx *parser.IfChainContext) interface{} {
	fmt.Println("🔍 Visitando IfChain:", ctx.GetText())
	// Evaluar la expresión condicional
	exprResult := v.Visit(ctx.Expresion())

	// Verificar que sea un IVOR
	ivor, ok := exprResult.(value.IVOR)
	if !ok {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "La condición del if debe evaluar a un valor booleano")
		return &value.BoolValue{InternalValue: false}
	}

	// Verificar que sea de tipo booleano
	if ivor.Type() != value.IVOR_BOOL {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Se esperaba un valor booleano en la condición")
		return &value.BoolValue{InternalValue: false}
	}

	// Si la condición es verdadera, ejecutar el bloque
	if ivor.Value().(bool) {
		v.ScopeTrace.PushScope("if")
		for _, stmt := range ctx.AllStmt() {
			v.Visit(stmt)
		}
		v.ScopeTrace.PopScope()
		return &value.BoolValue{InternalValue: true}
	}

	return &value.BoolValue{InternalValue: false}
}

func (v *ReplVisitor) VisitElseStmt(ctx *parser.ElseStmtContext) interface{} {
	v.ScopeTrace.PushScope("else")
	for _, stmt := range ctx.AllStmt() {
		v.Visit(stmt)
	}
	v.ScopeTrace.PopScope()
	return nil
}

// -------DECLARACION DE VARIABLES SIN TIPO
func (v *ReplVisitor) VisitValueDeclAssign(ctx *parser.DeclAssignContext) interface{} {
	fmt.Println("----****** DECLARANDO VARIABLES CON MULT ******* ----")

	/*
		Cuando declaramos una variable tenemos que

		2. Saber el nombre de la variable
		3. Saber el valor de la variable (Depende, si solo la declaramos)
		mut

	*/
	// verificamos si es una constante

	// isConst := isDeclConst(ctx.Var_type().GetText())
	fmt.Println("🔍 Visitando DeclAssign:", ctx.GetText())
	varName := ctx.ID().GetText()
	varValue := v.Visit(ctx.Expresion()).(value.IVOR)
	varType := varValue.Type()

	if varType == "[]" {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "No se puede inferir el tipo de un vector vacio '"+varName+"'")
		return nil
	}

	// copy object
	// if obj, ok := varValue.(*ObjectValue); ok {
	// 	varValue = obj.Copy()
	// }

	// if IsVectorType(varValue.Type()) {
	// 	varValue = varValue.Copy()
	// }

	variable, msg := v.ScopeTrace.AddVariable(varName, varType, varValue, false, false, ctx.GetStart())
	/*

	   fn main() {
	   // entorno padre

	   x = 6
	   while (true){
	    x = 5
	   }
	   while (true){
	   x = 6
	   }
	   }

	*/
	// Variable already exists
	if variable == nil {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
	}
	return nil
}

// Declaracion de variable con tipo
func (v *ReplVisitor) VisitDeclAssignType(ctx *parser.DeclAssignTypeContext) interface{} {
	fmt.Println("**** Declarando var tipo mut ***")
	/*
	* 1. Obtener el nombre de la variable
	* 2. Obtene el tipo de la variable
	* 3. Obtener el valor de la variable
	 */
	fmt.Println("9-*-*-*-*-**-**- ", ctx.Id_pattern().GetText(), " -", ctx.Var_type().GetText(), " - ", ctx.Expresion().GetText())
	varName := ctx.Id_pattern().GetText()

	varValue := v.Visit(ctx.Expresion()).(value.IVOR)
	varType := varValue.Type()

	fmt.Println("-*-*-*-///*/-*-*-9-**- ", &varValue)

	if varValue == nil {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Expresión vacía dentro de declaración de variable")
		return nil
	}
	/*
		switch varType {
		case "int":
			varValue = value.IntValue{0}
		case "float":
			varValue = value.FloatValue{0.0}

		case "string":
			varValue = value.StringValue{""}
		case "bool":
			varValue = value.BoolValue{InternalValue: false}
		default:
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo desconocido: "+varType)
			return nil
		}

		/*
			// Verificar si el tipo es válido
			if !v.ValidType(varType) {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo '"+varType+"' no válido")
				return nil
			}*/
	// Verificar si el tipo de valor coincide con el tipo declarado
	/*if !varValue.Type(varType) {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "El valor '"+varValue.Value()+"' no es del tipo '"+varType+"'")
		return nil
	}*/
	// Agregar la variable al ScopeTrace
	variable, msg := v.ScopeTrace.AddVariable(varName, varType, varValue, false, false, ctx.GetStart())
	//variable, msg := v.ScopeTrace.AddVariable(varName, varType, varValue, false, false, ctx.GetStart())
	fmt.Println("Variable agregada:", varName, "de tipo:", varType, "con valor:", varValue.Value())
	// Variable already exists
	if variable == nil {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
		return nil
	}

	return nil
}

/*


Devolvemos el valor de la expresion en este caso es el tope,
es un entero asi que solamente tomaremos lo que nos da el usuario
y lo convertiremos a un entero

*/

// el hijo de valorexpresioncontext -> valorEnter | valorBooleano |

func (v *ReplVisitor) VisitValorEntero(ctx *parser.ValorEnteroContext) interface{} {

	fmt.Println("🔍 Visitando ValorEntero:", ctx.GetText())

	intVal, _ := strconv.Atoi(ctx.GetText())

	return &value.IntValue{
		InternalValue: intVal,
	}

}

// Manejar Floats
func (v *ReplVisitor) VisitValorFloat(ctx *parser.ValorFloatContext) interface{} {

	floatVal, _ := strconv.ParseFloat(ctx.GetText(), 64)

	return &value.FloatValue{
		InternalValue: floatVal,
	}

}
func (v *ReplVisitor) VisitIdPattern(ctx *parser.IdContext) interface{} {
	// hay que ir a buscar el Id a el entorno
	return ctx.GetText()
}

func (v *ReplVisitor) VisitCorchetesexpre(ctx *parser.CorchetesexpreContext) interface{} {

	return v.Visit(ctx.Expresion())
}

// Suma Re

func (v *ReplVisitor) VisitId(ctx *parser.IdContext) interface{} {
	id := ctx.ID().GetText()
	// TODO: buscar variable en entorno
	fmt.Println("Accediendo a variable:", id)
	// debemos buscar la variable en el ScopeTrace
	variable := v.ScopeTrace.GetVariable(id)
	if variable == nil {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable '"+id+"' no encontrada")
		return nil
	} else {
		// Si la variable existe, devolvemos su valor
		fmt.Println("Variable encontrada:", id, "con valor:", variable.Value)
		return variable.Value
	}
}

func (v *ReplVisitor) VisitIncredecr(ctx *parser.IncredecrContext) interface{} {
	return v.Visit(ctx.Incredecre())
}

func (v *ReplVisitor) VisitExpdotexp1(ctx *parser.Expdotexp1Context) interface{} {
	left := ctx.ID(0).GetText()
	right := ctx.ID(1).GetText()
	// TODO: acceder a campo estructurado: ID.ID
	fmt.Println("Accediendo a campo estructurado:", left, ".", right)
	return nil
}

func (v *ReplVisitor) VisitExpdotexp(ctx *parser.ExpdotexpContext) interface{} {
	id := ctx.ID().GetText()
	expr := v.Visit(ctx.Expresion())
	// TODO: ID.EXPR, posiblemente array o campo dinámico
	fmt.Println("Accediendo a campo dinámico:", id, "con expresión:", expr)
	return nil
}

func (v *ReplVisitor) VisitAsignacionfor(ctx *parser.AsignacionforContext) interface{} {
	id := ctx.ID().GetText()
	expr := v.Visit(ctx.Expresion())
	fmt.Println("Asignando valor a variable:", id, "con expresión:", expr)
	// TODO: asignar expr a id
	return nil
}

func (v *ReplVisitor) VisitValorDecimal(ctx *parser.ValorDecimalContext) interface{} {
	text := ctx.DECIMAL().GetText()
	val, err := strconv.ParseFloat(text, 64)
	if err != nil {
		// Manejo de error
		// mandamos el error a ErrorTable
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Expresión vacía dentro de paréntesis")
		log.Printf("Error al convertir '%s' a decimal: %v", text, err)
		return nil
	}
	return &value.FloatValue{
		InternalValue: val,
	}
}

func (v *ReplVisitor) VisitValorCadena(ctx *parser.ValorCadenaContext) interface{} {
	stringVal := ctx.GetText()[1 : len(ctx.GetText())-1]

	stringVal = strings.ReplaceAll(stringVal, "\\\"", "\"")
	stringVal = strings.ReplaceAll(stringVal, "\\\\", "\\")
	stringVal = strings.ReplaceAll(stringVal, "\\n", "\n")
	stringVal = strings.ReplaceAll(stringVal, "\\r", "\r")

	// si es un caracter -> solamente un char
	if len(stringVal) == 1 {
		return &value.CharacterValue{
			InternalValue: stringVal,
		}
	}

	return &value.StringValue{
		InternalValue: stringVal,
	}
}

func (v *ReplVisitor) VisitValorBooleano(ctx *parser.ValorBooleanoContext) interface{} {
	text := ctx.BOOLEANO().GetText()
	// vemos si es true o false y devolvemos eso
	// si es true entonces devolvemos un valor booleano
	if text == "true" {
		return &value.BoolValue{
			InternalValue: true,
		}
	}
	if text == "false" {
		return &value.BoolValue{
			InternalValue: false,
		}
	}
	return nil
}

func (v *ReplVisitor) VisitValorCaracter(ctx *parser.ValorCaracterContext) interface{} {
	text := ctx.CARACTER().GetText()
	// Suponiendo que vienen entre comillas simples: 'a'
	if len(text) >= 3 {
		char := text[1 : len(text)-1]
		return &value.CharacterValue{
			InternalValue: char,
		}
	}
	return nil
}

/*
Ahora haremos la seccion de las expresiones binarias completa
en esta seccion haremos uso de un strategy, el cual
explicare en la clase del dia LUNES
*/
func (v *ReplVisitor) VisitBinaryExp(ctx *parser.BinaryExpContext) interface{} {

	op := ctx.GetOp().GetText()
	left := v.Visit(ctx.GetLeft()).(value.IVOR)
	// Verificamos si hay una estrategia de retorno anticipado para este operador
	earlyCheck, ok := EarlyReturnStrats[op]

	if ok {
		ok, _, result := earlyCheck.Validate(left)

		if ok {
			return result
		}
	}

	right := v.Visit(ctx.GetRight()).(value.IVOR)

	/*
			Aqui es donde sucede la magia, buscamos el operador
			y haciendo uso de un strategy pattern, validamos
			y ejecutamos la operacion de manera dinamica
		Si el operador no existe, lanzamos un error
		Si el operador existe, validamos los tipos de datos
	*/
	strat, ok := BinaryStrats[op]

	if !ok {
		log.Fatal("Binary operator not found")
	}

	ok, msg, result := strat.Validate(left, right)

	if !ok {
		v.ErrorTable.NewSemanticError(ctx.GetOp(), msg)
		return value.DefaultNilValue
	}

	return result
}

//llamadas a funciones

func (v *ReplVisitor) VisitFuncCall(ctx *compiler.FuncCallContext) interface{} {

	// find if its a func or constructor of a struct

	canditateName := v.Visit(ctx.Id_pattern()).(string)
	funcObj, msg1 := v.ScopeTrace.GetFunction(canditateName)
	structObj, msg2 := v.ScopeTrace.GlobalScope.GetStruct(canditateName)

	if funcObj == nil && structObj == nil {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), msg1+msg2)
		return value.DefaultNilValue
	}

	args := make([]*Argument, 0)
	if ctx.Parametros() != nil {
		args = v.Visit(ctx.Parametros()).([]*Argument)
	}

	// struct has priority over func
	if structObj != nil {

		switch funcObj := funcObj.(type) {
		case *BuiltInFunction:
			returnValue, ok, msg := funcObj.Exec(v.GetReplContext(), args)

			if !ok {

				if msg != "" {
					v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
				}

				return value.DefaultNilValue

			}

			return returnValue

		case *Function:
			funcObj.Exec(v, args, ctx.GetStart())
			return funcObj.ReturnValue

		// case *ObjectBuiltInFunction:
		// 	funcObj.Exec(v, args, ctx.GetStart())
		// 	return funcObj.ReturnValue

		default:
			log.Fatal("Function type not found")
		}

		return value.DefaultNilValue
	}
	return nil
}

func (v *ReplVisitor) VisitIncremento(ctx *compiler.IncrementoContext) interface{} {
	varname := ctx.ID().GetText()
	variable := v.ScopeTrace.GetVariable(varname)
	if variable == nil {

		fmt.Println("NO existe la variable")
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable "+varname+" no encontrada")
	} else {
		fmt.Println(variable.Value, variable.Type, " &/&%%&//((&/(&(/)/)%%$###$%?==))((/&/&%%$$$$###))")
		if variable.Type == "Int" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(int)
			valorNew := valorActual + 1

			// Crea el nuevo valor como IVOR
			valorActual1 := value.IntValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else if variable.Type == "Float" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(float64)
			valorNew := valorActual + 1.0

			valorActual1 := value.FloatValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else {
			fmt.Println("Error semantico")
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo "+variable.Type+" tipo de dato incompatible con esta operación")

		}
	}

	return nil
}

func (v *ReplVisitor) VisitIncremento2(ctx *compiler.Incremento2Context) interface{} {

	varname := ctx.ID().GetText()
	variable := v.ScopeTrace.GetVariable(varname)
	varValor := v.Visit(ctx.Expresion()).(value.IVOR)
	if variable == nil {

		fmt.Println("NO existe la variable")
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable "+varname+" no encontrada")
	} else {
		fmt.Println(variable.Value, variable.Type, " &/&%%&//((&/(&(/)/)%%$###$%?==))((/&/&%%$$$$###))")
		if variable.Type == "Int" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(int)
			valorNew := valorActual + varValor.Value().(int)

			// Crea el nuevo valor como IVOR
			valorActual1 := value.IntValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else if variable.Type == "Float" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(float64)
			valorNew := valorActual + varValor.Value().(float64)

			valorActual1 := value.FloatValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else {
			fmt.Println("Error semantico")
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo "+variable.Type+" tipo de dato incompatible con esta operación")

		}
	}

	return nil
}

// ------>> Decremento
func (v *ReplVisitor) VisitDecremento(ctx *compiler.DecrementoContext) interface{} {
	varname := ctx.ID().GetText()
	variable := v.ScopeTrace.GetVariable(varname)
	if variable == nil {

		fmt.Println("NO existe la variable")
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable "+varname+" no encontrada")
	} else {
		fmt.Println(variable.Value, variable.Type, " &/&%%&//((&/(&(/)/)%%$###$%?==))((/&/&%%$$$$###))")
		if variable.Type == "Int" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(int)
			valorNew := valorActual - 1

			// Crea el nuevo valor como IVOR
			valorActual1 := value.IntValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else if variable.Type == "Float" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(float64)
			valorNew := valorActual - 1.0

			valorActual1 := value.FloatValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else {
			fmt.Println("Error semantico")
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo "+variable.Type+" tipo de dato incompatible con esta operación")

		}
	}

	return nil
}

// decremento x-= exp
func (v *ReplVisitor) VisitDecremento2(ctx *compiler.Decremento2Context) interface{} {

	varname := ctx.ID().GetText()
	variable := v.ScopeTrace.GetVariable(varname)
	varValor := v.Visit(ctx.Expresion()).(value.IVOR)
	if variable == nil {

		fmt.Println("NO existe la variable")
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Variable "+varname+" no encontrada")
	} else {
		fmt.Println(variable.Value, variable.Type, " &/&%%&//((&/(&(/)/)%%$###$%?==))((/&/&%%$$$$###))")
		if variable.Type == "Int" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(int)
			valorNew := valorActual - varValor.Value().(int)

			// Crea el nuevo valor como IVOR
			valorActual1 := value.IntValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else if variable.Type == "Float" {
			fmt.Println("se puede sumar")

			valorActual := variable.Value.Value().(float64)
			valorNew := valorActual - varValor.Value().(float64)

			valorActual1 := value.FloatValue{InternalValue: valorNew}

			// Asigna el nuevo valor
			ok, msg := variable.Assign(&valorActual1, true) // ¡OJO! necesitas pasar un *puntero*
			if !ok {
				v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
			}

		} else {
			fmt.Println("Error semantico")
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "Tipo "+variable.Type+" tipo de dato incompatible con esta operación")

		}
	}
	return nil
}

// Operacion Unario
func (v *ReplVisitor) VisitUnario(ctx *compiler.UnarioContext) interface{} {

	fmt.Println("----- Entrando a unario")

	// obtener el ope y  valor
	op := ctx.GetOp().GetText()
	exprValue := v.Visit(ctx.Expresion())

	varValue, ok := exprValue.(value.IVOR)
	if !ok {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Expresión inválida en operación unaria")
		return nil
	}

	fmt.Println("Operador unario:", op, "Valor:", varValue)

	// verificamos que operador se va usar
	strategy, exists := UnaryStrats[op]
	if !exists {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Operador unario '"+op+"' no soportado")
		return nil
	}

	// operamos
	success, msg, result := strategy.Validate(varValue)
	if !success {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), msg)
		return nil
	}

	return result

}

func (v *ReplVisitor) VisitParentesisexpre(ctx *compiler.ParentesisexpreContext) interface{} {

	fmt.Println("Entrando a Parentesis")
	return v.Visit(ctx.Expresion())

}

func (v *ReplVisitor) VisitWhileStmt(ctx *parser.WhileStmtContext) interface{} {
	fmt.Println("entrando al foor while *-*-*-****-*-*-*")

	//varname := ctx.().GetText()
	//variable := v.ScopeTrace.GetVariable(varname)
	//varValor := v.Visit(ctx.Expresion()).(value.IVOR)

	//fmt.Println(varValor, " 8888888888888888888888888888888888")
	// Crear un nuevo scope para el while
	v.ScopeTrace.PushScope("while")
	defer v.ScopeTrace.PopScope()

	for {
		// 1. Evaluar la condición
		condition := v.Visit(ctx.Expresion())
		condValue, ok := condition.(value.IVOR)

		// Verificar que la condición sea válida
		if !ok {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "La condición del while debe evaluar a un valor")
			break
		}

		// Verificar que sea booleana
		if condValue.Type() != value.IVOR_BOOL {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "La condición del while debe ser booleana")
			break
		}

		// 2. Si la condición es falsa, salir del bucle
		if !condValue.Value().(bool) {
			break
		}

		// 3. Ejecutar el cuerpo del while
		for _, stmt := range ctx.AllStmt() {
			v.Visit(stmt)

			// Opcional: Puedes agregar un chequeo para break/continue aquí
		}
	}

	return nil
}

func (v *ReplVisitor) VisitClasicFor(ctx *compiler.ClasicForContext) interface{} {
	fmt.Println("🔍 Visitando ForStmt clasico:", ctx.GetText())

	// 1. Ejecutar la asignación inicial (i = 0)
	v.Visit(ctx.Assign_stmt())

	// Crear un nuevo scope para el for
	v.ScopeTrace.PushScope("for")
	defer v.ScopeTrace.PopScope()

	loopCount := 0
	maxLoops := 100000 // Límite para evitar bucles infinitos

	for loopCount < maxLoops {
		loopCount++

		// 2. Evaluar la condición (i < 5)
		condition := v.Visit(ctx.Expresion())
		condValue, ok := condition.(value.IVOR)

		if !ok {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "La condición del for debe evaluar a un valor")
			break
		}

		// Verificar que sea booleana
		if condValue.Type() != value.IVOR_BOOL {
			v.ErrorTable.NewSemanticError(ctx.GetStart(), "La condición del for debe ser booleana")
			break
		}

		// Si la condición es falsa, salir del bucle
		if !condValue.Value().(bool) {
			break
		}

		// 3. Ejecutar el cuerpo del for
		for _, stmt := range ctx.AllStmt() {
			v.Visit(stmt)
		}

		// 4. Ejecutar el incremento (i++)
		v.Visit(ctx.Incredecre())
	}

	if loopCount >= maxLoops {
		v.ErrorTable.NewSemanticError(ctx.GetStart(), "Bucle for excedió el máximo de iteraciones")
	}

	return nil
}

func (v *ReplVisitor) VisitForStmt(ctx *compiler.ForStmtContext) interface{} {
	return nil
}
