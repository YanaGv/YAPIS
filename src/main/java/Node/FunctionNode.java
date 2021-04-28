package Node;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends Node{
    public String type;
    public String id;
    public List<ParamNode> params = new ArrayList<>();
    public String returnValue;
    public List<StatementNode> statements = new ArrayList<>();
}
