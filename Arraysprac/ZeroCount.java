package Arraysprac;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = { 1,0,3,0,20,10};
        int count = 0;
        for (int i =0;i<a.length;i++) {
            if (a[i] == 0) count ++;
        }
        System.out.println(count);
    }
}
