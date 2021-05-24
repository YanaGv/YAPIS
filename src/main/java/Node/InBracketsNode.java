package Node;

public class InBracketsNode extends MathExpressionNode {
    public MathExpressionNode mathExpression;

    @Override
    public String toString() {
        return "(" + mathExpression.toString() + ")";
    }
}
