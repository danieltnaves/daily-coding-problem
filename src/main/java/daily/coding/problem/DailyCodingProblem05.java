package daily.coding.problem;

public class DailyCodingProblem05 {

    /**
     * This problem was asked by Jane Street.
     *
     * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
     * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
     *
     * Given this implementation of cons:
     *
     * def cons(a, b):
     *  def pair(f):
     *      return f(a, b)
     *  return pair
     *
     * Implement car and cdr.
     */

}

class Pair {

    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static int car(Pair pair) {
        return pair.x;
    }

    static int cdr(Pair pair) {
        return pair.y;
    }

}
