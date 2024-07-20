package SwapWords;

import java.util.Arrays;

public class SwapWords {

    public static String swap(String str) {

        String[] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length -1; i >=0 ; i--) {

            reversed.append(words[i]);
            reversed.append(" ");

        }

        return reversed.toString();

    }

    public static void main(String[] args) {
        System.out.println(swap("World Hello"));
        System.out.println(swap("I am Reynaldo"));
        System.out.println(swap("u ♥️ I "));
        // Hello World
        // Reynaldo am I
        // I ♥️ u
    }

}
