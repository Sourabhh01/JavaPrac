package Arraysprac.DataStructures;

public class QNode {
    Object ele;
    QNode next;

    public QNode(Object ele, QNode next) {
        this.ele = ele;
        this.next = next;
    }

    public QNode(Object ele) {
        this.ele = ele;
    }
}
