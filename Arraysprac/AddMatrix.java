package Arraysprac;

public class AddMatrix {
    public static void main(String[] args) {
        int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] c= new int[a.length][a.length];
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
               c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int[] n :c) {
            for (int n1:n) {
                System.out.print(n1+"\t");
            }
            System.out.println();
        }
    }
}
