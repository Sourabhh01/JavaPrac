package Arraysprac;

import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        int sum =0;
        for (int i =0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i =0;i<a.length;i++)
        {
            sum += a[i];
        }
        System.out.println("sum of arr is : "+sum);
    }

}
