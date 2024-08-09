import java.util.Stack;

public class ReverseWord {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        Stack<String> st = new Stack<>();
        String word = "";
        for(int i =0; i<s.length();i++){
            while(i<s.length() && str[i]== ' '){
                i++;
            }
            while(i<s.length() && str[i] != ' '){
                word +=str[i];
                i++;
            }
            st.push(word);
            word = "";
        }
        String ans = "";
        while(!st.empty()){
            String top = st.pop();
            ans = ans + " " +top;
        }
        System.out.println(ans.trim());
        return ans.trim();

    }
}
