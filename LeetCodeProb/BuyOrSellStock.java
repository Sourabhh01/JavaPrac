package LeetCodeProb;

public class BuyOrSellStock {
    public static void main(String[] args) {
        int [] a = {2,7,8,8,3,2,1};
        int max = 0;
        int min = a[0];
        for (int i = 1;i<a.length;i++){
            max = Math.max(max,a[i] - min);
            min = Math.min(a[i],min);
        }
        System.out.println(max);
    }
}
