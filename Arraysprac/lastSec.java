package Arraysprac;

import java.util.Scanner;

public class lastSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        for (int i =0;i<a.length;i++) {
            a[i] = sc.nextInt();}
            System.out.println(" Last 2nd element is: "+ a[a.length -2]);
    }
}
