package Arraysprac;

public class BinaryRecur {
    public static int search(int[]a,int key,int st,int end){
        if (st>end) return -1;
        int mid = ((st+end)/2);
        if(key == a[mid]) return mid;
        else if(key<a[mid]) return search(a,key,st,mid-1);
        return search(a,key,mid+1,end);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,6,7};
        int key = 5;
        int st=0;
        int end  = a.length-1;
        System.out.println(search(a,key,st,end));
    }
}
