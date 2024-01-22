package Arraysprac;

import java.util.Scanner;

public class StringArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter String");
        String [] a = new String[size];
        for (int i =0;i<a.length;i++) {
            a[i] = sc.next();
        }
        for (int i =0;i<a.length;i++){
           if(i%2==0) System.out.println(a[i]);
        }
    }
}
