public class Kth_Missing_Positive_Number {
    
    // LEETCODE 1539. Kth Missing Positive Number

    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int num = 0;
        int index = 0;
        for(int i = 1;i <= arr[arr.length - 1];i++){
            if(count == k){
                return num;
            }
            if(arr[index] == i){
                index++;
                continue;
            }
            count++;
            num = i;
        }
        return arr[arr.length - 1] + (k - count);
    }
}
