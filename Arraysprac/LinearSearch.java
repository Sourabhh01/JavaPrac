package Arraysprac;

public class LinearSearch {
    public static int search(int a[],int key){
        for (int i = 0;i<a.length;i++){
        if( a[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]= {2,6,5,8,9,7};
        int key = 9;
        System.out.println(search(a,key));
    }
}
