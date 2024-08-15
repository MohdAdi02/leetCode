public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = "";

        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                str += c;
            }
        }
        String str1 = str.toLowerCase();
        int i =0;
        int j  =str1.length()-1;
        while(i<=j){
            if(str1.charAt(i) == str1.charAt(j)){
                i= i+1;
                j--;
            }else{
                return false;
            }

        }
        return true;
    }
    public static void main(String []arg){
//        String s = "A man, a plan, a canal: Panama";
          String s =  "race a car";

        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(s));
    }
}
