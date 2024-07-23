package FindtheNumber;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an array of integers, nums, and a value k, return the kth largest element.

Ex: Given the following array nums…

[1, 2, 3], k = 1, return 3.
Ex: Given the following array nums…

[9, 2, 1, 7, 3, 2], k = 5, return 2.

Time Complexity:
Sorting list Collection.sort() sorts the list decending order. The time is O(nlogn) where n is the number of elements in the list.

Space Complexity:
O(n) collection.sort uses TrimSort which has a space of O(n) temporay storge.

Accessing the k-th Element is O(1)

 */

public class FindtheNumber {

    public static int findNumber(ArrayList<Integer> list, int k) {

        Collections.sort(list, Collections.reverseOrder());

        return list.get(k - 1);


    }


    public static void main(String[] args) {

        int[] myList = {9, 2, 1, 7, 3, 2};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : myList) {
            list.add(i);
        }

        System.out.println(findNumber(list, 5));
        // return 2

    }

}
