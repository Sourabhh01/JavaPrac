package Arraysprac.DataStructures;

public class UserProgramDL {
    public static void main(String[] args) {
        DoubleLinkList d = new DoubleLinkList();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.insertFirst(5);
        d.insertLast(60);
        d.insert(25, 3);
        d.addAfter(30, 35);
        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());
        System.out.println(d.remove(5));
        System.out.println(d.get(2));
        d.display();
        d.reverse();
        System.out.println("===================");
        System.out.println(d.size());

    }
}
