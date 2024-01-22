package Arraysprac;

public class FindMax {
    public static int max(int[] a){
        int max = 0;
        for (int i =0;i<a.length;i++){
            if (a[i]>max)  max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int [] a = { 1,3,4,3,10,6,7,9};
        System.out.println(max(a));
    }
}
