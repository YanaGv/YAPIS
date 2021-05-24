package Node;

import java.util.ArrayList;
import java.util.List;

public class ListSpecialDefineNode extends MathExpressionNode {
    public List<String> numbers = new ArrayList<>();

    @Override
    public String toString() {
        String nums = "";
        for (String n :numbers){
            nums += n + ",";
        }
        nums = nums.substring(0, nums.lastIndexOf(","));
        return "{"+nums+"}";
    }
}
