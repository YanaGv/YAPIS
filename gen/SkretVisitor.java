// Generated from D:/work/yapis/src/main/java\Skret.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SkretParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SkretVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SkretParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SkretParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(SkretParser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SkretParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SkretParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(SkretParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(SkretParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(SkretParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#var_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_action(SkretParser.Var_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(SkretParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#var_reform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_reform(SkretParser.Var_reformContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo(SkretParser.IoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#landing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanding_expression(SkretParser.Landing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(SkretParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(SkretParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#inBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBrackets(SkretParser.InBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#var_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_define(SkretParser.Var_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#have_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHave_value(SkretParser.Have_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#list_special_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_special_define(SkretParser.List_special_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SkretParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SkretParser.FuncContext ctx);
}