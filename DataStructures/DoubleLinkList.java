package Arraysprac.DataStructures;

public class DoubleLinkList {
    NodeDL head;
    NodeDL tail;
    int count =0;
    public void insertFirst(Object ele){
        NodeDL node = new NodeDL(ele);
        node.next=head;
        node.pre=null;
        if(head!=null) head.pre=node;
        head = node;
        count+=1;
    }
    public int size(){
        return count;
    }
    public void display(){
        NodeDL temp = head;
        while (temp!=null){
            System.out.print(temp.ele +" , ");
            tail = temp;
            temp =temp.next;
        }
        System.out.println( "END");
    }
    public Object get(int index){
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        NodeDL temp =head;
        for (int i=0; i<index;i++) {
        temp=temp.next;
        }
        return temp.ele;
    }
    public void reverse(){
        NodeDL temp = tail;
        while (temp!=null){
            System.out.print(temp.ele +" , ");
            temp = temp.pre;
        }
        System.out.println("Start");
    }

    public void insertLast(Object ele) {
        if (head == null) {
            insertFirst(ele);
            return;
        }
        NodeDL temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        NodeDL node = new NodeDL(ele);
        node.next = null;
        temp.next = node;
        node.pre = temp;
        tail = node;
        count++;

    }
    public void insert(Object ele, int index) {
        NodeDL temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        NodeDL node = new NodeDL(ele);
        node.next = temp.next;
        node.pre = temp;
        temp.next = node;
        node.next.pre = node;
        count++;
    }
    public Object removeFirst() {
        if (head!=null){
        Object ele = head.ele;
        head = head.next;
        if (head != null) {
            head.pre = null;
        }
        count--;
            return ele;
        }
        return null;
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
        NodeDL temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Object ele = temp.next.ele;
        temp.next = temp.next.next;
        temp.next.pre = temp;
        count--;
        return ele;
    }
    public Object removeLast(){
        if (count==1) return removeFirst();
        Object ele = tail.ele;
        NodeDL SecLast = getAdd(size() - 2);
        tail = SecLast;
        tail.next = null;
        count--;
        return ele;
    }
    public NodeDL getAdd(int index) {
        NodeDL temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            }
        return temp;
    }
    public NodeDL find(Object ele) {
        NodeDL temp = head;
        while (temp != null) {
            if (temp.ele == ele)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void add(Object ele) {
        if (count == 0) {
            insertFirst(ele);
            return;
        }
        NodeDL temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new NodeDL(null, tail, ele);
        tail = temp.next;
        count++;
    }
    public void addAfter(Object after, Object ele) {
        NodeDL node = new NodeDL(ele);
        NodeDL p = find(after);
        if (p == null) {
            System.out.println("Ele Not Found");
            return;
        }
        node.next = p.next;
        p.next = node;
        node.pre = p;
        node.next.pre = node;

        count++;
    }
}
