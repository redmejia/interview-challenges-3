package StringRepetition;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
Given a string s, return all of its repeated 10 character substrings.
Note: You may assume s only contains uppercase alphabetical characters.

Ex: Given the following string s…

s = "BBBBBBBBBBB", return ["BBBBBBBBBB"].
Ex: Given the following string s…

s = "ABABABABABABBBBBBBBBBB", return ["ABABABABAB","BBBBBBBBBB"].

Time Complexity: Is O(n) where is the number of itration in this case from 0 to 9.
Space Complexity : Is O(n) Where n is the lenght of subtring save in the ArrayList.

 */


public class StringRepetition {

    public static ArrayList<String> stringRepetition(String s) {

        HashMap<String, Integer> table = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {

            String subString = s.substring(i, i + 10);

            table.put(subString, table.getOrDefault(subString, 0) + 1);

        }

        ArrayList<String> repeatedSubStrings = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : table.entrySet()) {

            if (entry.getValue() > 1) {

                repeatedSubStrings.add(entry.getKey());

            }

        }

        return repeatedSubStrings;
    }


    public static void main(String[] args) {

        String s = "ABABABABABABBBBBBBBBBB";
        System.out.println(stringRepetition(s));
        // return ["ABABABABAB","BBBBBBBBBB"]
    }
}
