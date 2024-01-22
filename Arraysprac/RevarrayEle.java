package Arraysprac;

public class RevarrayEle {
    public static void reverseTwoDigitEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] <= 99) { // Check if it's a two-digit element
                int tensDigit = arr[i] / 10; // Get the tens digit
                int onesDigit = arr[i] % 10; // Get the ones digit
                arr[i] = onesDigit * 10 + tensDigit; // Reverse the digits
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {32, 45, 18, 7, 94};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseTwoDigitEle(arr);

        System.out.println("\nArray with Reversed Two-Digit Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
