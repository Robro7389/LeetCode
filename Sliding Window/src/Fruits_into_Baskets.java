import java.util.HashMap;

public class Fruits_into_Baskets {
    //904. Fruits into baskets
    public int totalFruit(int[] fruits) {
        int start = 0;
        int count = 0;
        int maxSize = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int end = 0;end < fruits.length;end++){
            map.put(fruits[end],map.getOrDefault(fruits[end],0) + 1);
            count++;

            if(map.size() > 2){
                int val = map.get(fruits[start]);
                int key = fruits[start];
                do{
                    start++;
                    count--;
                    val--;
                }while(fruits[start] == key);
                if(val == 0){
                    map.remove(key);
                }
                else{
                    map.put(key,val);
                }
            }
            maxSize = Math.max(maxSize,count);
        }
        return maxSize;
    }


}
