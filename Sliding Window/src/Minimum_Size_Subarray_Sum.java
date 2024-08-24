public class Minimum_Size_Subarray_Sum {
    //209.Minimum Size Subarray Sum

    public int minSubArrayLen(int target, int[] arr) {
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;

        for(int end = 0;end < arr.length;end++){
            windowSum += arr[end];

            while(windowSum >= target){
                minLength = Math.min(minLength,end - start + 1);
                windowSum -= arr[start];
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
