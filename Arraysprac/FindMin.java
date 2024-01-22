package Arraysprac;

public class FindMin {
    public static int max(int[] a){
        int min = a[0];
        for (int j : a) {
            if (j < min) min = j;
        }
        return min;
    }
    public static void main(String[] args) {
        int [] a = { 1,3,4,3,10,6,7,9};
        System.out.println(max(a));
    }
}
