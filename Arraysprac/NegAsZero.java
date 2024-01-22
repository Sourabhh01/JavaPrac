package Arraysprac;

public class NegAsZero {
    public static void replaceNegativesAndZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 0, 5, -1, 0, -7};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        replaceNegativesAndZero(arr);
        System.out.println("\nModified Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}
