package Node;

import java.util.ArrayList;
import java.util.List;

public class FuncCallNode extends StatementNode {
    public String id;
    public List<MathExpressionNode> params = new ArrayList<>();
}
