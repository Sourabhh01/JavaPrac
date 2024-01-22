package Arraysprac;

public class OccurenceEle {
    public static void main(String[] args) {
        int [] a = {2,3,7,8,9,6,1,9,5,3};
        for(int i = 0;i<a.length;i++) {
            int count = 1;
            for(int j = i+1;j<a.length;j++) {
                if(a[i] == a[j]) {
                    count++;
                    a[j]=0;
                }
            }
            if (a[i]!=0) System.out.println(a[i] +" = " +count);
        }

    }
}
