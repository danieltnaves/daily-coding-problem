package daily.coding.problem;

public class DailyCodingProblem02 {

    /**
     * This problem was asked by Uber.
     *
     * Given an array of integers, return a new array such that each element at index i of the new array is the product
     * of all the numbers in the original array except the one at i.
     *
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
     * was [3, 2, 1], the expected output would be [2, 3, 6].
     *
     * Follow-up: what if you can't use division?
     */

    /**
     * The complexity of this algorithm is O(N^2)
     */
    static int[] productOfAllNumbers(int[] numbers) {

        int[] productArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            Integer acumulator = null;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (acumulator == null) {
                        acumulator = numbers[j];
                    } else {
                        acumulator *= numbers[j];
                    }
                }
            }
            productArray[i] = acumulator;
        }

        return productArray;
    }

    /**
     * The complexity of this algorithm is O(N)
     */
    static int[] productOfAllNumbersWithDivision(final int[] numbers) {
        int product = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            product *= numbers[i];
        }

        int[] productArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            productArray[i] = product / numbers[i];
        }

        return productArray;
    }

}
