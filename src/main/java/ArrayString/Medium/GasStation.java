package ArrayString.Medium;

import java.util.Arrays;

public class GasStation {
    /*
    There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
     */

    public static void main(String[] args) {
        System.out.println(
                canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})
        );
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int surplus = gas[i] - cost[i];
            totalSurplus += surplus;
            currentSurplus += surplus;

            // If current surplus is negative, reset the starting index
            if (currentSurplus < 0) {
                startingIndex = i + 1;
                currentSurplus = 0;
            }
        }

        // If total surplus is negative, return -1 as it's not possible to complete the circuit
        return totalSurplus >= 0 ? startingIndex : -1;
    }
}
