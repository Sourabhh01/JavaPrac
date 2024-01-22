package Arraysprac;

public class Rotate90 {
    public static void main(String[] args) {
        int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = new int[3][3];
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                b[i][j]=a[j][i];
            }
        }
        System.out.println("After Transpose");
        for (int[] n :b) {
            for (int n1:n) {
                System.out.print(n1+"\t");
            }
            System.out.println();
        }
        System.out.println("after rotate at 90");
        for(int i =0;i<a.length;i++){
            for(int j =a[i].length-1;j>=0;j--){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
    }
}}
