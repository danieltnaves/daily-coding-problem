package daily.coding.problem;

import org.junit.Assert;
import org.junit.Test;

public class DailyCodingProblem03Test {

    @Test
    public void testSerializeAndUnserialize() {
        Node node = new Node("root",
                new Node("left", new Node("left.left", null, null), null),
                new Node("right", null, null));
        Assert.assertEquals(node.unserialize(node.serialize(node)).left.left.val, "left.left");
    }


}
