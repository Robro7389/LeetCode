package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1886. Determine Whether Matrix Can Be Obtained By Rotation

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        sum(num,list,num.length - 1,k);
        Collections.reverse(list);
        return list;
    }
    public void sum(int[] num,List<Integer> list,int index,int k){
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
        sum(num,list,index-1,num[index]/10);
    }
}
