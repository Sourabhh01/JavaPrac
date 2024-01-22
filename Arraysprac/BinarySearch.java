package Arraysprac;

public class BinarySearch {
    public static int search(int[]a,int key) {
        int st = 0;
        int end = a.length-1;
        while (st<=end){
            int mid = ((st+end)/2);
            if(key == a[mid]) return mid;
            else if(key <a[mid]) end = mid-1;
            else st = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,6,7};

        int key = 5;
        System.out.println(search(a,key));
    }
}
