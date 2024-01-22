package Arraysprac.DataStructures;

public class NodeDL {
    NodeDL next;
    NodeDL pre;
    Object ele;

    public NodeDL(NodeDL next, NodeDL pre, Object ele) {
        this.next = next;
        this.pre = pre;
        this.ele = ele;
    }

    public NodeDL(Object ele) {
        this.ele = ele;
    }
}
