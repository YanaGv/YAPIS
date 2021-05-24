package Node;

public class MathOperationNode extends MathExpressionNode {
    public MathExpressionNode firstExp;
    public MathExpressionNode secondExp;
    public String op;

    @Override
    public String toString() {
        return firstExp.toString() + op + secondExp.toString();
    }
}
