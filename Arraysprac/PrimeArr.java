package Arraysprac;

import java.util.Scanner;

public class PrimeArr {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i=2;i<= n/2;i++){
            if (n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        for (int i =0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i =0;i<a.length;i++) {
            if (isPrime(a[i])) System.out.println(a[i]);
        }
    }
}
