package Restaurants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Restaurants
You and a friend are trying to choose a restaurant to go to.
You both give your preferences of restaurants in separate lists.
You need to find a restaurant to go to that’s listed in both of your preferences that has the least index sum.
If there are ties, output all restaurants you could go to together.

Ex: Given the following lists...

list1 = ["A", "B", "C", "D"], list2 = ["D", "B", "C"], return [“B”] (“B” is the least index sum 1 + 1 whereas “D” is 3 + 0).
Ex: Given the following lists...

list1 = [“C”], list2 = [“D”], return [].

Time Complexity: O(n +m) where n is the length of list1 and m is len of list2.
Space Complexity O(n) because the map storing list n is the len of list 1

 */

public class Restaurants {

    public static List<String> findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> mapRestaurant = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;


        for (int i = 0; i < list1.length; i++) {
            mapRestaurant.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            String restaurant = list2[i];
            if (mapRestaurant.containsKey(restaurant)) {
                int indexSum = i + mapRestaurant.get(restaurant);
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(restaurant);
                } else if (indexSum == minIndexSum) {
                    result.add(restaurant);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] list1 = {"A", "B", "C", "D"};
        String[] list2 = {"D", "B", "C"};

        List<String> result = findRestaurant(list1, list2);
        System.out.println(result);
    }
}
