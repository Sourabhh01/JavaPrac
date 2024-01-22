package Arraysprac;

import java.util.Arrays;

public class EvenOddSort {
    public static void main(String[] args) {
        int []a = {1,2,4,5,9,3,6,8};
        int [] b = new int [a.length];
        int index = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i] %2==0) {
                b[index] = a[i];
                index++;
            }
        }
        for (int i = 0;i<a.length;i++){
            if(a[i] %2!=0) {
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
