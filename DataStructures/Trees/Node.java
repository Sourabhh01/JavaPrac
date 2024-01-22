package Arraysprac.DataStructures.Trees;

public class Node {
    Object ele;
    Node left;
    Node right;

    public Node(Object ele, Node left, Node right) {
        this.ele = ele;
        this.left = left;
        this.right = right;
    }

    public Node(Object ele) {
        this.ele = ele;
    }
}
