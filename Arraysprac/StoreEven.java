package Arraysprac;
import java.util.Scanner;
public class StoreEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        int j = 0;
        for (int i =0;i<a.length;i++) {
            int n1= sc.nextInt();
            if (n1%2==0)
                a[j] = n1;
            j++;
        }
        for (int k :a){
            System.out.println(k);
        }
    }
}
