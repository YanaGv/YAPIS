package Node;

public class VarDefineNode extends VarActionNode {
    public String type;
    public String id;
    public MathExpressionNode expression;

    @Override
    public String toString() {
        String varType = type.substring(1, type.length() - 1);
        if (varType.equals("element")) {
            varType = "int";
        } else if (varType.equals("list")) {
            varType = "int[]";
        }
        String def = varType + " " + id;
        if (expression != null) {
            def += "=" + expression.toString();
        }
        return def + ";";
    }
}
