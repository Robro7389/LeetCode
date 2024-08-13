package Arrays;

//1217. Minimum cost to move the chips to the same position.

public class Minimum_cost_to_move_chips_to_the_same_position {
    public int minCostToMoveChips(int[] num) {
        int oddCount = 0;
        int evenCount = 0;
        for(int val : num){
            if(val % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        return Math.min(evenCount,oddCount);
    }
}
