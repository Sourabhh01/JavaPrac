package Arraysprac;

import java.util.Scanner;

public class snakePattern5x5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number!");
        int n =sc.nextInt();
        for (int i =1;i<=n;i++){
            if(i%2!=0){
                int k= (n*i)-4;
                for(int j=1;j<=n;j++){
                    System.out.print(k+"\t");
                    k++;
                }
            }
            else {
                int k = i * n;
                for (int j = 1; j <= n; j++) {
                    System.out.print(k+"\t");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
