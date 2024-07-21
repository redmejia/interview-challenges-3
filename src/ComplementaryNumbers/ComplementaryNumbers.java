package ComplementaryNumbers;

/*
Given a positive number, return its complementary number.
Note: The complement of a number is the number that results from flipping every bit in the original number. (i.e. zero bits become one bits and one bits become zero bits).

Ex: Given the following number…

number = 27, return 4.
27 in binary (not zero extended) is 11011.
Therefore, the complementary binary is 00100 which is 4.

Time Complexity: O(1) because the operations(logarithm, bit manipulation) are performed in constant time.
Space Complexity: O(1) because the no additional space proportional to the input size is used.
 */

public class ComplementaryNumbers {

    public static int fincComplementary(int num) {

        int numBits = (int) (Math.floor(Math.log(num) / Math.log(2))) + 1;


        int mask = (1 << numBits) - 1;

        return num ^ mask;

    }

    public static void main(String[] args) {

        System.out.println(fincComplementary(27));

    }

}
