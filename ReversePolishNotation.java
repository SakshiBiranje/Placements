import java.io.IOException;
import java.util.Stack;
public class ReversePolishNotation {
    public static void main(String[] args) throws IOException{
        String[] tokens = { "2","2", "+", "2", "/"};
        ReversePolishNotation obj = new ReversePolishNotation();
        int result =obj.StackCalc(tokens);
        System.out.println(result);

    }
    public int StackCalc(String[] tokens)
    {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                s.push(s.pop() + s.pop());
            }
            else  if(token.equals("-")){
                s.push(-s.pop() + s.pop());
            }
            else  if(token.equals("*")){
                s.push(s.pop() * s.pop());
            }
            else  if(token.equals("/")){
                int n1 = s.pop();
                int n2 = s.pop();
                s.push(n2/n1);
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
       
            return s.pop();

    }
}
