package Node;

public class TypeCastNode extends MathExpressionNode {
    public String type;
    public MathExpressionNode mathExpression;

    @Override
    public String toString() {
        String stringType = "(";
        if (type == "[element]") {
            stringType += "int";
        } else if (type == "[int]") {
            stringType += "int";
        }
        stringType += ")";
        return stringType + mathExpression.toString();
    }
}
