import Node.*;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.stream.Collectors;

public class SkretBaseVisitorImpl extends SkretBaseVisitor<Node> {
    public ProgramNode main = new ProgramNode();

    @Override
    public Node visitProgram(SkretParser.ProgramContext ctx) {

        SkretParser.SubprogramContext sctx = ctx.subprogram();
        ProgramNode programNode = new ProgramNode();
        programNode.statements = visitSubprogram(sctx).statements;
        programNode.functions = ctx.func()
                .stream()
                .map(this::visitFunc)
                .collect(Collectors.toList());
        this.main = programNode;
        return this.main;
    }

    @Override
    public SubprogramNode visitSubprogram(SkretParser.SubprogramContext ctx) {

        var subprogramNode = new SubprogramNode();

        subprogramNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());
        if (ctx.RETURN().getText().length() > 6)
            subprogramNode.returnValue = ctx.RETURN().getText().split(" ")[1];
        return subprogramNode;
    }

    @Override
    public StatementNode visitStatement(SkretParser.StatementContext ctx) {
        StatementNode statementNode = new StatementNode();
        if (ctx.block() != null) {
            statementNode = visitBlock(ctx.block());
        } else if (ctx.io() != null) {
            statementNode = visitIo(ctx.io());
        } else if (ctx.var_define() != null) {
            statementNode = visitVar_define(ctx.var_define());
        } else if (ctx.landing_expression() != null) {
            statementNode = visitLanding_expression(ctx.landing_expression());
        } else if (ctx.var_action() != null) {
            statementNode = visitVar_action(ctx.var_action());
        } else if (ctx.func_call() != null) {
            statementNode = visitFunc_call(ctx.func_call());
        }
        return statementNode;
    }

    @Override
    public BlockNode visitBlock(SkretParser.BlockContext ctx) {
        BlockNode blockNode = new BlockNode();
        if (ctx.for_block() != null) {
            blockNode = visitFor_block(ctx.for_block());
        } else if (ctx.if_block() != null) {
            blockNode = visitIf_block(ctx.if_block());
        }
        blockNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());
        return blockNode;
    }

    @Override
    public ForBlockNode visitFor_block(SkretParser.For_blockContext ctx) {
        ForBlockNode forBlockNode = new ForBlockNode();
        forBlockNode.fromParam = ctx.ID(0).getText();
        if (ctx.ID(1) != null) {
            forBlockNode.toParam = ctx.ID(1).getText();
        } else if (ctx.NUM() != null) {
            forBlockNode.toParam = ctx.NUM().getText();
        }
        return forBlockNode;
    }

    @Override
    public IfBlockNode visitIf_block(SkretParser.If_blockContext ctx) {
        IfBlockNode ifBlockNode = new IfBlockNode();
        ifBlockNode.firstExp = visitMath_expression(ctx.math_expression(0));
        ifBlockNode.secondExp = visitMath_expression(ctx.math_expression(1));
        ifBlockNode.compareOp = ctx.COMPARE_OP().getText();
        return new IfBlockNode();
    }

    @Override
    public MathExpressionNode visitMath_expression(SkretParser.Math_expressionContext ctx) {
        MathExpressionNode mathExpressionNode = new MathExpressionNode();
        if (ctx.typeCast() != null) {
            mathExpressionNode = visitTypeCast(ctx.typeCast());
        } else if (ctx.inBrackets() != null) {
            mathExpressionNode = visitInBrackets(ctx.inBrackets());
        } else if (ctx.math_expression(0) != null) {
            MathOperationNode mathOperationNode = new MathOperationNode();
            mathOperationNode.firstExp = visitMath_expression(ctx.math_expression(0));
            mathOperationNode.secondExp = visitMath_expression(ctx.math_expression(1));
            mathOperationNode.op = ctx.OP().getText();
            mathExpressionNode = mathOperationNode;
        } else if (ctx.have_value() != null) {
            mathExpressionNode = visitHave_value(ctx.have_value());
        }
        return mathExpressionNode;
    }

    @Override
    public TypeCastNode visitTypeCast(SkretParser.TypeCastContext ctx) {
        TypeCastNode typeCastNode = new TypeCastNode();
        typeCastNode.type = ctx.TYPE().getText();
        typeCastNode.mathExpression = visitMath_expression(ctx.math_expression());
        return typeCastNode;
    }

    @Override
    public InBracketsNode visitInBrackets(SkretParser.InBracketsContext ctx) {
        InBracketsNode inBracketsNode = new InBracketsNode();
        inBracketsNode.mathExpression = visitMath_expression(ctx.math_expression());
        return inBracketsNode;
    }

    @Override
    public HaveValueNode visitHave_value(SkretParser.Have_valueContext ctx) {
        HaveValueNode haveValueNode = new HaveValueNode();
        if (ctx.ID() != null) {
            haveValueNode.param = ctx.ID().getText();
        } else if (ctx.NUM() != null) {
            haveValueNode.param = ctx.NUM().getText();
        }
        return haveValueNode;
    }

    @Override
    public IoNode visitIo(SkretParser.IoContext ctx) {
        IoNode ioNode = new IoNode();
        ioNode.operator = ctx.STREAM_OP().getText();
        ioNode.mathExpression = visitMath_expression(ctx.math_expression());
        return ioNode;
    }

    @Override
    public VarDefineNode visitVar_define(SkretParser.Var_defineContext ctx) {
        VarDefineNode varDefineNode = new VarDefineNode();
        varDefineNode.type = ctx.PARAM().getText().split(" ")[0];
        varDefineNode.id = ctx.PARAM().getText().split(" ")[1];
        if (ctx.ASSIG() != null) {
            if (ctx.math_expression() != null) {
                varDefineNode.expression = visitMath_expression(ctx.math_expression());
            } else if (ctx.list_special_define() != null) {
                varDefineNode.expression = visitList_special_define(ctx.list_special_define());
            }
        }
        return varDefineNode;
    }

    @Override
    public ListSpecialDefineNode visitList_special_define(SkretParser.List_special_defineContext ctx) {
        ListSpecialDefineNode listSpecialDefineNode = new ListSpecialDefineNode();
        for(TerminalNode n: ctx.NUM()){
            listSpecialDefineNode.numbers.add(n.getText());
        }
        return listSpecialDefineNode;
    }

    @Override
    public LandingExpressionNode visitLanding_expression(SkretParser.Landing_expressionContext ctx) {
        LandingExpressionNode landingExpressionNode = new LandingExpressionNode();
        landingExpressionNode.id = ctx.ID().getText();
        landingExpressionNode.op = ctx.OP().getText();
        landingExpressionNode.mathExpression = visitMath_expression(ctx.math_expression());
        return landingExpressionNode;
    }

    @Override
    public VarActionNode visitVar_action(SkretParser.Var_actionContext ctx) {
        VarActionNode varActionNode = new VarActionNode();
        if (ctx.binary_expression() != null) {
            varActionNode = visitBinary_expression(ctx.binary_expression());
        } else if (ctx.var_reform() != null) {
            varActionNode = visitVar_reform(ctx.var_reform());
        }
        varActionNode.id = ctx.ID().getText();
        return varActionNode;
    }

    @Override
    public BinaryExpressionNode visitBinary_expression(SkretParser.Binary_expressionContext ctx) {
        BinaryExpressionNode binaryExpressionNode = new BinaryExpressionNode();
        binaryExpressionNode.op = ctx.BINARY_OP().getText();
        binaryExpressionNode.mathExpression = visitMath_expression(ctx.math_expression());
        return binaryExpressionNode;
    }

    @Override
    public VarReformNode visitVar_reform(SkretParser.Var_reformContext ctx) {
        VarReformNode varReformNode = new VarReformNode();
        varReformNode.mathExpression = visitMath_expression(ctx.math_expression());
        return varReformNode;
    }

    @Override
    public FuncCallNode visitFunc_call(SkretParser.Func_callContext ctx) {
        FuncCallNode funcCallNode = new FuncCallNode();
        funcCallNode.id = ctx.ID().getText();
        funcCallNode.params = ctx.math_expression()
                .stream()
                .map(this::visitMath_expression)
                .collect(Collectors.toList());
        return funcCallNode;
    }

    @Override
    public FunctionNode visitFunc(SkretParser.FuncContext ctx) {
        FunctionNode functionNode = new FunctionNode();
        functionNode.type = ctx.PARAM(0).getText().split(" ")[0];
        functionNode.id = ctx.PARAM(0).getText().split(" ")[1];
        for (int i = 1; i<ctx.PARAM().size();i++){
            functionNode.params.add(new ParamNode(ctx.PARAM(i).getText()));
        }
        return functionNode;
    }
}
