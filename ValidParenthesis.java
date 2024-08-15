import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        if(s.length() %2!=0){
            return false;
        }else {
            for(char c:str){
                if(c == '('){
                    stack.push(')');
                } else if (c =='[') {
                    stack.push(']');
                } else if (c=='{') {
                    stack.push('}');
                } else if (stack.isEmpty() || stack.pop()!=c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []a){
        String str = "([}}])";
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid(str));


    }

}
