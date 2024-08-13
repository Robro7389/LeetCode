package Arrays;

//53.Maximum Subarray

public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currMax = nums[0];
        for(int i = 1;i < nums.length;i++){
            currMax = Math.max(nums[i],nums[i] + currMax);
            maxSum = Math.max(currMax,maxSum);
        }

        return maxSum;
    }
}
