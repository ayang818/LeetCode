import java.util.Arrays;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int allGas = 0;
        for (int i = 0; i < gas.length; i++) {
            allGas += gas[i];
        }
        int allCost = 0;
        for (int i = 0; i < cost.length; i++) {
            allCost += cost[i];
        }
        if (allGas < allCost) return -1;
        else {
            int tempGas = 0;
            int tempCost = 0;
            int local = 0;
            for (int i = 0; i < gas.length; i++) {
                tempCost += cost[i];
                tempGas += gas[i];
                // if (tempCost <= tempGas && i == gas.length-1) return local;
                if (tempCost > tempGas) {
                    tempCost = 0;
                    tempGas = 0;
                    local = i + 1;
                }
            }
            return local;
        }
    }
}