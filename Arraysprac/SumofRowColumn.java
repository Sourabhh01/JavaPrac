package Arraysprac;

public class SumofRowColumn {
    public static void sumofrow(int[][]a){
        for (int i=0;i<a.length;i++){
            int rowSum =0;
            for (int j=0;j<a[i].length;j++){
                rowSum += a[i][j];
            }
            System.out.println(rowSum);
        }
    }
    public static void sumofcol(int[][]a){
        for (int i=0;i<a.length;i++){
            int colSum =0;
            for (int j=0;j<a[i].length;j++){
                colSum += a[j][i];
            }
            System.out.println(colSum);
        }
    }
    public static void main(String[] args) {
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("sum of rows ");
        sumofrow(a);
        System.out.println("sum of column");
        sumofcol(a);
    }
}
