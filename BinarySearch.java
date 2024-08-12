public class BinarySearch
{
    public int search(int[] nums, int target) {

        int i =0;
        int j = nums.length-1;

        while (i <= j) {
            int mid =i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target < nums [mid] ){
                j = mid - 1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]a){
        int [] arr = {1,2,3,4,5};
        int target = 2;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(arr,target));
    }
}
