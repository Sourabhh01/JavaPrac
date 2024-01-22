package Arraysprac;

import java.util.Scanner;

public class EvenElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        int EvenSum = 0;
        for (int i =0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i =0;i<a.length;i++) if(a[i]%2==0) EvenSum += a[i];

        System.out.println("Sum of EVen element is : " + EvenSum);
    }
}
