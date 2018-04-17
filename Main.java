import java.util.*;

public class Main {

    public static void main(String[] args){
        Image i = new Image();
        ArrayList<String> commands = Parser.parse("script1");
        Stack<Matrix> s = new Stack<Matrix>();
        Matrix identy = new Matrix(4, 4);
        identy.ident();
        s.push(identy);
        Parser.execute(commands, s, i);
    }

}
