package Node;

public class LandingExpressionNode extends StatementNode {
    public String id;
    public String op;
    public MathExpressionNode mathExpression;

    public String toString() {
        return id +" " + op + "=" + mathExpression.toString() + ";";
    }
}
