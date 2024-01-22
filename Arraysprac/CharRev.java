package Arraysprac;

import java.util.Scanner;

public class CharRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter characters");
         String ch = sc.next();
         char[] a = ch.toCharArray();
         for (int i =a.length-1;i>=0;i--){
             System.out.print(a[i]);
             if(i!=0) System.out.print(",");
         }
    }
}
