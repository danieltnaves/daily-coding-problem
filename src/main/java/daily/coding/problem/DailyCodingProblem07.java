package daily.coding.problem;

public class DailyCodingProblem07 {

    /**
     * Very inefficient because we need to recalculate the values
     *
     * O(2^n)
     *
     */
    public static int decode(String encoded) {

        if (encoded.startsWith("0")) {
            return 0;
        } else if (encoded.length() <= 1) {
            //cover empty strings
            return 1;
        }

        int total = 0;

        if (Integer.parseInt(encoded.substring(0,2)) <= 26) {
            total += decode(encoded.substring(2, encoded.length()));
        }

        total += decode(encoded.substring(1, encoded.length()));

        return total;
    }

    public static int decodeMemoized(String encoded) {
        return helper(encoded, new int[encoded.length() + 1]);
    }

    /**
     * Using dynamic programming to store intermediate results
     *
     * O(n)
     *
     */
    private static int helper(String encoded, int[] memo) {
        if (encoded.startsWith("0")) {
            return 0;
        } else if (encoded.length() <= 1) {
            //cover empty strings
            return 1;
        }

        if (memo[encoded.length()] != 0) {
            return memo[encoded.length()];
        }

        int total = 0;

        if (Integer.parseInt(encoded.substring(0, 2)) <= 26) {
            total += helper(encoded.substring(2, encoded.length()), memo);
        }

        total += helper(encoded.substring(1, encoded.length()), memo);

        memo[encoded.length()] = total;

        return total;
    }
}
