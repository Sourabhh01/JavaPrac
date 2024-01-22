package Arraysprac.DataStructures;

public class LinkedList {
    Node head;
    Node tail;
    int count =0;

    public void insertFirst(Object ele){
        Node node = new Node(ele);
        node.next=head;
        head=node;
        count +=1;
        if(tail==null) tail = head;
    }

    public int size() {
        return count;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.ele);
            temp = temp.next;
        }
    }
    public void add(Object ele){
        if(count == 0 || head == null){
            insertFirst(ele);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(ele,null);
        count++;

    }
    public void insertLast(Object ele) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(ele);
        temp.next = node;
        tail = node;
        tail.next = null;
        count++;
    }
    public Object getEle(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.ele;
    }
    public void insert(Object ele, int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            insertFirst(ele);
            return;
        }
        if (index == size()) {
            insertLast(ele);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(ele, temp.next);
        temp.next = node;
        count++;
    }
    public Object removeFirst() {
        Object ele = head.ele;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        count--;
        return ele;
    }

    public Object remove(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            return removeFirst();
        }
        if (index == size()) {
            return removeLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Object ele = temp.next.ele;
        temp.next = temp.next.next;
        count--;
        return ele;
    }

    public Object removeLast() {
        if (count == 1) {
            return removeFirst();
        }
        Object ele = tail.ele;
        Node secondLast = getAdd(size() - 2);
        tail = secondLast;
        tail.next = null;
        count--;
        return ele;
    }

    public Node getAdd(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

