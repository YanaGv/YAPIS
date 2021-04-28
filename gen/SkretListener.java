// Generated from D:/work/yapis/src/main/java\Skret.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SkretParser}.
 */
public interface SkretListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SkretParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SkretParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SkretParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(SkretParser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(SkretParser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SkretParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SkretParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SkretParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SkretParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(SkretParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(SkretParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(SkretParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(SkretParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(SkretParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(SkretParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#var_action}.
	 * @param ctx the parse tree
	 */
	void enterVar_action(SkretParser.Var_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#var_action}.
	 * @param ctx the parse tree
	 */
	void exitVar_action(SkretParser.Var_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(SkretParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(SkretParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#var_reform}.
	 * @param ctx the parse tree
	 */
	void enterVar_reform(SkretParser.Var_reformContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#var_reform}.
	 * @param ctx the parse tree
	 */
	void exitVar_reform(SkretParser.Var_reformContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(SkretParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(SkretParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#landing_expression}.
	 * @param ctx the parse tree
	 */
	void enterLanding_expression(SkretParser.Landing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#landing_expression}.
	 * @param ctx the parse tree
	 */
	void exitLanding_expression(SkretParser.Landing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMath_expression(SkretParser.Math_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMath_expression(SkretParser.Math_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(SkretParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(SkretParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#inBrackets}.
	 * @param ctx the parse tree
	 */
	void enterInBrackets(SkretParser.InBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#inBrackets}.
	 * @param ctx the parse tree
	 */
	void exitInBrackets(SkretParser.InBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#var_define}.
	 * @param ctx the parse tree
	 */
	void enterVar_define(SkretParser.Var_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#var_define}.
	 * @param ctx the parse tree
	 */
	void exitVar_define(SkretParser.Var_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#have_value}.
	 * @param ctx the parse tree
	 */
	void enterHave_value(SkretParser.Have_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#have_value}.
	 * @param ctx the parse tree
	 */
	void exitHave_value(SkretParser.Have_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#list_special_define}.
	 * @param ctx the parse tree
	 */
	void enterList_special_define(SkretParser.List_special_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#list_special_define}.
	 * @param ctx the parse tree
	 */
	void exitList_special_define(SkretParser.List_special_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkretParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SkretParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkretParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SkretParser.FuncContext ctx);
}