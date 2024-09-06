import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPalindrome lp = new LongestPalindrome();
        lp.longestPalindrome(s);
    }
    public int longestPalindrome(String s) {
        HashMap<Character, Integer > map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int length = 0;
        boolean oddFound = false;

        for(int freq: map.values()){
            if(freq %2 ==0){
                length = freq+ length;
            }else {
                length = freq+length-1;
                oddFound = true;
            }
        }
        if(oddFound){
            length +=1;
        }
        System.out.println(length);
        return length;

    }
}
