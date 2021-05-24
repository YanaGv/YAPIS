package Node;

public class IoNode extends StatementNode {
    public String operator;
    public MathExpressionNode mathExpression;
    public String toString(){
        String ioString = "";
        if (operator.contains("o")){
            ioString += "System.out.print("+mathExpression.toString()+");";
        }else if (operator.contains("i")) {
            ioString += "Scanner console = new Scanner(System.in);";
            ioString += mathExpression.toString() + "=console.nextInt();";
        }
        return ioString;
    }
}
