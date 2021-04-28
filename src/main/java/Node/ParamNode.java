package Node;

public class ParamNode extends Node{
    public String id;
    public String type;
    public ParamNode (String s){
        this.type = s.split(" ")[0];
        this.id = s.split(" ")[1];
    }
}
