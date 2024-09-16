import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens){
            if(isOperation(token)){

                operation(stack,token);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();

    }
    public boolean isOperation(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public void operation(Stack<Integer> st, String operation){
        switch (operation){
            case "+": {
                /*int a = st.pop();
                int b = st.pop();*/
                st.push(st.pop() + st.pop());
                break;
            }
            case "-": {
                int a = st.pop();
                int b = st.pop();

                st.push(b - a);
                break;
            }
            case "*": {
                st.push(st.pop() * st.pop());
                break;
            }
            case "/": {
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
                break;
            }
        }

    }

    public static void main(String[] args) {
        /*String[] tokens1 = {"2", "1", "+", "3", "*"};*/
        String[] tokens2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        ReversePolishNotation rpn = new ReversePolishNotation();
        System.out.println(rpn.evalRPN(tokens2));

    }
}
