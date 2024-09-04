public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxCurrent =nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray ms = new MaxSubArray();
        ms.maxSubArray(arr);
    }

}
