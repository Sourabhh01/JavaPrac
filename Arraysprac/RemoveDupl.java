package Arraysprac;
public class RemoveDupl {
    public static int remove(int []a){
        int n = a.length-1;
        int newsize = n;
        for (int i =0;i<newsize ;i++){
            for (int j =i+1;j<newsize ;j++){
                if (a[i] == a[j]){
                    for (int k =i+1;k<newsize;k++){
                        a[k] = a[k+1];
                    }
                    newsize--;
                }
            }
        }
        return newsize;
    }
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,5,5,6,7};
        int n = remove(a);
        for (int i = 0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
