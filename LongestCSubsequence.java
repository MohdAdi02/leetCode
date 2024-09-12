public class LongestCSubsequence {
    int [][] dp;

    public int lcs(String str1, String str2){

        int m = str1.length();
        int n = str2.length();

        // Create a memoization table initialized to -1
        dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return lcshelper(str1,str2, m-1, n-1);
    }
    public int lcshelper(String text1, String text2, int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }else if(text1.charAt(m) == text2.charAt(n)){
            dp[m][n] = lcshelper(text1,text2,m-1,n-1)+1;
        }else{
            dp[m][n] = Math.max(lcshelper(text1,text2,m-1,n),lcshelper(text1,text2,m,n-1));
        }
        return dp[m][n];

    }














        /*int m = str1.length();
        int n = str2.length();

        int [][] dp = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                if(m == 0 || n == 0){
                    dp[i][j] =0;
                }else if(str1.charAt(i) == str2.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }*/
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        LongestCSubsequence lcs = new LongestCSubsequence();
        System.out.println(lcs.lcs(text1,text2));
    }
}
