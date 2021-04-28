import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        SkretLexer lexer = new SkretLexer(new ANTLRFileStream("src/main/resources/test.txt"));
        SkretParser parser = new SkretParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        SkretBaseVisitorImpl visitor = new SkretBaseVisitorImpl();
        visitor.visit(tree);
        System.out.println("end");
    }
}
