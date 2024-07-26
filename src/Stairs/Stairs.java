package Stairs;
/*
 Given a staircase with N steps and the ability to climb either one or two steps at a time, return the total number of ways to arrive at the top of the staircase.

Ex: Given the following value of N…

N = 2, return 2
1 step + 1 step
2 steps
Ex: Given the following value of N…

N = 3, return 3
1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step

Time Complexity: O(n) because I define ways array ina a single from 2 to N
Space Complexity : O(n) for the ways array used to store the number of ways to reach each step.

 */


public class Stairs {

    public static int countWays(int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;

        int[] ways = new int[n + 1];

        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n ; i++) {
            ways[i] = ways[i-1] + ways[i-2];

            System.out.println(ways[i]);
        }


        return ways[n];

    }


    public static void main(String[] args) {


        System.out.println("count : " + countWays(5));

    }

}
