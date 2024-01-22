package Arraysprac;

public class SecHigh {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7};
        int  max=0;
        int max1=0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[j]>a[i]) max= a[j];
            }
            if(a[i]>max1 && a[i]!=max) max1 = a[i];
        }
        System.out.println(max1);
    }
}
