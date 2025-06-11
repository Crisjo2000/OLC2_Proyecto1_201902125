// Generated from /home/christian/Documentos/ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 2/LABORATORIO/OLC2_Proyecto1_201902125/compiler/parser/Vlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VlangParser}.
 */
public interface VlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VlangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(VlangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VlangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(VlangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VlangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VlangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VlangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VlangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link VlangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(VlangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link VlangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(VlangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfChain}
	 * labeled alternative in {@link VlangParser#if_chain}.
	 * @param ctx the parse tree
	 */
	void enterIfChain(VlangParser.IfChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfChain}
	 * labeled alternative in {@link VlangParser#if_chain}.
	 * @param ctx the parse tree
	 */
	void exitIfChain(VlangParser.IfChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link VlangParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(VlangParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link VlangParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(VlangParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintlnStmt}
	 * labeled alternative in {@link VlangParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStmt(VlangParser.PrintlnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintlnStmt}
	 * labeled alternative in {@link VlangParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStmt(VlangParser.PrintlnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link VlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(VlangParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link VlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(VlangParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link VlangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(VlangParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link VlangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(VlangParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link VlangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(VlangParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link VlangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(VlangParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericRange}
	 * labeled alternative in {@link VlangParser#range}.
	 * @param ctx the parse tree
	 */
	void enterNumericRange(VlangParser.NumericRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericRange}
	 * labeled alternative in {@link VlangParser#range}.
	 * @param ctx the parse tree
	 */
	void exitNumericRange(VlangParser.NumericRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(VlangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(VlangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(VlangParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(VlangParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(VlangParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link VlangParser#transfer_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(VlangParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectAssign}
	 * labeled alternative in {@link VlangParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDirectAssign(VlangParser.DirectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectAssign}
	 * labeled alternative in {@link VlangParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDirectAssign(VlangParser.DirectAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclAssign}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclAssign(VlangParser.DeclAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclAssign}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclAssign(VlangParser.DeclAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclAssignPattern}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclAssignPattern(VlangParser.DeclAssignPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclAssignPattern}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclAssignPattern(VlangParser.DeclAssignPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclPattern}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclPattern(VlangParser.DeclPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclPattern}
	 * labeled alternative in {@link VlangParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclPattern(VlangParser.DeclPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdPattern}
	 * labeled alternative in {@link VlangParser#id_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdPattern(VlangParser.IdPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdPattern}
	 * labeled alternative in {@link VlangParser#id_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdPattern(VlangParser.IdPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code corchetesexpre}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCorchetesexpre(VlangParser.CorchetesexpreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code corchetesexpre}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCorchetesexpre(VlangParser.CorchetesexpreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unario}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterUnario(VlangParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unario}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitUnario(VlangParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesisexpre}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesisexpre(VlangParser.ParentesisexpreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesisexpre}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesisexpre(VlangParser.ParentesisexpreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incredecr}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIncredecr(VlangParser.IncredecrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incredecr}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIncredecr(VlangParser.IncredecrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorexpresion}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterValorexpresion(VlangParser.ValorexpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorexpresion}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitValorexpresion(VlangParser.ValorexpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignacionfor}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionfor(VlangParser.AsignacionforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignacionfor}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionfor(VlangParser.AsignacionforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterId(VlangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitId(VlangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expdotexp1}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpdotexp1(VlangParser.Expdotexp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expdotexp1}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpdotexp1(VlangParser.Expdotexp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expdotexp}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpdotexp(VlangParser.ExpdotexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expdotexp}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpdotexp(VlangParser.ExpdotexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(VlangParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link VlangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(VlangParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VlangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(VlangParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VlangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(VlangParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VlangParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(VlangParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link VlangParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(VlangParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorEntero}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorEntero(VlangParser.ValorEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorEntero}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorEntero(VlangParser.ValorEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorDecimal}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorDecimal(VlangParser.ValorDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorDecimal}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorDecimal(VlangParser.ValorDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorCadena}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorCadena(VlangParser.ValorCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorCadena}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorCadena(VlangParser.ValorCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorBooleano}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorBooleano(VlangParser.ValorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorBooleano}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorBooleano(VlangParser.ValorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorCaracter}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorCaracter(VlangParser.ValorCaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorCaracter}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorCaracter(VlangParser.ValorCaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorFloat}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValorFloat(VlangParser.ValorFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorFloat}
	 * labeled alternative in {@link VlangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValorFloat(VlangParser.ValorFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incremento}
	 * labeled alternative in {@link VlangParser#incredecre}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(VlangParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incremento}
	 * labeled alternative in {@link VlangParser#incredecre}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(VlangParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decremento}
	 * labeled alternative in {@link VlangParser#incredecre}.
	 * @param ctx the parse tree
	 */
	void enterDecremento(VlangParser.DecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decremento}
	 * labeled alternative in {@link VlangParser#incredecre}.
	 * @param ctx the parse tree
	 */
	void exitDecremento(VlangParser.DecrementoContext ctx);
}