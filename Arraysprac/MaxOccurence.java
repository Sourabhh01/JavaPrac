package Arraysprac;

public class MaxOccurence {
    public static void main(String[] args) {
        int [] a = {2,3,7,8,3,3,3,9,6,1,9,5,3};
        int max = 0;
        int ele=0;
        for(int i = 0;i<a.length;i++) {
            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = ' ';
                }
            }
            if (count > max && a[i] != ' ') {
                ele = a[i];
                max = count;
            }
            if (a[i] != ' ') System.out.println(a[i] + " = " + count);
        }
        System.out.println("max ele is "+ele +" count is " +max);
    }
}
