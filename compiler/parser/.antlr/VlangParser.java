// Generated from /home/luisa/Documentos/2025/Vaqueras/compi2 781/Lab/Oficial/OLC2_Proyecto1_201902125/compiler/parser/Vlang.g4 by ANTLR 4.13.1
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
		RULE_forClasic_stmt = 8, RULE_for_stmt = 9, RULE_range = 10, RULE_func_call = 11, 
		RULE_func_dcl = 12, RULE_struct_dcl = 13, RULE_transfer_stmt = 14, RULE_assign_stmt = 15, 
		RULE_decl_stmt = 16, RULE_list_expresiones = 17, RULE_id_pattern = 18, 
		RULE_expresion = 19, RULE_parametros = 20, RULE_func_param = 21, RULE_arg_list = 22, 
		RULE_func_arg = 23, RULE_valores = 24, RULE_valor = 25, RULE_strct_instancia = 26, 
		RULE_struct_prop = 27, RULE_var_type = 28, RULE_struct_vector = 29, RULE_incredecre = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "stmt", "if_stmt", "if_chain", "else_stmt", "println", "print", 
			"forwhile_stmt", "forClasic_stmt", "for_stmt", "range", "func_call", 
			"func_dcl", "struct_dcl", "transfer_stmt", "assign_stmt", "decl_stmt", 
			"list_expresiones", "id_pattern", "expresion", "parametros", "func_param", 
			"arg_list", "func_arg", "valores", "valor", "strct_instancia", "struct_prop", 
			"var_type", "struct_vector", "incredecre"
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				stmt();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0) );
			setState(67);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				decl_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				func_dcl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				struct_dcl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				strct_instancia();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				transfer_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				println();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(79);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(80);
				incredecre();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(81);
				forwhile_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(82);
				forClasic_stmt();
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
			setState(85);
			if_chain();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(ELSE_KW);
					setState(87);
					if_chain();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(93);
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
			setState(96);
			match(IF_KW);
			setState(97);
			expresion(0);
			setState(98);
			match(LCOR);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
				{
				{
				setState(99);
				stmt();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(107);
			match(ELSE_KW);
			setState(108);
			match(LCOR);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
				{
				{
				setState(109);
				stmt();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			setState(117);
			match(T__0);
			setState(118);
			match(LPAREN);
			setState(119);
			expresion(0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				expresion(0);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
			setState(129);
			match(T__1);
			setState(130);
			match(LPAREN);
			setState(131);
			expresion(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				expresion(0);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
			setState(141);
			match(FOR_KW);
			setState(142);
			expresion(0);
			setState(143);
			match(LCOR);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
				{
				{
				setState(144);
				stmt();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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
			setState(152);
			match(FOR_KW);
			setState(153);
			assign_stmt();
			setState(154);
			match(PYC);
			setState(155);
			expresion(0);
			setState(156);
			match(PYC);
			setState(157);
			incredecre();
			setState(158);
			match(LCOR);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
				{
				{
				setState(159);
				stmt();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
			setState(167);
			match(FOR_KW);
			setState(168);
			match(ID);
			setState(169);
			match(IN_KW);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(170);
				expresion(0);
				}
				break;
			case 2:
				{
				setState(171);
				range();
				}
				break;
			}
			setState(174);
			match(LCOR);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
				{
				{
				setState(175);
				stmt();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
			setState(183);
			expresion(0);
			setState(184);
			match(DOT);
			setState(185);
			match(DOT);
			setState(186);
			match(DOT);
			setState(187);
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
		enterRule(_localctx, 22, RULE_func_call);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			id_pattern();
			setState(190);
			match(LPAREN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(191);
				parametros();
				}
			}

			setState(194);
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
	public static class FuncMainContext extends Func_dclContext {
		public TerminalNode FN_KW() { return getToken(VlangParser.FN_KW, 0); }
		public TerminalNode MAIN_KW() { return getToken(VlangParser.MAIN_KW, 0); }
		public TerminalNode LPAREN() { return getToken(VlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VlangParser.RPAREN, 0); }
		public TerminalNode LCOR() { return getToken(VlangParser.LCOR, 0); }
		public TerminalNode RCOR() { return getToken(VlangParser.RCOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FuncMainContext(Func_dclContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 24, RULE_func_dcl);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(FN_KW);
				setState(197);
				match(ID);
				setState(198);
				match(LPAREN);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(199);
					arg_list();
					}
				}

				setState(202);
				match(RPAREN);
				setState(203);
				match(LCOR);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
					{
					{
					setState(204);
					stmt();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RCOR);
				}
				break;
			case 2:
				_localctx = new FuncMainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(FN_KW);
				setState(212);
				match(MAIN_KW);
				setState(213);
				match(LPAREN);
				setState(214);
				match(RPAREN);
				setState(215);
				match(LCOR);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022228484110L) != 0)) {
					{
					{
					setState(216);
					stmt();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(RCOR);
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
		enterRule(_localctx, 26, RULE_struct_dcl);
		int _la;
		try {
			_localctx = new StructDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__2);
			setState(226);
			match(ID);
			setState(227);
			match(LCOR);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(228);
				assign_stmt();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		enterRule(_localctx, 28, RULE_transfer_stmt);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN_KW:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(RETURN_KW);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(237);
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
				setState(240);
				match(BREAK_KW);
				}
				break;
			case CONTINUE_KW:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
		enterRule(_localctx, 30, RULE_assign_stmt);
		try {
			_localctx = new DirectAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			id_pattern();
			setState(245);
			match(ASSIGN);
			setState(246);
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
		enterRule(_localctx, 32, RULE_decl_stmt);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new DeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(MUT);
				setState(249);
				match(ID);
				setState(250);
				match(ASSIGN);
				setState(251);
				expresion(0);
				}
				break;
			case 2:
				_localctx = new DeclAssignTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(MUT);
				setState(253);
				id_pattern();
				setState(254);
				var_type();
				setState(255);
				match(ASSIGN);
				setState(256);
				expresion(0);
				}
				break;
			case 3:
				_localctx = new SliceDeclInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(ID);
				setState(259);
				match(ASSIGN);
				setState(260);
				match(LBRACK);
				setState(261);
				match(RBRACK);
				setState(262);
				var_type();
				setState(263);
				match(LCOR);
				setState(264);
				list_expresiones();
				setState(265);
				match(RCOR);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PYC) {
					{
					setState(266);
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
		enterRule(_localctx, 34, RULE_list_expresiones);
		int _la;
		try {
			_localctx = new ListExpressionsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			expresion(0);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				expresion(0);
				}
				}
				setState(278);
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
		enterRule(_localctx, 36, RULE_id_pattern);
		int _la;
		try {
			_localctx = new IdPatternContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(280);
				match(DOT);
				setState(281);
				match(ID);
				}
				}
				setState(286);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ValorexpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(288);
				valor();
				}
				break;
			case 2:
				{
				_localctx = new FuncionexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				func_call();
				}
				break;
			case 3:
				{
				_localctx = new ParentesisexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(LPAREN);
				setState(291);
				expresion(0);
				setState(292);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new CorchetesexpreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(LBRACK);
				setState(295);
				expresion(0);
				setState(296);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
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
				setState(299);
				expresion(12);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IncredecrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				incredecre();
				}
				break;
			case 8:
				{
				_localctx = new Expdotexp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(ID);
				setState(303);
				match(DOT);
				setState(304);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ExpdotexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(ID);
				setState(306);
				match(DOT);
				setState(307);
				expresion(2);
				}
				break;
			case 10:
				{
				_localctx = new AsignacionforContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(ID);
				setState(309);
				match(ASSIGN);
				setState(310);
				expresion(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(313);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(314);
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
						setState(315);
						((BinaryExpContext)_localctx).right = expresion(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(316);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(317);
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
						setState(318);
						((BinaryExpContext)_localctx).right = expresion(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(319);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(320);
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
						setState(321);
						((BinaryExpContext)_localctx).right = expresion(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(322);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(323);
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
						setState(324);
						((BinaryExpContext)_localctx).right = expresion(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(325);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(326);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(327);
						((BinaryExpContext)_localctx).right = expresion(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpresionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(328);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(329);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(330);
						((BinaryExpContext)_localctx).right = expresion(7);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 40, RULE_parametros);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			func_param();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				func_param();
				}
				}
				setState(343);
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
		enterRule(_localctx, 42, RULE_func_param);
		try {
			_localctx = new FuncParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 44, RULE_arg_list);
		int _la;
		try {
			_localctx = new ArgListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			func_arg();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(347);
				match(COMMA);
				setState(348);
				func_arg();
				}
				}
				setState(353);
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
		enterRule(_localctx, 46, RULE_func_arg);
		try {
			_localctx = new FuncArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(ID);
			setState(355);
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
		enterRule(_localctx, 48, RULE_valores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 50, RULE_valor);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				_localctx = new ValorEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(ENTERO);
				}
				break;
			case DECIMAL:
				_localctx = new ValorDecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(DECIMAL);
				}
				break;
			case CADENA:
				_localctx = new ValorCadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(CADENA);
				}
				break;
			case BOOLEANO:
				_localctx = new ValorBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(BOOLEANO);
				}
				break;
			case CARACTER:
				_localctx = new ValorCaracterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(CARACTER);
				}
				break;
			case FLOAT:
				_localctx = new ValorFloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
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
		enterRule(_localctx, 52, RULE_strct_instancia);
		int _la;
		try {
			_localctx = new StructInstanciaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__2);
			setState(368);
			match(ID);
			setState(369);
			match(LCOR);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) {
				{
				{
				setState(370);
				struct_prop();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
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
		enterRule(_localctx, 54, RULE_struct_prop);
		int _la;
		try {
			_localctx = new StructAttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			var_type();
			setState(379);
			match(ID);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(380);
				match(COLON);
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4701758303033606144L) != 0)) {
				{
				setState(383);
				expresion(0);
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(386);
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
		enterRule(_localctx, 56, RULE_var_type);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
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
		enterRule(_localctx, 58, RULE_struct_vector);
		try {
			_localctx = new StructVectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LBRACK);
			setState(398);
			match(ID);
			setState(399);
			match(RBRACK);
			setState(400);
			match(LPAREN);
			setState(401);
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
		enterRule(_localctx, 60, RULE_incredecre);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(ID);
				setState(404);
				match(INC);
				}
				break;
			case 2:
				_localctx = new DecrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(ID);
				setState(406);
				match(DEC);
				}
				break;
			case 3:
				_localctx = new Incremento2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(ID);
				setState(408);
				match(INC2);
				setState(409);
				expresion(0);
				}
				break;
			case 4:
				_localctx = new Decremento2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(ID);
				setState(411);
				match(DEC2);
				setState(412);
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
		case 19:
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
		"\u0004\u0001A\u01a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001"+
		"\u0002\u0003\u0002_\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003e\b\u0003\n\u0003\f\u0003h\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004o\b\u0004\n\u0004"+
		"\f\u0004r\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0087\b\u0006\n\u0006\f\u0006\u008a\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0092\b\u0007\n\u0007\f\u0007\u0095\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00a1\b\b\n\b\f\b\u00a4\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0001\t\u0005\t\u00b1\b\t"+
		"\n\t\f\t\u00b4\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c1\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c9"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00da\b\f\n"+
		"\f\f\f\u00dd\t\f\u0001\f\u0003\f\u00e0\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00e6\b\r\n\r\f\r\u00e9\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ef\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f3"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u010c\b\u0010\u0003\u0010\u010e\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0113\b\u0011\n\u0011\f\u0011\u0116\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u011b\b\u0012\n\u0012\f\u0012"+
		"\u011e\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u014c\b\u0013\n\u0013"+
		"\f\u0013\u014f\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0154\b\u0014\n\u0014\f\u0014\u0157\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015e\b\u0016\n\u0016\f\u0016"+
		"\u0161\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u016e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0174\b\u001a\n\u001a\f\u001a\u0177\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u017e\b\u001b\u0001"+
		"\u001b\u0003\u001b\u0181\b\u001b\u0001\u001b\u0003\u001b\u0184\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u018c\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u019e\b\u001e\u0001\u001e\u0000\u0001&\u001f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<\u0000\u0005\u0002\u0000\"\"&&\u0001\u0000#%\u0001\u0000"+
		"!\"\u0001\u0000+.\u0001\u0000)*\u01c8\u0000?\u0001\u0000\u0000\u0000\u0002"+
		"S\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006`\u0001"+
		"\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000"+
		"\f\u0081\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010"+
		"\u0098\u0001\u0000\u0000\u0000\u0012\u00a7\u0001\u0000\u0000\u0000\u0014"+
		"\u00b7\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000\u0018"+
		"\u00df\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c"+
		"\u00f2\u0001\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u010d"+
		"\u0001\u0000\u0000\u0000\"\u010f\u0001\u0000\u0000\u0000$\u0117\u0001"+
		"\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000(\u0150\u0001\u0000\u0000"+
		"\u0000*\u0158\u0001\u0000\u0000\u0000,\u015a\u0001\u0000\u0000\u0000."+
		"\u0162\u0001\u0000\u0000\u00000\u0165\u0001\u0000\u0000\u00002\u016d\u0001"+
		"\u0000\u0000\u00004\u016f\u0001\u0000\u0000\u00006\u017a\u0001\u0000\u0000"+
		"\u00008\u018b\u0001\u0000\u0000\u0000:\u018d\u0001\u0000\u0000\u0000<"+
		"\u019d\u0001\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001"+
		"D\u0001\u0001\u0000\u0000\u0000ET\u0003 \u0010\u0000FT\u0003\u001e\u000f"+
		"\u0000GT\u0003\u0004\u0002\u0000HT\u0003\u0012\t\u0000IT\u0003\u0016\u000b"+
		"\u0000JT\u0003\u0018\f\u0000KT\u0003\u001a\r\u0000LT\u00034\u001a\u0000"+
		"MT\u0003\u001c\u000e\u0000NT\u0003\n\u0005\u0000OT\u0003\f\u0006\u0000"+
		"PT\u0003<\u001e\u0000QT\u0003\u000e\u0007\u0000RT\u0003\u0010\b\u0000"+
		"SE\u0001\u0000\u0000\u0000SF\u0001\u0000\u0000\u0000SG\u0001\u0000\u0000"+
		"\u0000SH\u0001\u0000\u0000\u0000SI\u0001\u0000\u0000\u0000SJ\u0001\u0000"+
		"\u0000\u0000SK\u0001\u0000\u0000\u0000SL\u0001\u0000\u0000\u0000SM\u0001"+
		"\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000T\u0003\u0001\u0000\u0000\u0000UZ\u0003\u0006\u0003\u0000VW\u0005"+
		"\u0015\u0000\u0000WY\u0003\u0006\u0003\u0000XV\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0003\b"+
		"\u0004\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0005"+
		"\u0001\u0000\u0000\u0000`a\u0005\u0014\u0000\u0000ab\u0003&\u0013\u0000"+
		"bf\u00059\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005;\u0000"+
		"\u0000j\u0007\u0001\u0000\u0000\u0000kl\u0005\u0015\u0000\u0000lp\u0005"+
		"9\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005;\u0000\u0000"+
		"t\t\u0001\u0000\u0000\u0000uv\u0005\u0001\u0000\u0000vw\u00056\u0000\u0000"+
		"w|\u0003&\u0013\u0000xy\u0005=\u0000\u0000y{\u0003&\u0013\u0000zx\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u00057\u0000\u0000\u0080\u000b\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082\u0083\u00056\u0000\u0000"+
		"\u0083\u0088\u0003&\u0013\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0087"+
		"\u0003&\u0013\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u00057\u0000\u0000\u008c\r\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\u0017\u0000\u0000\u008e\u008f\u0003&\u0013"+
		"\u0000\u008f\u0093\u00059\u0000\u0000\u0090\u0092\u0003\u0002\u0001\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005;\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0017\u0000\u0000\u0099\u009a\u0003\u001e\u000f\u0000\u009a"+
		"\u009b\u00055\u0000\u0000\u009b\u009c\u0003&\u0013\u0000\u009c\u009d\u0005"+
		"5\u0000\u0000\u009d\u009e\u0003<\u001e\u0000\u009e\u00a2\u00059\u0000"+
		"\u0000\u009f\u00a1\u0003\u0002\u0001\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005;\u0000\u0000"+
		"\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000\u0000"+
		"\u00a8\u00a9\u0005>\u0000\u0000\u00a9\u00ac\u0005\u0018\u0000\u0000\u00aa"+
		"\u00ad\u0003&\u0013\u0000\u00ab\u00ad\u0003\u0014\n\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u00059\u0000\u0000\u00af\u00b1\u0003"+
		"\u0002\u0001\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005;\u0000\u0000\u00b6\u0013\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0003&\u0013\u0000\u00b8\u00b9\u0005<\u0000\u0000"+
		"\u00b9\u00ba\u0005<\u0000\u0000\u00ba\u00bb\u0005<\u0000\u0000\u00bb\u00bc"+
		"\u0003&\u0013\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"$\u0012\u0000\u00be\u00c0\u00056\u0000\u0000\u00bf\u00c1\u0003(\u0014"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u00057\u0000\u0000"+
		"\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001f\u0000\u0000"+
		"\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c8\u00056\u0000\u0000\u00c7\u00c9"+
		"\u0003,\u0016\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"7\u0000\u0000\u00cb\u00cf\u00059\u0000\u0000\u00cc\u00ce\u0003\u0002\u0001"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00e0\u0005;\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000"+
		"\u00d4\u00d5\u0005 \u0000\u0000\u00d5\u00d6\u00056\u0000\u0000\u00d6\u00d7"+
		"\u00057\u0000\u0000\u00d7\u00db\u00059\u0000\u0000\u00d8\u00da\u0003\u0002"+
		"\u0001\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0005;\u0000\u0000\u00df\u00c4\u0001\u0000\u0000"+
		"\u0000\u00df\u00d3\u0001\u0000\u0000\u0000\u00e0\u0019\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0005>\u0000\u0000"+
		"\u00e3\u00e7\u00059\u0000\u0000\u00e4\u00e6\u0003\u001e\u000f\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005;\u0000\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0005\u0019\u0000\u0000\u00ed\u00ef\u0003&\u0013\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0005\u001d\u0000\u0000\u00f1\u00f3\u0005"+
		"\u001e\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u001d\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0003$\u0012\u0000\u00f5\u00f6\u0005/\u0000"+
		"\u0000\u00f6\u00f7\u0003&\u0013\u0000\u00f7\u001f\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\r\u0000\u0000\u00f9\u00fa\u0005>\u0000\u0000\u00fa"+
		"\u00fb\u0005/\u0000\u0000\u00fb\u010e\u0003&\u0013\u0000\u00fc\u00fd\u0005"+
		"\r\u0000\u0000\u00fd\u00fe\u0003$\u0012\u0000\u00fe\u00ff\u00038\u001c"+
		"\u0000\u00ff\u0100\u0005/\u0000\u0000\u0100\u0101\u0003&\u0013\u0000\u0101"+
		"\u010e\u0001\u0000\u0000\u0000\u0102\u0103\u0005>\u0000\u0000\u0103\u0104"+
		"\u0005/\u0000\u0000\u0104\u0105\u00058\u0000\u0000\u0105\u0106\u0005:"+
		"\u0000\u0000\u0106\u0107\u00038\u001c\u0000\u0107\u0108\u00059\u0000\u0000"+
		"\u0108\u0109\u0003\"\u0011\u0000\u0109\u010b\u0005;\u0000\u0000\u010a"+
		"\u010c\u00055\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u00f8"+
		"\u0001\u0000\u0000\u0000\u010d\u00fc\u0001\u0000\u0000\u0000\u010d\u0102"+
		"\u0001\u0000\u0000\u0000\u010e!\u0001\u0000\u0000\u0000\u010f\u0114\u0003"+
		"&\u0013\u0000\u0110\u0111\u0005=\u0000\u0000\u0111\u0113\u0003&\u0013"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115#\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0117\u011c\u0005>\u0000\u0000\u0118\u0119\u0005<\u0000\u0000\u0119\u011b"+
		"\u0005>\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d%\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0006\u0013\uffff\uffff\u0000\u0120\u0138\u0003"+
		"2\u0019\u0000\u0121\u0138\u0003\u0016\u000b\u0000\u0122\u0123\u00056\u0000"+
		"\u0000\u0123\u0124\u0003&\u0013\u0000\u0124\u0125\u00057\u0000\u0000\u0125"+
		"\u0138\u0001\u0000\u0000\u0000\u0126\u0127\u00058\u0000\u0000\u0127\u0128"+
		"\u0003&\u0013\u0000\u0128\u0129\u0005:\u0000\u0000\u0129\u0138\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0007\u0000\u0000\u0000\u012b\u0138\u0003&\u0013"+
		"\f\u012c\u0138\u0005>\u0000\u0000\u012d\u0138\u0003<\u001e\u0000\u012e"+
		"\u012f\u0005>\u0000\u0000\u012f\u0130\u0005<\u0000\u0000\u0130\u0138\u0005"+
		">\u0000\u0000\u0131\u0132\u0005>\u0000\u0000\u0132\u0133\u0005<\u0000"+
		"\u0000\u0133\u0138\u0003&\u0013\u0002\u0134\u0135\u0005>\u0000\u0000\u0135"+
		"\u0136\u0005/\u0000\u0000\u0136\u0138\u0003&\u0013\u0001\u0137\u011f\u0001"+
		"\u0000\u0000\u0000\u0137\u0121\u0001\u0000\u0000\u0000\u0137\u0122\u0001"+
		"\u0000\u0000\u0000\u0137\u0126\u0001\u0000\u0000\u0000\u0137\u012a\u0001"+
		"\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012d\u0001"+
		"\u0000\u0000\u0000\u0137\u012e\u0001\u0000\u0000\u0000\u0137\u0131\u0001"+
		"\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138\u014d\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\n\u000b\u0000\u0000\u013a\u013b\u0007\u0001"+
		"\u0000\u0000\u013b\u014c\u0003&\u0013\f\u013c\u013d\n\n\u0000\u0000\u013d"+
		"\u013e\u0007\u0002\u0000\u0000\u013e\u014c\u0003&\u0013\u000b\u013f\u0140"+
		"\n\t\u0000\u0000\u0140\u0141\u0007\u0003\u0000\u0000\u0141\u014c\u0003"+
		"&\u0013\n\u0142\u0143\n\b\u0000\u0000\u0143\u0144\u0007\u0004\u0000\u0000"+
		"\u0144\u014c\u0003&\u0013\t\u0145\u0146\n\u0007\u0000\u0000\u0146\u0147"+
		"\u0005(\u0000\u0000\u0147\u014c\u0003&\u0013\b\u0148\u0149\n\u0006\u0000"+
		"\u0000\u0149\u014a\u0005\'\u0000\u0000\u014a\u014c\u0003&\u0013\u0007"+
		"\u014b\u0139\u0001\u0000\u0000\u0000\u014b\u013c\u0001\u0000\u0000\u0000"+
		"\u014b\u013f\u0001\u0000\u0000\u0000\u014b\u0142\u0001\u0000\u0000\u0000"+
		"\u014b\u0145\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u0150\u0155\u0003*\u0015\u0000\u0151\u0152"+
		"\u0005=\u0000\u0000\u0152\u0154\u0003*\u0015\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156)\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0159\u0003$\u0012\u0000"+
		"\u0159+\u0001\u0000\u0000\u0000\u015a\u015f\u0003.\u0017\u0000\u015b\u015c"+
		"\u0005=\u0000\u0000\u015c\u015e\u0003.\u0017\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160-\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u0005>\u0000\u0000"+
		"\u0163\u0164\u00038\u001c\u0000\u0164/\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u00032\u0019\u0000\u01661\u0001\u0000\u0000\u0000\u0167\u016e\u0005\u000f"+
		"\u0000\u0000\u0168\u016e\u0005\u0011\u0000\u0000\u0169\u016e\u0005\u0012"+
		"\u0000\u0000\u016a\u016e\u0005\u000e\u0000\u0000\u016b\u016e\u0005\u0013"+
		"\u0000\u0000\u016c\u016e\u0005\u0010\u0000\u0000\u016d\u0167\u0001\u0000"+
		"\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016d\u0169\u0001\u0000"+
		"\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e3\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0005>\u0000\u0000"+
		"\u0171\u0175\u00059\u0000\u0000\u0172\u0174\u00036\u001b\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0005;\u0000\u0000\u01795\u0001\u0000\u0000\u0000\u017a\u017b\u00038"+
		"\u001c\u0000\u017b\u017d\u0005>\u0000\u0000\u017c\u017e\u00054\u0000\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u0181\u0003&\u0013\u0000\u0180"+
		"\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0183\u0001\u0000\u0000\u0000\u0182\u0184\u0005=\u0000\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u01847\u0001"+
		"\u0000\u0000\u0000\u0185\u018c\u0005\u0004\u0000\u0000\u0186\u018c\u0005"+
		"\u0005\u0000\u0000\u0187\u018c\u0005\u0006\u0000\u0000\u0188\u018c\u0005"+
		"\u0007\u0000\u0000\u0189\u018c\u0005\b\u0000\u0000\u018a\u018c\u0005\t"+
		"\u0000\u0000\u018b\u0185\u0001\u0000\u0000\u0000\u018b\u0186\u0001\u0000"+
		"\u0000\u0000\u018b\u0187\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000"+
		"\u0000\u0000\u018c9\u0001\u0000\u0000\u0000\u018d\u018e\u00058\u0000\u0000"+
		"\u018e\u018f\u0005>\u0000\u0000\u018f\u0190\u0005:\u0000\u0000\u0190\u0191"+
		"\u00056\u0000\u0000\u0191\u0192\u00057\u0000\u0000\u0192;\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005>\u0000\u0000\u0194\u019e\u00050\u0000\u0000"+
		"\u0195\u0196\u0005>\u0000\u0000\u0196\u019e\u00051\u0000\u0000\u0197\u0198"+
		"\u0005>\u0000\u0000\u0198\u0199\u00052\u0000\u0000\u0199\u019e\u0003&"+
		"\u0013\u0000\u019a\u019b\u0005>\u0000\u0000\u019b\u019c\u00053\u0000\u0000"+
		"\u019c\u019e\u0003&\u0013\u0000\u019d\u0193\u0001\u0000\u0000\u0000\u019d"+
		"\u0195\u0001\u0000\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000\u019d"+
		"\u019a\u0001\u0000\u0000\u0000\u019e=\u0001\u0000\u0000\u0000$ASZ^fp|"+
		"\u0088\u0093\u00a2\u00ac\u00b2\u00c0\u00c8\u00cf\u00db\u00df\u00e7\u00ee"+
		"\u00f2\u010b\u010d\u0114\u011c\u0137\u014b\u014d\u0155\u015f\u016d\u0175"+
		"\u017d\u0180\u0183\u018b\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}