package Arraysprac;

import java.util.Arrays;

public class ArrayShiftFrMid {
    public static int [] shiftEle(int []a){
        int[] b = new int[a.length];
        int mid = a.length%2==0 ? a.length/2 : (a.length/2) +1 ;
        int k = mid;
        for (int i =0;i<mid;i++){
            b[i] = a[k++];
        }
        int n =0;
        for (int i =mid;i<a.length;i++){
            b[i] = a[n++];
        }
        return b;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int [] b = shiftEle(a);
        System.out.println(Arrays.toString(b));
    }
}
