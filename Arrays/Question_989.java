import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_989 {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int k = 34;
        int[] num = {1,2,0,0};
        sum(num,num.length - 1,k);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void sum(int[] num,int index,int k){
        num[index] += k;
        if(index == 0){
            while(num[index] != 0){
                int rem = num[index] % 10;
                list.add(rem);
                num[index] /= 10;
            }
            return;
        }
        int rem = num[index] % 10;
        list.add(rem);
        sum(num,index-1,num[index]/10);
    }
}
