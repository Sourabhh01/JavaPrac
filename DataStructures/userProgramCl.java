package Arraysprac.DataStructures;

public class userProgramCl {
        public static void main(String[] args) {
            CircularLinkedList c = new CircularLinkedList();
            c.insert(10);
            c.insert(30);
            c.insert(30);
            c.insert(40);
            c.insert(50);

            System.out.println(c.size());
            c.display();
            System.out.println("-----------");
            c.delete(50);
            c.display();
            System.out.println(c.size());
        }
}