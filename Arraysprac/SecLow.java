package Arraysprac;

public class SecLow {
    public static void main(String[] args) {
        int[] a = {4,1,2,3,5,6,7};
        int  min=a[0];
        int min1=0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]<min) min= a[i];
            }
            min1 = min;
            if(a[i]<min1 && a[i]>min) min1 = a[i];
        }
        System.out.println(min1);
    }
}
