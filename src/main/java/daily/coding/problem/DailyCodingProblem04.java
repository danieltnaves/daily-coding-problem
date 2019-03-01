package daily.coding.problem;

import com.google.common.primitives.Ints;

import java.util.*;
import java.util.stream.Collectors;

public class DailyCodingProblem04 {

    /**
     * This problem was asked by Stripe.
     *
     * Given an array of integers, find the first missing positive integer in linear time and constant space. In other
     * words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and
     * negative numbers as well.
     *
     * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
     *
     * You can modify the input array in-place.
     */
    public static int findFirstMissingNumber(List<Integer> numbers) {

        //O(n log n) quick sort
        Collections.sort(numbers);

        //O(n)
        List<Integer> filteredList = numbers.stream().filter(k -> k > 0).collect(Collectors.toList());

        //O(n)
        for (int i = 0; i < filteredList.size(); i++) {
            if (filteredList.get(i) != i + 1)
                return i + 1;
        }

        return -1;
    }

    public static int findFirstMissingNumberLinear(List<Integer> numbers) {
        //O(n)
        Set<Integer> set = new HashSet<>(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (!set.contains(i + 1))
                return i + 1;
        }
        return -1;
    }

}
