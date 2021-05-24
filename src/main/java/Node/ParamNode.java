package Node;

public class ParamNode extends Node {
    public String id;
    public String type;

    public ParamNode(String s) {
        this.type = s.split(" ")[0];
        this.id = s.split(" ")[1];
    }

    public String toString() {
        String varType = type.substring(1, type.length() - 1);
        if (varType.equals("element")) {
            varType = "int";
        } else if (varType.equals("list")) {
            varType = "int[]";
        }
        return varType + " " + id;
    }
}
