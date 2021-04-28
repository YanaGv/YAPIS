package Node;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends Node{
    public String type;
    public String id;
    public List<ParamNode> params = new ArrayList<>();
}
