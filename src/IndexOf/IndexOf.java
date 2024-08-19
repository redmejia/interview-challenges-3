package IndexOf;

/*
Given two strings s and t, return the index of the first occurrence of t within s if it exists; otherwise, return -1.

Ex: Given the following strings s and t…

s = "abc", t = "a", return 0.
Ex: Given the following strings s and t…

s = "abc", t = "abcd", return -1.
Time Complexity: Loops from i = 0 to i = s.length - t.lenght which is O(n-m+1) times where n is the length of s and m is lenght t. Simplifies to O(n-m) which is O(n) in the worst case
substring takes O(m)
Space Complexity: The sub strign creates bew string lenght m in each iteration, but since the total space usage does not grow with each iteration (the substring is discarded)
O(m). the constant spcace is O(1)
Final Complexity:
time : O(n x m)
space : O(m)
 */

public class IndexOf {

    public static int indexOf(String s, String t) {

        if (t.length() > s.length()) return -1;

        for (int i = 0; i <= s.length() - t.length(); i++) {

            String subStr = s.substring(i, i + t.length());

            if (subStr.equals(t)) {
                return i;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        String s = "hello", t = "l";
        System.out.println(indexOf(s, t));
        // return 2
    }
}
