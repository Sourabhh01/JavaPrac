package Arraysprac;

import java.util.Arrays;

public class AddingEleAtGivenInd {
    public static int[] Add(int index,int[] a,int ele){
        int[] b = new int[a.length+1];
        for (int i=0;i<index;i++){
            b[i] = a[i];
        }
        b[index]=a[ele];
        for (int i =index;i<a.length;i++){
            b[i+1] = a[i];
        }
        return b;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int [] b = Add(3,a,5);
        System.out.println(Arrays.toString(b));
    }
}
