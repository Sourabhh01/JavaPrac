package Arraysprac.DataStructures;

public class UserProgram {
    public static void main(String[] args) {
//        Node first = null;
//        first = new Node(10,null);
//        first.next = new Node(20,null);
//        first.next.next = new Node(30,null);
        LinkedList a = new LinkedList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.display();
        System.out.println("=============");
        a.insertLast(60);
        a.display();
        System.out.println("==============");
        a.insert(25, 1);
        a.display();
        System.out.println("***************************");
        System.out.println(a.getEle(3));
        System.out.println("=======================");
        System.out.println(a.removeFirst());
        System.out.println("------------------");
        a.display();
        System.out.println("#######################");
        System.out.println(a.remove(2));
        a.display();
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        System.out.println(a.removeLast());
        a.display();

        System.out.println(a.size());

    }
}
