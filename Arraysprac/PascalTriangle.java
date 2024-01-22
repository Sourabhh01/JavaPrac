package Arraysprac;

public class PascalTriangle
{
    public static void main(String[] args)
    {
        int[][] a = new int[6][];
        int space = a.length-1;
        a = pascal(a);
        for(int[] n:a)
        {
            for(int j=0; j<space; j++)
                System.out.print(" ");
            for(int n1:n)
            {
                System.out.print(n1+" ");
            }
            System.out.println(" ");
            space--;
        }
    }
    public static int[][] pascal(int[][] a)
    {
        for(int i=0; i<a.length; i++)
        {
            a[i] = new int[i+1];
            for(int j=0; j<a[i].length; j++)
            {
                if(j==0 || i==j)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        return a;
    }
}
