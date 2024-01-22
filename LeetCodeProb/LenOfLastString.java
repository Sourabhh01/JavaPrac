package LeetCodeProb;

public class LenOfLastString {
    public static void main(String[] args) {
        String s = "hello world";
        String []a  = s.split(" ");
        String  a1 = a[a.length-1];
        int count = 0;
        for(int i = 0;i<a1.length();i++){
            count++;
        }
        System.out.println(count);

//        String []a  = s.split(" ");
//        return a[a.length-1].length();
    }
}
