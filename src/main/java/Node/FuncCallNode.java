package Node;

import java.util.ArrayList;
import java.util.List;

public class FuncCallNode extends StatementNode {
    public String id;
    public List<MathExpressionNode> params = new ArrayList<>();

    public String toString() {
        String func = id + "(";
        for (MathExpressionNode exp : params) {
            func += exp.toString() + ",";
        }
        try {
            func = func.substring(0, func.lastIndexOf(","));
        } catch (Exception ex) {
        }
        func += ");";
        return func;
    }
}
