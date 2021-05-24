import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream codePointCharStream = CharStreams.fromFileName(args[0]);
        SkretLexer lexer = new SkretLexer(codePointCharStream);
        SkretParser parser = new SkretParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        SkretBaseVisitorImpl visitor = new SkretBaseVisitorImpl(args[1]);
        visitor.visit(tree);
        System.out.println("end");
    }
}
