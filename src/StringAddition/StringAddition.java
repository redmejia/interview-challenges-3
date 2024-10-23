package StringAddition;


// String Addition
//Given two non-negative numbers, num1 and num2 represented as strings, sum the integers together and return the result as a string.
//
//Ex: Given the following values for num1 and num2...
//
//num1 = “2”, num2 = “5”, return “7”.

// Time complexity O(max(N, M))
// N is the length of num1 and M is the length of num2

// Space Complexity O(max(N,M))
// The stringbuilder use to store the result requeires space optional to the lenght of the longer number.


public class StringAddition {


    public static String addition(String num1, String num2) {

        StringBuilder result = new StringBuilder();
        int carry = 0;

        int pt1 = num1.length() - 1;
        int pt2 = num2.length() - 1;

        while (pt1 >= 0 || pt2 >= 0 || carry != 0) {

            int digit;
            if (pt1 >= 0) {
                digit = num1.charAt(pt1) - '0';
                pt1 -= 1;
            } else {
                digit = 0;
            }

            int digit2;
            if (pt2 >= 0) {
                digit2 = num2.charAt(pt2) - '0';
                pt2 -= 1;
            } else {
                digit2 = 0;
            }

            int sum = digit + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {

        System.out.println(addition("7", "95"));

    }
}