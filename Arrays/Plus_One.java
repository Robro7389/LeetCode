package Arrays;

//66. Plus One

public class Plus_One {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        return addition(digits,0,digits.length - 1);
    }

    public int[] addition(int[] num,int k,int index){
        num[index] += k;
        if(index == 0){
            if(num[index] > 9){
                int[] nextArr = new int[num.length + 1];
                nextArr[0] = 1;
                nextArr[1] = 0;
                for(int i = 2;i < nextArr.length;i++){
                    nextArr[i] = num[i-1];
                }
                return nextArr;
            }
            else{
                return num;
            }
        }
        int temp = num[index];
        num[index] %= 10;
        return addition(num,temp/10,index - 1);
    }
}
