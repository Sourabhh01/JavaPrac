package Arraysprac.DataStructures;

import java.util.NoSuchElementException;

public class Queue {
    int count = 0;
    QNode head;
    QNode tail;

    public void add(Object ele){
        QNode node = new QNode(ele);
        if(head==null){
            head = node;
            tail = head;
            count++;
            return;
        }
        tail.next = node ;
        tail = tail.next;
        count++;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public Object peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return head.ele;
    }
    public Object poll() {
        if (isEmpty()) throw new NoSuchElementException();
        Object ele = head.ele;
        head = head.next;
        count--;
        if(head == null) tail = null;
        return ele;
    }
}
