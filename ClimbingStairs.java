public class ClimbingStairs {
    public int climbStairs(int n) {
        // if(n==0){
        //    return 1;
        //}else if(n==1){
        //     return 1;
        // }else if(n == 2){
        //     return 2;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);



        if(n==1){
            return 1;
        }
        int [] ways = new int [n+1];
        ways[1] =1;
        ways[2] =2;
        for(int i =3; i<=n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];

    }

    public static void main(String[] args) {
        int n = 4;
        ClimbingStairs cs =  new ClimbingStairs();
        System.out.println(cs.climbStairs(n));
    }
}
