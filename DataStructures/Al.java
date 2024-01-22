package Arraysprac.DataStructures;

public class Al {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(12);
        a.add(14);
        a.add(16);
        a.add(18);
        a.add(20);
        System.out.println("Before modif");
        for (int  i=0;i< a.size();i++){
            System.out.println(a.get(i));}
        a.set(24,4);
        a.addPos(43,3);
        a.remove(2);
        System.out.println(a.indexOf(16));
        System.out.println("after");
        for (int  i=0;i< a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
