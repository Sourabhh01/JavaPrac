package Arraysprac;

public class SecHighEle {
    public static int Sechigh(int[] a){
        int max1 = 0; int max2= 0;
        for (int i =0;i<a.length;i++){
            if (a[i]>max1)  {
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i]>max2 && a[i] !=max1){
                max2 = a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int [] a = { 1,3,4,3,10,6,7,9};
        System.out.println(Sechigh(a));
    }
}
