import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c: magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) ==0) {
                return false;
            }
            map.put(c,map.get(c)-1);

        }
        return true;
    }

    public static void main(String[] args) {
        String a ="aa";
        String b ="aba";
        RansomNote rn = new RansomNote();
        rn.canConstruct(a,b);
    }
}
