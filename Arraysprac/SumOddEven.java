package Arraysprac;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int [] a = new int[size];
        int OddSum =0;
        int EvenSum = 0;
        for (int i =0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i =0;i<a.length;i++)
        {
            if(i % 2 ==0) EvenSum += a[i];
            else OddSum +=a[i];
        }
        System.out.println("sum of Evenarr is : "+EvenSum);
        System.out.println("sum of Oddarr is : "+OddSum);
    }
}
