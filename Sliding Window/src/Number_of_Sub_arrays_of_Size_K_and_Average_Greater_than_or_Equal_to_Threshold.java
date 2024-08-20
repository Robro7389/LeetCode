public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {

//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int currSum = 0;
        for(int i = 0;i < k;i++){
            currSum += arr[i];
        }

        if(currSum/k >= threshold){
            count++;
        }

        for(int i = k;i < arr.length;i++){
            currSum += arr[i] - arr[i - k];
            if(currSum/k >= threshold){
                count++;
            }
        }

        return count;
    }
}
