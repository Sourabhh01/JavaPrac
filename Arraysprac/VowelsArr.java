package Arraysprac;

import java.util.Scanner;

public class VowelsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         char [] ch = new char[size];
         char[] vowels = {'a','e','i','o','u'};
        for (int i =0;i<ch.length;i++) {
            ch[i] = sc.next().charAt(0);}
        for (int i =0;i<ch.length;i++)
            for (int j = 0; i < vowels.length; i++) if (ch[i] == vowels[j]) System.out.println(ch[i]);
    }
}
