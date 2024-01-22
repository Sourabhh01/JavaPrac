package Arraysprac;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[]a){
        for (int i=0;i<a.length-1;i++){
            int index = i;
            for (int j=i+1;j<a.length;j++)  {
                if(a[j]<a[index]) index = j;
                if(i!=index){
                    int temp = a[i];
                    a[i] = a[index];
                    a[index]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []a={9,1,0,5,8,7,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
