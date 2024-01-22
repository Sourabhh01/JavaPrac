package Arraysprac;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] a) {
        int[] b = new int[a.length];
        for (int i =0;i<a.length;i++){
            int n1 = (int) (Math.random()*a.length-1);
            while (true){
                if (b[n1]==0) {
                    b[n1] = a[i];
                    break;
                }
                else n1= (int) (Math.random()*a.length-1) +1;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int [] b = shuffle(a);
        System.out.println(Arrays.toString(b));
    }
}