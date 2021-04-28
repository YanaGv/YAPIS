// Generated from D:/work/yapis/src/main/java\Skret.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkretParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, RETURN=12, PARAM=13, ID=14, WS=15, NUM=16, TYPE=17, 
		OP=18, ADD=19, DELETE=20, BINARY_OP=21, COMPARE_OP=22, ASSIG=23, LANDING=24, 
		DOT=25, RANGE=26, IF=27, ELSE=28, IN=29, OUT=30, STREAM_OP=31, ELEMENT_POINTER=32;
	public static final int
		RULE_program = 0, RULE_subprogram = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_for_block = 4, RULE_if_block = 5, RULE_func_call = 6, RULE_var_action = 7, 
		RULE_binary_expression = 8, RULE_var_reform = 9, RULE_io = 10, RULE_landing_expression = 11, 
		RULE_math_expression = 12, RULE_typeCast = 13, RULE_inBrackets = 14, RULE_var_define = 15, 
		RULE_have_value = 16, RULE_list_special_define = 17, RULE_func = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "subprogram", "statement", "block", "for_block", "if_block", 
			"func_call", "var_action", "binary_expression", "var_reform", "io", "landing_expression", 
			"math_expression", "typeCast", "inBrackets", "var_define", "have_value", 
			"list_special_define", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'<'", "';'", "'>'", "'->'", "'('", "')'", "','", "'{'", 
			"'}'", "'havefun'", null, null, null, null, null, null, null, "'add'", 
			"'delete'", null, null, "'='", "'_'", "'.'", "'range'", "'?'", "'else'", 
			"'in'", "'out'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"RETURN", "PARAM", "ID", "WS", "NUM", "TYPE", "OP", "ADD", "DELETE", 
			"BINARY_OP", "COMPARE_OP", "ASSIG", "LANDING", "DOT", "RANGE", "IF", 
			"ELSE", "IN", "OUT", "STREAM_OP", "ELEMENT_POINTER"
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
	public String getGrammarFileName() { return "Skret.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkretParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			subprogram();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(40);
				func();
				}
				}
				setState(45);
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

	public static class SubprogramContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SkretParser.RETURN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SubprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterSubprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitSubprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitSubprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramContext subprogram() throws RecognitionException {
		SubprogramContext _localctx = new SubprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subprogram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAM) | (1L << ID) | (1L << WS) | (1L << LANDING) | (1L << RANGE) | (1L << IF) | (1L << STREAM_OP))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RETURN);
			setState(54);
			match(T__2);
			setState(55);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
		}
		public Landing_expressionContext landing_expression() {
			return getRuleContext(Landing_expressionContext.class,0);
		}
		public Var_actionContext var_action() {
			return getRuleContext(Var_actionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode WS() { return getToken(SkretParser.WS, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(57);
					match(WS);
					}
				}

				setState(60);
				block();
				}
				break;
			case 2:
				{
				setState(61);
				io();
				}
				break;
			case 3:
				{
				setState(62);
				var_define();
				}
				break;
			case 4:
				{
				setState(63);
				landing_expression();
				}
				break;
			case 5:
				{
				setState(64);
				var_action();
				}
				break;
			case 6:
				{
				setState(65);
				func_call();
				}
				break;
			}
			setState(68);
			match(T__2);
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

	public static class BlockContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(70);
				if_block();
				}
				break;
			case RANGE:
				{
				setState(71);
				for_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAM) | (1L << ID) | (1L << WS) | (1L << LANDING) | (1L << RANGE) | (1L << IF) | (1L << STREAM_OP))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__3);
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(SkretParser.RANGE, 0); }
		public List<TerminalNode> ID() { return getTokens(SkretParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SkretParser.ID, i);
		}
		public TerminalNode NUM() { return getToken(SkretParser.NUM, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitFor_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(RANGE);
			setState(84);
			match(ID);
			setState(85);
			match(T__4);
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SkretParser.IF, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(SkretParser.COMPARE_OP, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			match(T__5);
			setState(90);
			math_expression(0);
			setState(91);
			match(COMPARE_OP);
			setState(92);
			math_expression(0);
			setState(93);
			match(T__6);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkretParser.ID, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(T__5);
			setState(97);
			math_expression(0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(98);
				match(T__7);
				setState(99);
				math_expression(0);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__6);
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

	public static class Var_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkretParser.ID, 0); }
		public Var_reformContext var_reform() {
			return getRuleContext(Var_reformContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Var_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterVar_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitVar_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitVar_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_actionContext var_action() throws RecognitionException {
		Var_actionContext _localctx = new Var_actionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIG:
				{
				setState(108);
				var_reform();
				}
				break;
			case BINARY_OP:
				{
				setState(109);
				binary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public TerminalNode BINARY_OP() { return getToken(SkretParser.BINARY_OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(BINARY_OP);
			setState(113);
			math_expression(0);
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

	public static class Var_reformContext extends ParserRuleContext {
		public TerminalNode ASSIG() { return getToken(SkretParser.ASSIG, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Var_reformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_reform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterVar_reform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitVar_reform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitVar_reform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_reformContext var_reform() throws RecognitionException {
		Var_reformContext _localctx = new Var_reformContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_reform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ASSIG);
			setState(116);
			math_expression(0);
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

	public static class IoContext extends ParserRuleContext {
		public TerminalNode STREAM_OP() { return getToken(SkretParser.STREAM_OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_io);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(STREAM_OP);
			setState(119);
			math_expression(0);
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

	public static class Landing_expressionContext extends ParserRuleContext {
		public TerminalNode LANDING() { return getToken(SkretParser.LANDING, 0); }
		public TerminalNode ID() { return getToken(SkretParser.ID, 0); }
		public TerminalNode OP() { return getToken(SkretParser.OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Landing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterLanding_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitLanding_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitLanding_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Landing_expressionContext landing_expression() throws RecognitionException {
		Landing_expressionContext _localctx = new Landing_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_landing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LANDING);
			setState(122);
			match(ID);
			setState(123);
			match(OP);
			setState(124);
			math_expression(0);
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

	public static class Math_expressionContext extends ParserRuleContext {
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public InBracketsContext inBrackets() {
			return getRuleContext(InBracketsContext.class,0);
		}
		public Have_valueContext have_value() {
			return getRuleContext(Have_valueContext.class,0);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(SkretParser.OP, 0); }
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_math_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(127);
				typeCast();
				}
				break;
			case 2:
				{
				setState(128);
				inBrackets();
				}
				break;
			case 3:
				{
				setState(129);
				have_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					match(OP);
					setState(134);
					math_expression(3);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SkretParser.TYPE, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__5);
			setState(141);
			match(TYPE);
			setState(142);
			match(T__6);
			setState(143);
			math_expression(0);
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

	public static class InBracketsContext extends ParserRuleContext {
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public InBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InBracketsContext inBrackets() throws RecognitionException {
		InBracketsContext _localctx = new InBracketsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inBrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__5);
			setState(146);
			math_expression(0);
			setState(147);
			match(T__6);
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

	public static class Var_defineContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(SkretParser.PARAM, 0); }
		public TerminalNode ASSIG() { return getToken(SkretParser.ASSIG, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public List_special_defineContext list_special_define() {
			return getRuleContext(List_special_defineContext.class,0);
		}
		public Var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterVar_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitVar_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitVar_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defineContext var_define() throws RecognitionException {
		Var_defineContext _localctx = new Var_defineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(PARAM);
			setState(150);
			match(ASSIG);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case ID:
			case NUM:
				{
				setState(151);
				math_expression(0);
				}
				break;
			case T__8:
				{
				setState(152);
				list_special_define();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Have_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkretParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SkretParser.NUM, 0); }
		public Have_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_have_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterHave_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitHave_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitHave_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Have_valueContext have_value() throws RecognitionException {
		Have_valueContext _localctx = new Have_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_have_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class List_special_defineContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(SkretParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SkretParser.NUM, i);
		}
		public List_special_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_special_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterList_special_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitList_special_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitList_special_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_special_defineContext list_special_define() throws RecognitionException {
		List_special_defineContext _localctx = new List_special_defineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_special_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__8);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(NUM);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(163);
			match(T__9);
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> PARAM() { return getTokens(SkretParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(SkretParser.PARAM, i);
		}
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkretListener ) ((SkretListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SkretVisitor ) return ((SkretVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__10);
			setState(166);
			match(PARAM);
			setState(167);
			match(T__5);
			setState(168);
			match(PARAM);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(169);
				match(T__7);
				setState(170);
				match(PARAM);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__6);
			setState(177);
			subprogram();
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
		case 12:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4E\n\4\3\4\3\4\3\5\3\5\5\5K\n\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16\u0085\n\16\3\16\3\16\3\16\7\16\u008a\n\16\f\16\16\16\u008d\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21"+
		"\u009c\n\21\3\22\3\22\3\23\3\23\6\23\u00a2\n\23\r\23\16\23\u00a3\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ae\n\24\f\24\16\24\u00b1\13"+
		"\24\3\24\3\24\3\24\3\24\2\3\32\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\3\4\2\20\20\22\22\2\u00b4\2(\3\2\2\2\4\60\3\2\2\2\6D\3\2\2"+
		"\2\bJ\3\2\2\2\nU\3\2\2\2\fZ\3\2\2\2\16a\3\2\2\2\20m\3\2\2\2\22r\3\2\2"+
		"\2\24u\3\2\2\2\26x\3\2\2\2\30{\3\2\2\2\32\u0084\3\2\2\2\34\u008e\3\2\2"+
		"\2\36\u0093\3\2\2\2 \u0097\3\2\2\2\"\u009d\3\2\2\2$\u009f\3\2\2\2&\u00a7"+
		"\3\2\2\2()\7\3\2\2)-\5\4\3\2*,\5&\24\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-"+
		".\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\64\7\4\2\2\61\63\5\6\4\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2"+
		"\2\678\7\16\2\289\7\5\2\29:\7\6\2\2:\5\3\2\2\2;=\7\21\2\2<;\3\2\2\2<="+
		"\3\2\2\2=>\3\2\2\2>E\5\b\5\2?E\5\26\f\2@E\5 \21\2AE\5\30\r\2BE\5\20\t"+
		"\2CE\5\16\b\2D<\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2"+
		"\2\2EF\3\2\2\2FG\7\5\2\2G\7\3\2\2\2HK\5\f\7\2IK\5\n\6\2JH\3\2\2\2JI\3"+
		"\2\2\2KL\3\2\2\2LP\7\4\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\6\2\2T\t\3\2\2\2UV\7\34\2\2VW\7\20\2\2"+
		"WX\7\7\2\2XY\t\2\2\2Y\13\3\2\2\2Z[\7\35\2\2[\\\7\b\2\2\\]\5\32\16\2]^"+
		"\7\30\2\2^_\5\32\16\2_`\7\t\2\2`\r\3\2\2\2ab\7\20\2\2bc\7\b\2\2ch\5\32"+
		"\16\2de\7\n\2\2eg\5\32\16\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik"+
		"\3\2\2\2jh\3\2\2\2kl\7\t\2\2l\17\3\2\2\2mp\7\20\2\2nq\5\24\13\2oq\5\22"+
		"\n\2pn\3\2\2\2po\3\2\2\2q\21\3\2\2\2rs\7\27\2\2st\5\32\16\2t\23\3\2\2"+
		"\2uv\7\31\2\2vw\5\32\16\2w\25\3\2\2\2xy\7!\2\2yz\5\32\16\2z\27\3\2\2\2"+
		"{|\7\32\2\2|}\7\20\2\2}~\7\24\2\2~\177\5\32\16\2\177\31\3\2\2\2\u0080"+
		"\u0081\b\16\1\2\u0081\u0085\5\34\17\2\u0082\u0085\5\36\20\2\u0083\u0085"+
		"\5\"\22\2\u0084\u0080\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\u008b\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\24\2\2\u0088\u008a"+
		"\5\32\16\5\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\33\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7\b\2\2\u008f\u0090\7\23\2\2\u0090\u0091\7\t\2\2\u0091\u0092\5\32\16"+
		"\2\u0092\35\3\2\2\2\u0093\u0094\7\b\2\2\u0094\u0095\5\32\16\2\u0095\u0096"+
		"\7\t\2\2\u0096\37\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u009b\7\31\2\2\u0099"+
		"\u009c\5\32\16\2\u009a\u009c\5$\23\2\u009b\u0099\3\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009c!\3\2\2\2\u009d\u009e\t\2\2\2\u009e#\3\2\2\2\u009f\u00a1\7"+
		"\13\2\2\u00a0\u00a2\7\22\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\f"+
		"\2\2\u00a6%\3\2\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa"+
		"\7\b\2\2\u00aa\u00af\7\17\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ae\7\17\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b4\5\4\3\2\u00b4\'\3\2\2\2\17-\64<DJPhp\u0084\u008b\u009b\u00a3\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}