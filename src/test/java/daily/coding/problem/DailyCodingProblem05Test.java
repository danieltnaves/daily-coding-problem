package daily.coding.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DailyCodingProblem05Test {

    @Test
    public void testPairConstruction() {
        Assert.assertEquals(Pair.car(new Pair(3, 4)), 3);
        Assert.assertEquals(Pair.cdr(new Pair(3, 4)), 4);
    }


}
