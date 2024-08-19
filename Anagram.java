import java.util.Arrays;
public class Anagram {
    public boolean isAnagram(String s, String t) {
        s=s.replace(" ","");
        t=t.replace(" ","");

        s= s.toLowerCase();
        t= t.toLowerCase();

        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();

        Arrays.sort(char_s);
        Arrays.sort(char_t);

        System.out.println(Arrays.equals(char_s,char_t));
        return Arrays.equals(char_s,char_t);
    }

    public static void main(String[] args) {

        String str1 = "anagram";
        String str2= "nagram";
        Anagram ang = new Anagram();
        ang.isAnagram(str1,str2);

    }

}
