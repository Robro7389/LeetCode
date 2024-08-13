import java.util.Arrays;

//1854. Maximum Population Year.

public class Question_1854 {
    public int maximumPopulation(int[][] logs) {
        int firstYear = logs[0][0];
        int lastYear = logs[logs.length-1][1];
        for(int[] log : logs){
            int min = Arrays.stream(log).min().getAsInt();
            firstYear = Math.min(min,firstYear);
            int max = Arrays.stream(log).max().getAsInt();
            lastYear = Math.max(lastYear,max);
        }
        int[] arr = new int[lastYear - firstYear + 1];
        for(int[] log : logs){
            int inc = log[0];
            int dec = log[1];
            arr[inc - firstYear]++;
            arr[dec - firstYear]--;
        }

        int run = 0;
        int maxRun = 0;
        int maxYear = logs[0][0];

        for(int i = 0;i < arr.length;i++){
            run += arr[i];
            if(run > maxRun){
                maxRun = run;
                maxYear = i + firstYear;
            }
        }
        return maxYear;
    }
}
