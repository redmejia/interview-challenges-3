package FindtheNumber;

import java.util.ArrayList;
import java.util.Collections;

public class FindtheNumber {

    public static int find(ArrayList<Integer> list, int k) {

       Collections.sort(list, Collections.reverseOrder());

        return list.get(k-1);

    }


    public static void main(String[] args) {

        int[] myList = {9, 2, 1, 7, 3, 2};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : myList) {
            list.add(i);
        }

        find(list, 5);


    }

}
