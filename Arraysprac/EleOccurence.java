package Arraysprac;

public class EleOccurence {

    public static void countOccurrences(int[] arr) {
        int n = arr.length;
        boolean[] counted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue; // Skip elements that have already been counted
            }

            int count = 1; // Initialize count to 1 for the current element

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    counted[j] = true; // Mark the element as counted
                    count++; // Increment the count
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " time(s).");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 3, 4, 5, 4, 5};

        countOccurrences(arr);
    }
}
