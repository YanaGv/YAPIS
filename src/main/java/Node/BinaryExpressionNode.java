package Node;

public class BinaryExpressionNode extends VarActionNode{
    public String op;
    public MathExpressionNode mathExpression;

    @Override
    public String toString() {
        String bin = "for(int i=0;i<" + id + ".lenght();i++)";
        //int a[] = {1,2,3,4};
        // a add 5
        String aString = "";
        int[] a = {1,2,3,4};
        a = new int[] {1,2,3,4,5};

        int[] temp = a;
        for (int e: a){
            aString += a+",";
        }
        aString += "5";
        return  null;
    }
}
