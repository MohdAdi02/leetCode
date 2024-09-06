import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> set = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;


        for(end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);
            if(set.containsKey(currentChar)){
                start =Math.max(set.get(currentChar)+1,start);
            }
            set.put(currentChar,end);

            maxLength = Math.max(maxLength, end - start +1);
        }
        return maxLength;
    }
}
