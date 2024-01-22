package Arraysprac;

public class ElelastIndex {
    public static int LastIndex(int[] a, int key) {
        int lastIndex = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == key) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        int [] a = { 1,3,4,3,10,6,7,9};
        int key = 9;

        int lastIndex = LastIndex(a, key);

        if (lastIndex != -1) {
            System.out.println("The last index of " + key + " is: " + lastIndex);
        } else {
            System.out.println(key + " not found in the array.");
        }
    }
}
