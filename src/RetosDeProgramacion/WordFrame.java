package RetosDeProgramacion;

public class WordFrame {

    public static void wordFrame(String text) {

        String[] words = text.split(" ");

        int maxLen = 0;

        for(String word: words) {
            if(word.length() > maxLen) maxLen = word.length();
        }

        System.out.println("*".repeat(maxLen+4));


        for(String word: words) {
            // "%-s Left-justifying within the specified width  "
            System.out.printf("* %-" + maxLen + "s *\n", word);
        }

        System.out.println("*".repeat(maxLen+4));

    }


    public static void main(String[] args) {
        wordFrame("Hello World 🌎");
        wordFrame("This is an Update");
        wordFrame(":( Your PC ran into a problem and needs to restart.");

        /*
         *********
         * Hello *
         * World *
         * 🌎    *
         *********
         **********
         * This   *
         * is     *
         * an     *
         * Update *
         **********
         ************
         * :(       *
         * Your     *
         * PC       *
         * ran      *
         * into     *
         * a        *
         * problem  *
         * and      *
         * needs    *
         * to       *
         * restart. *
         ************
         */
    }

}
