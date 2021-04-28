package Node;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public List<StatementNode> statements = new ArrayList<>();
    public List<FunctionNode> functions = new ArrayList<>();
}
