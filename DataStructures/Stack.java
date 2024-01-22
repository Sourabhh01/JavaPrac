package Arraysprac.DataStructures;

import java.util.NoSuchElementException;

public class Stack {
    SNode first;
    int count = 0;

    public void push(Object ele){
        if(first == null){
            first = new SNode(ele,null);
        return;
    }
        first = new SNode(ele,first);
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
        return first.ele;
    }
    public Object pop(){
        if(isEmpty()) throw new NoSuchElementException();
        Object ele = first.ele;
        first=first.next;
        count--;
        return ele;
    }
}
