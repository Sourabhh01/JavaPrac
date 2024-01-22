package Arraysprac;

public class LinearSeach {
    public static void search(int[]a,int key){
        for (int i = 0;i<a.length;i++){
            if(a[i] == key) {
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,6,7};

        int key = 5;
        search(a,key);
    }
}
