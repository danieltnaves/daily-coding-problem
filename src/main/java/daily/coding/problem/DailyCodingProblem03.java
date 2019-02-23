package daily.coding.problem;

import java.util.Collections;
import java.util.LinkedList;

public class DailyCodingProblem03 {

    /**
     *
     * This problem was asked by Google.
     *
     * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
     * and deserialize(s), which deserializes the string back into the tree.
     *
     * For example, given the following Node class
     *
     * class Node:
     * def __init__(self, val, left=None, right=None):
     * self.val = val
     * self.left = left
     * self.right = right
     * The following test should pass:
     *
     * node = Node('root', Node('left', Node('left.left')), Node('right'))
     * assert deserialize(serialize(node)).left.left.val == 'left.left'
     *
     *
     *                root
     *               /    \
     *            left   right
     *             /
     *        left.left
     */

}

class Node {

    String val;
    Node left;
    Node right;

    Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printInOrder() {

        System.out.println(val);

        if (this.left != null)
            this.left.printInOrder();

        if (this.right != null)
            this.right.printInOrder();
    }

    public String serialize(Node node) {
        if (node == null) {
            return null;
        }
        return String.format("%s|%s|%s", node.val, serialize(node.left), serialize(node.right));
    }

    public Node unserialize(String serialized) {
        LinkedList<String> nodeValues = new LinkedList<>();
        Collections.addAll(nodeValues, serialized.split("\\|"));
        return helper(nodeValues);
    }

    private Node helper(LinkedList<String> serialized) {
        String nodeValue = serialized.removeFirst();
        if (nodeValue.equals("null"))
            return null;
        return new Node(nodeValue, helper(serialized), helper(serialized));
    }

}
