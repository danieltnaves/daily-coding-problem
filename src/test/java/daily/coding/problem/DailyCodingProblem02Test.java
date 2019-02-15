package daily.coding.problem;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DailyCodingProblem02Test {

    @Test
    public void testProductOfAllNumbers() {
        assertThat(new int[] { 120, 60, 40, 30, 24 },
                is(DailyCodingProblem02.productOfAllNumbers(new int[] { 1, 2, 3, 4, 5 })));
        assertThat(new int[] { 2, 3, 6 },
                is(DailyCodingProblem02.productOfAllNumbers(new int[] { 3, 2, 1 })));
    }

    @Test
    public void testProductOfAllNumbersWithDivision() {
        assertThat(new int[] { 120, 60, 40, 30, 24 },
                is(DailyCodingProblem02.productOfAllNumbersWithDivision(new int[] { 1, 2, 3, 4, 5 })));
        assertThat(new int[] { 2, 3, 6 },
                is(DailyCodingProblem02.productOfAllNumbersWithDivision(new int[] { 3, 2, 1 })));
    }
}
