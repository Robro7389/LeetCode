import java.util.Arrays;

public class K_Radius_Subarray_Averages {
    //2090.K Radius Subarray Averages

    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] average = new int[n];
        Arrays.fill(average,-1);

        long[] prefix = new long[n + 1];

        for(int i = 0;i < n;i++){
            prefix[i + 1] = nums[i] + prefix[i];
        }

        for(int i = k;i < n-k;i++){
            int left = i - k;
            int right = i + k;
            long sum = prefix[right + 1] - prefix[left];
            int avg = (int)(sum/(2 * k + 1));
            average[i] = avg;
        }

        return average;
    }
}
