package Arraysprac;

import java.util.Arrays;
import java.util.Scanner;

public class NumToLetter {

    public static void printWord(int n) {
        convertNum((n / 100000) % 1000, "lakhs");
        convertNum((n / 1000) % 100, "thouands");
        convertNum((n / 100) % 10, "hundred");
        convertNum((n % 100), "");
    }

    public static void convertNum(int num, String word) {
        String[] oneDigit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen", };
        String[] twoDigit = { "", "", "twenty", "thirty", "forty ", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (num <= 19) {
            System.out.print(oneDigit[num] + " ");
        } else
            System.out.print(twoDigit[num / 10] + oneDigit[num % 10] + " ");
        if (num != 0)
            System.out.print(word + " ");
    }
    public static void convertNumbertoletter() {
        int n = 9142;
        convertNum((n / 100000) % 1000, "");
        convertNum((n / 1000) % 100, "");
        convertNum((n / 100) % 10, "");
        convertNum((n % 100), "");
    }

    public static void convertletter(int num, String word) {
            String[] oneDigit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                    "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen", };
            String[] twoDigit = { "", "", "twenty", "thirty", "forty ", "fifty", "sixty", "seventy", "eighty", "ninety" };

            if (num <= 19) {
                System.out.print(oneDigit[num] + " ");
            } else
                System.out.print(twoDigit[num / 10] + oneDigit[num % 10] + " ");
            if (num != 0)
                System.out.print(word + " ");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printWord(n);
        System.out.println();
        convertNumbertoletter();
    }
}