package daily.coding.problem;

import org.junit.Assert;
import org.junit.Test;

public class DailyCodingProblem07Test {

    @Test
    public void testDecode() {
        Assert.assertEquals( 3, DailyCodingProblem07.decode("111"));
        Assert.assertEquals( 2, DailyCodingProblem07.decode("11"));
        Assert.assertEquals( 21, DailyCodingProblem07.decode("1111111"));
    }

    @Test
    public void testDecodeMemoized() {
        Assert.assertEquals( 21, DailyCodingProblem07.decodeMemoized("1111111"));
    }

    @Test
    public void testDecodeInvalidData() {
        Assert.assertEquals( 0, DailyCodingProblem07.decode("0111"));
    }


}
