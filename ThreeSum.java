import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i= 0; i<arr.length; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i] +arr[j] +arr[k];
                if(sum > 0){
                    k--;
                } else if (sum< 0) {
                    j++;
                }else {
                    res.add(Arrays.asList(arr[i], arr[j] , arr[k]));
                    j++;
                    while(j< k && arr[j] == arr[j-1]){
                        j++;
                    }
                }
            }
        }
        System.out.println(res);
        return res;
    }


    /*public List<List<Integer>> threeSum(int []arr){
        Set <List<Integer>> answer = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                for(int k =0; k<arr.length; k++){
                    if(i != j && j!= k && arr[i]+arr[j]+arr[k] ==0){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        answer.add(ans);
                    }
                }
            }
        }
        return new ArrayList<>(answer); // convert set to array list
    }*/

    public static void main(String[] args) {
        int []arr ={-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(arr);
     }
}
