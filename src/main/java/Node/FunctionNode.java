package Node;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends Node {
    public String type;
    public String id;
    public List<ParamNode> params = new ArrayList<>();
    public String returnValue = null;
    public List<StatementNode> statements = new ArrayList<>();

    public String toString() {
        String varType = type.substring(1, type.length() - 1);
        if (varType.equals("element")) {
            varType = "int";
        } else if (varType.equals("list")) {
            varType = "int[]";
        } else if (varType.equals("")) {
            varType = "void";
        }
        String func = "public static " + varType + " " + id + "(";
        for (ParamNode par : params) {
            func += par.toString() + ",";
        }
        try {
            func = func.substring(0, func.lastIndexOf(","));
        } catch (Exception ex) {
        }
        func += ")";
        return func;
    }
}
