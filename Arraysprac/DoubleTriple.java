package Arraysprac;

import java.util.Scanner;

public class DoubleTriple {
    public static int tripleDouble(long num1,long num2){
        String strNum1 = num1 + "";
        String strNum2 = num2 + "";

        for (int i = 0; i <= 9; i++) {
            String triple = Integer.toString(i) + Integer.toString(i) + Integer.toString(i);
            String doubleNum = Integer.toString(i) + Integer.toString(i);

            if (strNum1.contains(triple) && strNum2.contains(doubleNum)) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        int result = tripleDouble(num1, num2);
        System.out.println(result);
    }
}
