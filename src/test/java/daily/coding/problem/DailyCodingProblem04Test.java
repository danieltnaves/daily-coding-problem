package daily.coding.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DailyCodingProblem04Test {

    @Test
    public void findFirstMissingNumber() {
        Assert.assertEquals(DailyCodingProblem04.findFirstMissingNumber(Arrays.asList(3, 4, -1, 1)), 2);
        Assert.assertEquals(DailyCodingProblem04.findFirstMissingNumber(Arrays.asList(1, 2, 3, 4, 5)), -1);
        Assert.assertEquals(DailyCodingProblem04.findFirstMissingNumberLinear(Arrays.asList(3, 4, -1, 1)), 2);
        Assert.assertEquals(DailyCodingProblem04.findFirstMissingNumberLinear(Arrays.asList(1, 2, 3, 4, 5)), -1);
    }


}
