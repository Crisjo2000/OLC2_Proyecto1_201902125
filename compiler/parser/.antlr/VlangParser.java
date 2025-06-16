// Generated from /home/christian/Documentos/ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 2/LABORATORIO/OLC2_Proyecto1_201902125/compiler/parser/Vlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		LEN=10, CAP=11, APPEND=12, MUT=13, BOOLEANO=14, ENTERO=15, FLOAT=16, DECIMAL=17, 
		CADENA=18, CARACTER=19, IF_KW=20, ELSE_KW=21, WHILE_KW=22, FOR_KW=23, 
		IN_KW=24, RETURN_KW=25, SWITCH_KW=26, CASE_KW=27, DEFAULT=28, BREAK_KW=29, 
		CONTINUE_KW=30, FN_KW=31, MAIN_KW=32, PLUS=33, MINUS=34, MUL=35, DIV=36, 
		MOD=37, NOT=38, OR=39, AND=40, EQ=41, NEQ=42, LT=43, LE=44, GT=45, GE=46, 
		ASSIGN=47, INC=48, DEC=49, INC2=50, DEC2=51, COLON=52, PYC=53, LPAREN=54, 
		RPAREN=55, LBRACK=56, LCOR=57, RBRACK=58, RCOR=59, DOT=60, COMMA=61, ID=62, 
		WS=63, LINE_COMMENT=64, BLOCK_COMMENT=65;
	public static final int
		RULE_programa = 0, RULE_stmt = 1, RULE_if_stmt = 2, RULE_if_chain = 3, 
		RULE_else_stmt = 4, RULE_println = 5, RULE_print = 6, RULE_forwhile_stmt = 7, 
		RULE_forClasic_stmt = 8, RULE_for_stmt = 9, RULE_range = 10, RULE_switch_stmt = 11, 
		RULE_case_clause = 12, RULE_default_clause = 13, RULE_func_call = 14, 
		RULE_func_dcl = 15, RULE_struct_dcl = 16, RULE_transfer_stmt = 17, RULE_assign_stmt = 18, 
		RULE_decl_stmt = 19, RULE_list_expresiones = 20, RULE_id_pattern = 21, 
		RULE_expresion = 22, RULE_parametros = 23, RULE_func_param = 24, RULE_arg_list = 25, 
		RULE_func_arg = 26, RULE_valores = 27, RULE_valor = 28, RULE_strct_instancia = 29, 
		RULE_struct_prop = 30, RULE_var_type = 31, RULE_struct_vector = 32, RULE_incredecre = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "stmt", "if_stmt", "if_chain", "else_stmt", "println", "print", 
			"forwhile_stmt", "forClasic_stmt", "for_stmt", "range", "switch_stmt", 
			"case_clause", "default_clause", "func_call", "func_dcl", "struct_dcl", 
			"transfer_stmt", "assign_stmt", "decl_stmt", "list_expresiones", "id_pattern", 
			"expresion", "parametros", "func_param", "arg_list", "func_arg", "valores", 
			"valor", "strct_instancia", "struct_prop", "var_type", "struct_vector", 
			"incredecre"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'print'", "'struct'", "'int'", "'float'", "'string'", 
			"'bool'", "'char'", "'void'", "'len'", "'cap'", "'append'", "'mut'", 
			null, null, null, null, null, null, "'if'", "'else'", "'while'", "'for'", 
			"'in'", "'return'", "'switch'", "'case'", "'default'", "'break'", "'continue'", 
			"'fn'", "'main'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'||'", "'&&'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'='", "'++'", "'--'", 
			"'+='", "'-='", "':'", "';'", "'('", "')'", "'['", "'{'", "']'", "'}'", 
			"'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "LEN", "CAP", 
			"APPEND", "MUT", "BOOLEANO", "ENTERO", "FLOAT", "DECIMAL", "CADENA", 
			"CARACTER", "IF_KW", "ELSE_KW", "WHILE_KW", "FOR_KW", "IN_KW", "RETURN_KW", 
			"SWITCH_KW", "CASE_KW", "DEFAULT", "BREAK_KW", "CONTINUE_KW", "FN_KW", 
			"MAIN_KW", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NOT", "OR", "AND", 
			"EQ", "NEQ", "LT", "LE", "GT", "GE", "ASSIGN", "INC", "DEC", "INC2", 
			"DEC2", "COLON", "PYC", "LPAREN", "RPAREN", "LBRACK", "LCOR", "RBRACK", 
			"RCOR", "DOT", "COMMA", "ID", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Vlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VlangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				stmt();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0) );
			setState(73);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Decl_stmtContext decl_stmt() {
			return getRuleContext(Decl_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_dclContext func_dcl() {
			return getRuleContext(Func_dclContext.class,0);
		}
		public Struct_dclContext struct_dcl() {
			return getRuleContext(Struct_dclContext.class,0);
		}
		public Strct_instanciaContext strct_instancia() {
			return getRuleContext(Strct_instanciaContext.class,0);
		}
		public Transfer_stmtContext transfer_stmt() {
			return getRuleContext(Transfer_stmtContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IncredecreContext incredecre() {
			return getRuleContext(IncredecreContext.class,0);
		}
		public Forwhile_stmtContext forwhile_stmt() {
			return getRuleContext(Forwhile_stmtContext.class,0);
		}
		public ForClasic_stmtContext forClasic_stmt() {
			return getRuleContext(ForClasic_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				decl_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				func_dcl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				struct_dcl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				strct_instancia();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				transfer_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				println();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(86);
				incredecre();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(87);
				forwhile_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(88);
				forClasic_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(89);
				switch_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	 
		public If_stmtContext() { }
		public void copyFrom(If_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends If_stmtContext {
		public List<If_chainContext> if_chain() {
			return getRuleContexts(If_chainContext.class);
		}
		public If_chainContext if_chain(int i) {
			return getRuleContext(If_chainContext.class,i);
		}
		public List<TerminalNode> ELSE_KW() { return getTokens(VlangParser.ELSE_KW); }
		public TerminalNode ELSE_KW(int i) {
			return getToken(VlangParser.ELSE_KW, i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public IfStmtContext(If_stmtContext ctx) { copyFrom(ctx); }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			if_chain();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					match(ELSE_KW);
					setState(94);
					if_chain();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(100);
				else_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_chainContext extends ParserRuleContext {
		public If_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_chain; }
	 
		public If_chainContext() { }
		public void copyFrom(If_chainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfChainContext extends If_chainContext {
		public TerminalNode IF_KW() { return getToken(VlangParser.IF_KW, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfChainContext(If_chainContext ctx) { copyFrom(ctx); }
	}

	public final If_chainContext if_chain() throws RecognitionException {
		If_chainContext _localctx = new If_chainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_chain);
		int _la;
		try {
			_localctx = new IfChainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF_KW);
			setState(104);
			expresion(0);
			setState(105);
			match(LCOR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(106);
				stmt();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_stmtContext extends ParserRuleContext {
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
	 
		public Else_stmtContext() { }
		public void copyFrom(Else_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmtContext extends Else_stmtContext {
		public TerminalNode ELSE_KW() { return getToken(VlangParser.ELSE_KW, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(Else_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_stmt);
		int _la;
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ELSE_KW);
			setState(115);
			match(LCOR);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(116);
				stmt();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnStmtContext extends PrintlnContext {
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public PrintlnStmtContext(PrintlnContext ctx) { copyFrom(ctx); }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_println);
		int _la;
		try {
			_localctx = new PrintlnStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__0);
			setState(125);
			match(LPAREN);
			setState(126);
			expresion(0);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				expresion(0);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends PrintContext {
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public PrintStmtContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		int _la;
		try {
			_localctx = new PrintStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__1);
			setState(137);
			match(LPAREN);
			setState(138);
			expresion(0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				expresion(0);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Forwhile_stmtContext extends ParserRuleContext {
		public Forwhile_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwhile_stmt; }
	 
		public Forwhile_stmtContext() { }
		public void copyFrom(Forwhile_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends Forwhile_stmtContext {
		public TerminalNode FOR_KW() { return getToken(VlangParser.FOR_KW, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhileStmtContext(Forwhile_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Forwhile_stmtContext forwhile_stmt() throws RecognitionException {
		Forwhile_stmtContext _localctx = new Forwhile_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forwhile_stmt);
		int _la;
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOR_KW);
			setState(149);
			expresion(0);
			setState(150);
			match(LCOR);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(151);
				stmt();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClasic_stmtContext extends ParserRuleContext {
		public ForClasic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClasic_stmt; }
	 
		public ForClasic_stmtContext() { }
		public void copyFrom(ForClasic_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClasicForContext extends ForClasic_stmtContext {
		public TerminalNode FOR_KW() { return getToken(VlangParser.FOR_KW, 0); }
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(VlangParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(VlangParser.PYC, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IncredecreContext incredecre() {
			return getRuleContext(IncredecreContext.class,0);
		}
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ClasicForContext(ForClasic_stmtContext ctx) { copyFrom(ctx); }
	}

	public final ForClasic_stmtContext forClasic_stmt() throws RecognitionException {
		ForClasic_stmtContext _localctx = new ForClasic_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forClasic_stmt);
		int _la;
		try {
			_localctx = new ClasicForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR_KW);
			setState(160);
			assign_stmt();
			setState(161);
			match(PYC);
			setState(162);
			expresion(0);
			setState(163);
			match(PYC);
			setState(164);
			incredecre();
			setState(165);
			match(LCOR);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(166);
				stmt();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	 
		public For_stmtContext() { }
		public void copyFrom(For_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends For_stmtContext {
		public TerminalNode FOR_KW() { return getToken(VlangParser.FOR_KW, 0); }
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode IN_KW() { return getToken(VlangParser.IN_KW, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ForStmtContext(For_stmtContext ctx) { copyFrom(ctx); }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stmt);
		int _la;
		try {
			_localctx = new ForStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FOR_KW);
			setState(175);
			match(ID);
			setState(176);
			match(IN_KW);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(177);
				expresion(0);
				}
				break;
			case 2:
				{
				setState(178);
				range();
				}
				break;
			}
			setState(181);
			match(LCOR);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(182);
				stmt();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	 
		public RangeContext() { }
		public void copyFrom(RangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericRangeContext extends RangeContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(VlangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VlangParser.DOT, i);
		}
		public NumericRangeContext(RangeContext ctx) { copyFrom(ctx); }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range);
		try {
			_localctx = new NumericRangeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			expresion(0);
			setState(191);
			match(DOT);
			setState(192);
			match(DOT);
			setState(193);
			match(DOT);
			setState(194);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_stmtContext extends ParserRuleContext {
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
	 
		public Switch_stmtContext() { }
		public void copyFrom(Switch_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends Switch_stmtContext {
		public TerminalNode SWITCH_KW() { return getToken(VlangParser.SWITCH_KW, 0); }
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Default_clauseContext default_clause() {
			return getRuleContext(Default_clauseContext.class,0);
		}
		public SwitchStmtContext(Switch_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switch_stmt);
		int _la;
		try {
			_localctx = new SwitchStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(SWITCH_KW);
			setState(197);
			match(ID);
			setState(198);
			match(LCOR);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				case_clause();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE_KW );
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(204);
				default_clause();
				}
			}

			setState(207);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clauseContext extends ParserRuleContext {
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
	 
		public Case_clauseContext() { }
		public void copyFrom(Case_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseClauseContext extends Case_clauseContext {
		public TerminalNode CASE_KW() { return getToken(VlangParser.CASE_KW, 0); }
		public TerminalNode COLON() { return getToken(VlangParser.COLON, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public CaseClauseContext(Case_clauseContext ctx) { copyFrom(ctx); }
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_clause);
		int _la;
		try {
			_localctx = new CaseClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CASE_KW);
			{
			setState(210);
			expresion(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				expresion(0);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(218);
			match(COLON);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(219);
				stmt();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_clauseContext extends ParserRuleContext {
		public Default_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_clause; }
	 
		public Default_clauseContext() { }
		public void copyFrom(Default_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultClauseContext extends Default_clauseContext {
		public TerminalNode DEFAULT() { return getToken(VlangParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(VlangParser.COLON, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public DefaultClauseContext(Default_clauseContext ctx) { copyFrom(ctx); }
	}

	public final Default_clauseContext default_clause() throws RecognitionException {
		Default_clauseContext _localctx = new Default_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_default_clause);
		int _la;
		try {
			_localctx = new DefaultClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DEFAULT);
			setState(226);
			match(COLON);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(227);
				stmt();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends Func_callContext {
		public Id_patternContext id_pattern() {
			return getRuleContext(Id_patternContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncCallContext(Func_callContext ctx) { copyFrom(ctx); }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			id_pattern();
			setState(234);
			match(LPAREN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(235);
				parametros();
				}
			}

			setState(238);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_dclContext extends ParserRuleContext {
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
	 
		public Func_dclContext() { }
		public void copyFrom(Func_dclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends Func_dclContext {
		public TerminalNode FN_KW() { return getToken(VlangParser.FN_KW, 0); }
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FuncDeclContext(Func_dclContext ctx) { copyFrom(ctx); }
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_dcl);
		int _la;
		try {
			_localctx = new FuncDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(FN_KW);
			setState(241);
			match(ID);
			setState(242);
			match(LPAREN);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(243);
				arg_list();
				}
			}

			setState(246);
			match(RPAREN);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) {
				{
				setState(247);
				var_type();
				}
			}

			setState(250);
			match(LCOR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022295592974L) != 0)) {
				{
				{
				setState(251);
				stmt();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_dclContext extends ParserRuleContext {
		public Struct_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_dcl; }
	 
		public Struct_dclContext() { }
		public void copyFrom(Struct_dclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclContext extends Struct_dclContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<Assign_stmtContext> assign_stmt() {
			return getRuleContexts(Assign_stmtContext.class);
		}
		public Assign_stmtContext assign_stmt(int i) {
			return getRuleContext(Assign_stmtContext.class,i);
		}
		public StructDeclContext(Struct_dclContext ctx) { copyFrom(ctx); }
	}

	public final Struct_dclContext struct_dcl() throws RecognitionException {
		Struct_dclContext _localctx = new Struct_dclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct_dcl);
		int _la;
		try {
			_localctx = new StructDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__2);
			setState(260);
			match(ID);
			setState(261);
			match(LCOR);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(262);
				assign_stmt();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transfer_stmtContext extends ParserRuleContext {
		public Transfer_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transfer_stmt; }
	 
		public Transfer_stmtContext() { }
		public void copyFrom(Transfer_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends Transfer_stmtContext {
		public TerminalNode CONTINUE_KW() { return getToken(VlangParser.CONTINUE_KW, 0); }
		public ContinueStmtContext(Transfer_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends Transfer_stmtContext {
		public TerminalNode BREAK_KW() { return getToken(VlangParser.BREAK_KW, 0); }
		public BreakStmtContext(Transfer_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends Transfer_stmtContext {
		public TerminalNode RETURN_KW() { return getToken(VlangParser.RETURN_KW, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ReturnStmtContext(Transfer_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Transfer_stmtContext transfer_stmt() throws RecognitionException {
		Transfer_stmtContext _localctx = new Transfer_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_transfer_stmt);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN_KW:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(RETURN_KW);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(271);
					expresion(0);
					}
					break;
				}
				}
				break;
			case BREAK_KW:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(BREAK_KW);
				}
				break;
			case CONTINUE_KW:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(CONTINUE_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	 
		public Assign_stmtContext() { }
		public void copyFrom(Assign_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectAssignContext extends Assign_stmtContext {
		public Id_patternContext id_pattern() {
			return getRuleContext(Id_patternContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VlangParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DirectAssignContext(Assign_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_stmt);
		try {
			_localctx = new DirectAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			id_pattern();
			setState(279);
			match(ASSIGN);
			setState(280);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_stmtContext extends ParserRuleContext {
		public Decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_stmt; }
	 
		public Decl_stmtContext() { }
		public void copyFrom(Decl_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclAssignContext extends Decl_stmtContext {
		public TerminalNode MUT() { return getToken(VlangParser.MUT, 0); }
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(VlangParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclAssignContext(Decl_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceDeclInitContext extends Decl_stmtContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(VlangParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(VlangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(VlangParser.RBRACK, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public List_expresionesContext list_expresiones() {
			return getRuleContext(List_expresionesContext.class,0);
		}
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public TerminalNode PYC() { return getToken(VlangParser.PYC, 0); }
		public SliceDeclInitContext(Decl_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclAssignTypeContext extends Decl_stmtContext {
		public TerminalNode MUT() { return getToken(VlangParser.MUT, 0); }
		public Id_patternContext id_pattern() {
			return getRuleContext(Id_patternContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VlangParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclAssignTypeContext(Decl_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Decl_stmtContext decl_stmt() throws RecognitionException {
		Decl_stmtContext _localctx = new Decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decl_stmt);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new DeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(MUT);
				setState(283);
				match(ID);
				setState(284);
				match(ASSIGN);
				setState(285);
				expresion(0);
				}
				break;
			case 2:
				_localctx = new DeclAssignTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(MUT);
				setState(287);
				id_pattern();
				setState(288);
				var_type();
				setState(289);
				match(ASSIGN);
				setState(290);
				expresion(0);
				}
				break;
			case 3:
				_localctx = new SliceDeclInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(ID);
				setState(293);
				match(ASSIGN);
				setState(294);
				match(LBRACK);
				setState(295);
				match(RBRACK);
				setState(296);
				var_type();
				setState(297);
				match(LCOR);
				setState(298);
				list_expresiones();
				setState(299);
				match(RCOR);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PYC) {
					{
					setState(300);
					match(PYC);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_expresionesContext extends ParserRuleContext {
		public List_expresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expresiones; }
	 
		public List_expresionesContext() { }
		public void copyFrom(List_expresionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionsContext extends List_expresionesContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public ListExpressionsContext(List_expresionesContext ctx) { copyFrom(ctx); }
	}

	public final List_expresionesContext list_expresiones() throws RecognitionException {
		List_expresionesContext _localctx = new List_expresionesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_expresiones);
		int _la;
		try {
			_localctx = new ListExpressionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expresion(0);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				expresion(0);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_patternContext extends ParserRuleContext {
		public Id_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_pattern; }
	 
		public Id_patternContext() { }
		public void copyFrom(Id_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPatternContext extends Id_patternContext {
		public List<TerminalNode> ID() { return getTokens(VlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VlangParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VlangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VlangParser.DOT, i);
		}
		public IdPatternContext(Id_patternContext ctx) { copyFrom(ctx); }
	}

	public final Id_patternContext id_pattern() throws RecognitionException {
		Id_patternContext _localctx = new Id_patternContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_id_pattern);
		int _la;
		try {
			_localctx = new IdPatternContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(314);
				match(DOT);
				setState(315);
				match(ID);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CorchetesexpreContext extends ExpresionContext {
		public TerminalNode LBRACK() { return getToken(VlangParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(VlangParser.RBRACK, 0); }
		public CorchetesexpreContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncionexpreContext extends ExpresionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncionexpreContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends ExpresionContext {
		public Token op;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(VlangParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(VlangParser.MINUS, 0); }
		public UnarioContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisexpreContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public ParentesisexpreContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncredecrContext extends ExpresionContext {
		public IncredecreContext incredecre() {
			return getRuleContext(IncredecreContext.class,0);
		}
		public IncredecrContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorexpresionContext extends ExpresionContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValorexpresionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionforContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(VlangParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionforContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public IdContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expdotexp1Context extends ExpresionContext {
		public List<TerminalNode> ID() { return getTokens(VlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VlangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(VlangParser.DOT, 0); }
		public Expdotexp1Context(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpdotexpContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(VlangParser.DOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpdotexpContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpContext extends ExpresionContext {
		public ExpresionContext left;
		public Token op;
		public ExpresionContext right;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(VlangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VlangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VlangParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(VlangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VlangParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(VlangParser.LT, 0); }
		public TerminalNode LE() { return getToken(VlangParser.LE, 0); }
		public TerminalNode GT() { return getToken(VlangParser.GT, 0); }
		public TerminalNode GE() { return getToken(VlangParser.GE, 0); }
		public TerminalNode EQ() { return getToken(VlangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VlangParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(VlangParser.AND, 0); }
		public TerminalNode OR() { return getToken(VlangParser.OR, 0); }
		public BinaryExpContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new ValorexpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(322);
				valor();
				}
				break;
			case 2:
				{
				_localctx = new FuncionexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				func_call();
				}
				break;
			case 3:
				{
				_localctx = new ParentesisexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(LPAREN);
				setState(325);
				expresion(0);
				setState(326);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new CorchetesexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(LBRACK);
				setState(329);
				expresion(0);
				setState(330);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				((UnarioContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((UnarioContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				expresion(12);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IncredecrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				incredecre();
				}
				break;
			case 8:
				{
				_localctx = new Expdotexp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(ID);
				setState(337);
				match(DOT);
				setState(338);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ExpdotexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(ID);
				setState(340);
				match(DOT);
				setState(341);
				expresion(2);
				}
				break;
			case 10:
				{
				_localctx = new AsignacionforContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(ID);
				setState(343);
				match(ASSIGN);
				setState(344);
				expresion(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(347);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(348);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						((BinaryExpContext)_localctx).right = expresion(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(350);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(351);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						((BinaryExpContext)_localctx).right = expresion(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						((BinaryExpContext)_localctx).right = expresion(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(356);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(357);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						((BinaryExpContext)_localctx).right = expresion(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(359);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(360);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(361);
						((BinaryExpContext)_localctx).right = expresion(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(362);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(363);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(364);
						((BinaryExpContext)_localctx).right = expresion(7);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	 
		public ParametrosContext() { }
		public void copyFrom(ParametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParametrosContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public ParamListContext(ParametrosContext ctx) { copyFrom(ctx); }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametros);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			func_param();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				func_param();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_paramContext extends ParserRuleContext {
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
	 
		public Func_paramContext() { }
		public void copyFrom(Func_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncParamContext extends Func_paramContext {
		public Id_patternContext id_pattern() {
			return getRuleContext(Id_patternContext.class,0);
		}
		public FuncParamContext(Func_paramContext ctx) { copyFrom(ctx); }
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func_param);
		try {
			_localctx = new FuncParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			id_pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	 
		public Arg_listContext() { }
		public void copyFrom(Arg_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends Arg_listContext {
		public List<Func_argContext> func_arg() {
			return getRuleContexts(Func_argContext.class);
		}
		public Func_argContext func_arg(int i) {
			return getRuleContext(Func_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VlangParser.COMMA, i);
		}
		public ArgListContext(Arg_listContext ctx) { copyFrom(ctx); }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arg_list);
		int _la;
		try {
			_localctx = new ArgListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			func_arg();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				func_arg();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_argContext extends ParserRuleContext {
		public Func_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_arg; }
	 
		public Func_argContext() { }
		public void copyFrom(Func_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncArgContext extends Func_argContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public FuncArgContext(Func_argContext ctx) { copyFrom(ctx); }
	}

	public final Func_argContext func_arg() throws RecognitionException {
		Func_argContext _localctx = new Func_argContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_func_arg);
		try {
			_localctx = new FuncArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ID);
			setState(389);
			var_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValoresContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorDecimalContext extends ValorContext {
		public TerminalNode DECIMAL() { return getToken(VlangParser.DECIMAL, 0); }
		public ValorDecimalContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorEnteroContext extends ValorContext {
		public TerminalNode ENTERO() { return getToken(VlangParser.ENTERO, 0); }
		public ValorEnteroContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorBooleanoContext extends ValorContext {
		public TerminalNode BOOLEANO() { return getToken(VlangParser.BOOLEANO, 0); }
		public ValorBooleanoContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorCaracterContext extends ValorContext {
		public TerminalNode CARACTER() { return getToken(VlangParser.CARACTER, 0); }
		public ValorCaracterContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorCadenaContext extends ValorContext {
		public TerminalNode CADENA() { return getToken(VlangParser.CADENA, 0); }
		public ValorCadenaContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorFloatContext extends ValorContext {
		public TerminalNode FLOAT() { return getToken(VlangParser.FLOAT, 0); }
		public ValorFloatContext(ValorContext ctx) { copyFrom(ctx); }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valor);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				_localctx = new ValorEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(ENTERO);
				}
				break;
			case DECIMAL:
				_localctx = new ValorDecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(DECIMAL);
				}
				break;
			case CADENA:
				_localctx = new ValorCadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(CADENA);
				}
				break;
			case BOOLEANO:
				_localctx = new ValorBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(BOOLEANO);
				}
				break;
			case CARACTER:
				_localctx = new ValorCaracterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(CARACTER);
				}
				break;
			case FLOAT:
				_localctx = new ValorFloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Strct_instanciaContext extends ParserRuleContext {
		public Strct_instanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strct_instancia; }
	 
		public Strct_instanciaContext() { }
		public void copyFrom(Strct_instanciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructInstanciaContext extends Strct_instanciaContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<Struct_propContext> struct_prop() {
			return getRuleContexts(Struct_propContext.class);
		}
		public Struct_propContext struct_prop(int i) {
			return getRuleContext(Struct_propContext.class,i);
		}
		public StructInstanciaContext(Strct_instanciaContext ctx) { copyFrom(ctx); }
	}

	public final Strct_instanciaContext strct_instancia() throws RecognitionException {
		Strct_instanciaContext _localctx = new Strct_instanciaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_strct_instancia);
		int _la;
		try {
			_localctx = new StructInstanciaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__2);
			setState(402);
			match(ID);
			setState(403);
			match(LCOR);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) {
				{
				{
				setState(404);
				struct_prop();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(RCOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_propContext extends ParserRuleContext {
		public Struct_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_prop; }
	 
		public Struct_propContext() { }
		public void copyFrom(Struct_propContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAttrContext extends Struct_propContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(VlangParser.COLON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VlangParser.COMMA, 0); }
		public StructAttrContext(Struct_propContext ctx) { copyFrom(ctx); }
	}

	public final Struct_propContext struct_prop() throws RecognitionException {
		Struct_propContext _localctx = new Struct_propContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_struct_prop);
		int _la;
		try {
			_localctx = new StructAttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			var_type();
			setState(413);
			match(ID);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(414);
				match(COLON);
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4701758303033606144L) != 0)) {
				{
				setState(417);
				expresion(0);
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(420);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	 
		public Var_typeContext() { }
		public void copyFrom(Var_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends Var_typeContext {
		public VoidTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends Var_typeContext {
		public BoolTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends Var_typeContext {
		public StringTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends Var_typeContext {
		public CharTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends Var_typeContext {
		public IntTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends Var_typeContext {
		public FloatTypeContext(Var_typeContext ctx) { copyFrom(ctx); }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_var_type);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_vectorContext extends ParserRuleContext {
		public Struct_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_vector; }
	 
		public Struct_vectorContext() { }
		public void copyFrom(Struct_vectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructVectorContext extends Struct_vectorContext {
		public TerminalNode LBRACK() { return getToken(VlangParser.LBRACK, 0); }
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode RBRACK() { return getToken(VlangParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public StructVectorContext(Struct_vectorContext ctx) { copyFrom(ctx); }
	}

	public final Struct_vectorContext struct_vector() throws RecognitionException {
		Struct_vectorContext _localctx = new Struct_vectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_struct_vector);
		try {
			_localctx = new StructVectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(LBRACK);
			setState(432);
			match(ID);
			setState(433);
			match(RBRACK);
			setState(434);
			match(LPAREN);
			setState(435);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncredecreContext extends ParserRuleContext {
		public IncredecreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incredecre; }
	 
		public IncredecreContext() { }
		public void copyFrom(IncredecreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Incremento2Context extends IncredecreContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode INC2() { return getToken(VlangParser.INC2, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Incremento2Context(IncredecreContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Decremento2Context extends IncredecreContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode DEC2() { return getToken(VlangParser.DEC2, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Decremento2Context(IncredecreContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends IncredecreContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode INC() { return getToken(VlangParser.INC, 0); }
		public IncrementoContext(IncredecreContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoContext extends IncredecreContext {
		public TerminalNode ID() { return getToken(VlangParser.ID, 0); }
		public TerminalNode DEC() { return getToken(VlangParser.DEC, 0); }
		public DecrementoContext(IncredecreContext ctx) { copyFrom(ctx); }
	}

	public final IncredecreContext incredecre() throws RecognitionException {
		IncredecreContext _localctx = new IncredecreContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_incredecre);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(ID);
				setState(438);
				match(INC);
				}
				break;
			case 2:
				_localctx = new DecrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(ID);
				setState(440);
				match(DEC);
				}
				break;
			case 3:
				_localctx = new Incremento2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(ID);
				setState(442);
				match(INC2);
				setState(443);
				expresion(0);
				}
				break;
			case 4:
				_localctx = new Decremento2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				match(ID);
				setState(445);
				match(DEC2);
				setState(446);
				expresion(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u01c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0004"+
		"\u0000F\b\u0000\u000b\u0000\f\u0000G\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002`\b\u0002\n\u0002\f\u0002c\t\u0002\u0001\u0002"+
		"\u0003\u0002f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004v\b\u0004\n\u0004\f\u0004"+
		"y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005\u0085"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006\u0091\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0001\t\u0001\t\u0005\t\u00b8\b\t"+
		"\n\t\f\t\u00bb\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00c9\b\u000b\u000b\u000b\f\u000b\u00ca\u0001\u000b\u0003\u000b\u00ce"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00d6\b\f\n\f\f\f\u00d9\t\f\u0001\f\u0001\f\u0005\f\u00dd\b\f\n\f\f"+
		"\f\u00e0\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u00e5\b\r\n\r\f\r\u00e8\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ed\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00f5\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f9\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00fd\b\u000f\n\u000f\f\u000f\u0100"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0108\b\u0010\n\u0010\f\u0010\u010b\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0111\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0115\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u012e\b\u0013\u0003\u0013\u0130\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0135\b\u0014\n"+
		"\u0014\f\u0014\u0138\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u013d\b\u0015\n\u0015\f\u0015\u0140\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u015a\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u016e\b\u0016\n\u0016\f\u0016\u0171\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0176\b\u0017\n\u0017\f\u0017\u0179\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0180\b\u0019\n\u0019\f\u0019\u0183\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0190\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0196\b\u001d\n\u001d\f\u001d"+
		"\u0199\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01a0\b\u001e\u0001\u001e\u0003\u001e\u01a3\b\u001e\u0001"+
		"\u001e\u0003\u001e\u01a6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ae\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01c0\b!\u0001!\u0000\u0001,\"\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@B\u0000\u0005\u0002\u0000\"\"&&\u0001\u0000#%"+
		"\u0001\u0000!\"\u0001\u0000+.\u0001\u0000)*\u01ec\u0000E\u0001\u0000\u0000"+
		"\u0000\u0002Z\u0001\u0000\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000"+
		"\u0006g\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\n|\u0001\u0000"+
		"\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000"+
		"\u0000\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000"+
		"\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016\u00c4\u0001\u0000\u0000"+
		"\u0000\u0018\u00d1\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000\u0000"+
		"\u0000\u001c\u00e9\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000"+
		"\u0000 \u0103\u0001\u0000\u0000\u0000\"\u0114\u0001\u0000\u0000\u0000"+
		"$\u0116\u0001\u0000\u0000\u0000&\u012f\u0001\u0000\u0000\u0000(\u0131"+
		"\u0001\u0000\u0000\u0000*\u0139\u0001\u0000\u0000\u0000,\u0159\u0001\u0000"+
		"\u0000\u0000.\u0172\u0001\u0000\u0000\u00000\u017a\u0001\u0000\u0000\u0000"+
		"2\u017c\u0001\u0000\u0000\u00004\u0184\u0001\u0000\u0000\u00006\u0187"+
		"\u0001\u0000\u0000\u00008\u018f\u0001\u0000\u0000\u0000:\u0191\u0001\u0000"+
		"\u0000\u0000<\u019c\u0001\u0000\u0000\u0000>\u01ad\u0001\u0000\u0000\u0000"+
		"@\u01af\u0001\u0000\u0000\u0000B\u01bf\u0001\u0000\u0000\u0000DF\u0003"+
		"\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0000\u0000\u0001J\u0001\u0001\u0000\u0000\u0000K[\u0003"+
		"&\u0013\u0000L[\u0003$\u0012\u0000M[\u0003\u0004\u0002\u0000N[\u0003\u0012"+
		"\t\u0000O[\u0003\u001c\u000e\u0000P[\u0003\u001e\u000f\u0000Q[\u0003 "+
		"\u0010\u0000R[\u0003:\u001d\u0000S[\u0003\"\u0011\u0000T[\u0003\n\u0005"+
		"\u0000U[\u0003\f\u0006\u0000V[\u0003B!\u0000W[\u0003\u000e\u0007\u0000"+
		"X[\u0003\u0010\b\u0000Y[\u0003\u0016\u000b\u0000ZK\u0001\u0000\u0000\u0000"+
		"ZL\u0001\u0000\u0000\u0000ZM\u0001\u0000\u0000\u0000ZN\u0001\u0000\u0000"+
		"\u0000ZO\u0001\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000ZQ\u0001\u0000"+
		"\u0000\u0000ZR\u0001\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000ZT\u0001"+
		"\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000"+
		"ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\u0003\u0001\u0000\u0000\u0000\\a\u0003\u0006\u0003\u0000]^\u0005"+
		"\u0015\u0000\u0000^`\u0003\u0006\u0003\u0000_]\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0003\b\u0004"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0005\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0014\u0000\u0000hi\u0003,\u0016\u0000im\u0005"+
		"9\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005;\u0000\u0000"+
		"q\u0007\u0001\u0000\u0000\u0000rs\u0005\u0015\u0000\u0000sw\u00059\u0000"+
		"\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005;\u0000\u0000{\t\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0001\u0000\u0000}~\u00056\u0000\u0000~\u0083"+
		"\u0003,\u0016\u0000\u007f\u0080\u0005=\u0000\u0000\u0080\u0082\u0003,"+
		"\u0016\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u00057\u0000\u0000\u0087\u000b\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u008a\u00056\u0000\u0000"+
		"\u008a\u008f\u0003,\u0016\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008e"+
		"\u0003,\u0016\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u00057\u0000\u0000\u0093\r\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0096\u0003,\u0016"+
		"\u0000\u0096\u009a\u00059\u0000\u0000\u0097\u0099\u0003\u0002\u0001\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005;\u0000\u0000\u009e\u000f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0017\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2"+
		"\u00055\u0000\u0000\u00a2\u00a3\u0003,\u0016\u0000\u00a3\u00a4\u00055"+
		"\u0000\u0000\u00a4\u00a5\u0003B!\u0000\u00a5\u00a9\u00059\u0000\u0000"+
		"\u00a6\u00a8\u0003\u0002\u0001\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005;\u0000\u0000\u00ad"+
		"\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0017\u0000\u0000\u00af"+
		"\u00b0\u0005>\u0000\u0000\u00b0\u00b3\u0005\u0018\u0000\u0000\u00b1\u00b4"+
		"\u0003,\u0016\u0000\u00b2\u00b4\u0003\u0014\n\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b9\u00059\u0000\u0000\u00b6\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005;\u0000\u0000\u00bd\u0013\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0003,\u0016\u0000\u00bf\u00c0\u0005<\u0000\u0000\u00c0"+
		"\u00c1\u0005<\u0000\u0000\u00c1\u00c2\u0005<\u0000\u0000\u00c2\u00c3\u0003"+
		",\u0016\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001a"+
		"\u0000\u0000\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c8\u00059\u0000\u0000"+
		"\u00c7\u00c9\u0003\u0018\f\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0003\u001a\r\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005;\u0000\u0000\u00d0\u0017\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u001b\u0000\u0000\u00d2\u00d7\u0003,\u0016\u0000\u00d3\u00d4\u0005=\u0000"+
		"\u0000\u00d4\u00d6\u0003,\u0016\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de\u00054\u0000\u0000\u00db"+
		"\u00dd\u0003\u0002\u0001\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u0019\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001c\u0000\u0000\u00e2"+
		"\u00e6\u00054\u0000\u0000\u00e3\u00e5\u0003\u0002\u0001\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u001b"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0003*\u0015\u0000\u00ea\u00ec\u00056\u0000\u0000\u00eb\u00ed\u0003."+
		"\u0017\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u00057\u0000"+
		"\u0000\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u001f\u0000"+
		"\u0000\u00f1\u00f2\u0005>\u0000\u0000\u00f2\u00f4\u00056\u0000\u0000\u00f3"+
		"\u00f5\u00032\u0019\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u00057\u0000\u0000\u00f7\u00f9\u0003>\u001f\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fe\u00059\u0000\u0000\u00fb\u00fd\u0003\u0002\u0001"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005;\u0000\u0000\u0102\u001f\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0005>\u0000\u0000\u0105"+
		"\u0109\u00059\u0000\u0000\u0106\u0108\u0003$\u0012\u0000\u0107\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		";\u0000\u0000\u010d!\u0001\u0000\u0000\u0000\u010e\u0110\u0005\u0019\u0000"+
		"\u0000\u010f\u0111\u0003,\u0016\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0115\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0005\u001d\u0000\u0000\u0113\u0115\u0005\u001e\u0000\u0000"+
		"\u0114\u010e\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0115#\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0003*\u0015\u0000\u0117\u0118\u0005/\u0000\u0000\u0118\u0119\u0003"+
		",\u0016\u0000\u0119%\u0001\u0000\u0000\u0000\u011a\u011b\u0005\r\u0000"+
		"\u0000\u011b\u011c\u0005>\u0000\u0000\u011c\u011d\u0005/\u0000\u0000\u011d"+
		"\u0130\u0003,\u0016\u0000\u011e\u011f\u0005\r\u0000\u0000\u011f\u0120"+
		"\u0003*\u0015\u0000\u0120\u0121\u0003>\u001f\u0000\u0121\u0122\u0005/"+
		"\u0000\u0000\u0122\u0123\u0003,\u0016\u0000\u0123\u0130\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005>\u0000\u0000\u0125\u0126\u0005/\u0000\u0000\u0126"+
		"\u0127\u00058\u0000\u0000\u0127\u0128\u0005:\u0000\u0000\u0128\u0129\u0003"+
		">\u001f\u0000\u0129\u012a\u00059\u0000\u0000\u012a\u012b\u0003(\u0014"+
		"\u0000\u012b\u012d\u0005;\u0000\u0000\u012c\u012e\u00055\u0000\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u0130\u0001\u0000\u0000\u0000\u012f\u011a\u0001\u0000\u0000\u0000\u012f"+
		"\u011e\u0001\u0000\u0000\u0000\u012f\u0124\u0001\u0000\u0000\u0000\u0130"+
		"\'\u0001\u0000\u0000\u0000\u0131\u0136\u0003,\u0016\u0000\u0132\u0133"+
		"\u0005=\u0000\u0000\u0133\u0135\u0003,\u0016\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137)\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013e\u0005>\u0000\u0000"+
		"\u013a\u013b\u0005<\u0000\u0000\u013b\u013d\u0005>\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f+\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0006"+
		"\u0016\uffff\uffff\u0000\u0142\u015a\u00038\u001c\u0000\u0143\u015a\u0003"+
		"\u001c\u000e\u0000\u0144\u0145\u00056\u0000\u0000\u0145\u0146\u0003,\u0016"+
		"\u0000\u0146\u0147\u00057\u0000\u0000\u0147\u015a\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u00058\u0000\u0000\u0149\u014a\u0003,\u0016\u0000\u014a\u014b"+
		"\u0005:\u0000\u0000\u014b\u015a\u0001\u0000\u0000\u0000\u014c\u014d\u0007"+
		"\u0000\u0000\u0000\u014d\u015a\u0003,\u0016\f\u014e\u015a\u0005>\u0000"+
		"\u0000\u014f\u015a\u0003B!\u0000\u0150\u0151\u0005>\u0000\u0000\u0151"+
		"\u0152\u0005<\u0000\u0000\u0152\u015a\u0005>\u0000\u0000\u0153\u0154\u0005"+
		">\u0000\u0000\u0154\u0155\u0005<\u0000\u0000\u0155\u015a\u0003,\u0016"+
		"\u0002\u0156\u0157\u0005>\u0000\u0000\u0157\u0158\u0005/\u0000\u0000\u0158"+
		"\u015a\u0003,\u0016\u0001\u0159\u0141\u0001\u0000\u0000\u0000\u0159\u0143"+
		"\u0001\u0000\u0000\u0000\u0159\u0144\u0001\u0000\u0000\u0000\u0159\u0148"+
		"\u0001\u0000\u0000\u0000\u0159\u014c\u0001\u0000\u0000\u0000\u0159\u014e"+
		"\u0001\u0000\u0000\u0000\u0159\u014f\u0001\u0000\u0000\u0000\u0159\u0150"+
		"\u0001\u0000\u0000\u0000\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0156"+
		"\u0001\u0000\u0000\u0000\u015a\u016f\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\n\u000b\u0000\u0000\u015c\u015d\u0007\u0001\u0000\u0000\u015d\u016e\u0003"+
		",\u0016\f\u015e\u015f\n\n\u0000\u0000\u015f\u0160\u0007\u0002\u0000\u0000"+
		"\u0160\u016e\u0003,\u0016\u000b\u0161\u0162\n\t\u0000\u0000\u0162\u0163"+
		"\u0007\u0003\u0000\u0000\u0163\u016e\u0003,\u0016\n\u0164\u0165\n\b\u0000"+
		"\u0000\u0165\u0166\u0007\u0004\u0000\u0000\u0166\u016e\u0003,\u0016\t"+
		"\u0167\u0168\n\u0007\u0000\u0000\u0168\u0169\u0005(\u0000\u0000\u0169"+
		"\u016e\u0003,\u0016\b\u016a\u016b\n\u0006\u0000\u0000\u016b\u016c\u0005"+
		"\'\u0000\u0000\u016c\u016e\u0003,\u0016\u0007\u016d\u015b\u0001\u0000"+
		"\u0000\u0000\u016d\u015e\u0001\u0000\u0000\u0000\u016d\u0161\u0001\u0000"+
		"\u0000\u0000\u016d\u0164\u0001\u0000\u0000\u0000\u016d\u0167\u0001\u0000"+
		"\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170-\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0172\u0177\u00030\u0018\u0000\u0173\u0174\u0005=\u0000\u0000\u0174"+
		"\u0176\u00030\u0018\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178/\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0003*\u0015\u0000\u017b1\u0001\u0000\u0000"+
		"\u0000\u017c\u0181\u00034\u001a\u0000\u017d\u017e\u0005=\u0000\u0000\u017e"+
		"\u0180\u00034\u001a\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0183"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u01823\u0001\u0000\u0000\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005>\u0000\u0000\u0185\u0186\u0003>\u001f"+
		"\u0000\u01865\u0001\u0000\u0000\u0000\u0187\u0188\u00038\u001c\u0000\u0188"+
		"7\u0001\u0000\u0000\u0000\u0189\u0190\u0005\u000f\u0000\u0000\u018a\u0190"+
		"\u0005\u0011\u0000\u0000\u018b\u0190\u0005\u0012\u0000\u0000\u018c\u0190"+
		"\u0005\u000e\u0000\u0000\u018d\u0190\u0005\u0013\u0000\u0000\u018e\u0190"+
		"\u0005\u0010\u0000\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u018f\u018a"+
		"\u0001\u0000\u0000\u0000\u018f\u018b\u0001\u0000\u0000\u0000\u018f\u018c"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e"+
		"\u0001\u0000\u0000\u0000\u01909\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0003\u0000\u0000\u0192\u0193\u0005>\u0000\u0000\u0193\u0197\u00059\u0000"+
		"\u0000\u0194\u0196\u0003<\u001e\u0000\u0195\u0194\u0001\u0000\u0000\u0000"+
		"\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000"+
		"\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0005;\u0000\u0000\u019b"+
		";\u0001\u0000\u0000\u0000\u019c\u019d\u0003>\u001f\u0000\u019d\u019f\u0005"+
		">\u0000\u0000\u019e\u01a0\u00054\u0000\u0000\u019f\u019e\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0003,\u0016\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a6\u0005=\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6=\u0001\u0000\u0000\u0000\u01a7\u01ae"+
		"\u0005\u0004\u0000\u0000\u01a8\u01ae\u0005\u0005\u0000\u0000\u01a9\u01ae"+
		"\u0005\u0006\u0000\u0000\u01aa\u01ae\u0005\u0007\u0000\u0000\u01ab\u01ae"+
		"\u0005\b\u0000\u0000\u01ac\u01ae\u0005\t\u0000\u0000\u01ad\u01a7\u0001"+
		"\u0000\u0000\u0000\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae?\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u00058\u0000\u0000\u01b0\u01b1\u0005>\u0000\u0000"+
		"\u01b1\u01b2\u0005:\u0000\u0000\u01b2\u01b3\u00056\u0000\u0000\u01b3\u01b4"+
		"\u00057\u0000\u0000\u01b4A\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005>"+
		"\u0000\u0000\u01b6\u01c0\u00050\u0000\u0000\u01b7\u01b8\u0005>\u0000\u0000"+
		"\u01b8\u01c0\u00051\u0000\u0000\u01b9\u01ba\u0005>\u0000\u0000\u01ba\u01bb"+
		"\u00052\u0000\u0000\u01bb\u01c0\u0003,\u0016\u0000\u01bc\u01bd\u0005>"+
		"\u0000\u0000\u01bd\u01be\u00053\u0000\u0000\u01be\u01c0\u0003,\u0016\u0000"+
		"\u01bf\u01b5\u0001\u0000\u0000\u0000\u01bf\u01b7\u0001\u0000\u0000\u0000"+
		"\u01bf\u01b9\u0001\u0000\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000"+
		"\u01c0C\u0001\u0000\u0000\u0000(GZaemw\u0083\u008f\u009a\u00a9\u00b3\u00b9"+
		"\u00ca\u00cd\u00d7\u00de\u00e6\u00ec\u00f4\u00f8\u00fe\u0109\u0110\u0114"+
		"\u012d\u012f\u0136\u013e\u0159\u016d\u016f\u0177\u0181\u018f\u0197\u019f"+
		"\u01a2\u01a5\u01ad\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}