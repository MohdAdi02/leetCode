import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int [] left = new int [n];
        left [0] = 1;
        for(int i =1; i<n; i++){
            left[i] = nums[i-1] * left[i-1];
        }

        int [] right = new int [n];
        right[n-1]= 1;
        for(int i= n-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int [] ans = new int [n];
        for(int i =0; i<n; i++){
            ans[i] = left[i]*right[i];
        }

        return ans;
    }
    public static void main(String[]a){
        int []arr = {1,2,3,5};
        ProductArrayExceptSelf pae = new ProductArrayExceptSelf();
        System.out.println(Arrays.toString(pae.productExceptSelf(arr)));
    }
}
