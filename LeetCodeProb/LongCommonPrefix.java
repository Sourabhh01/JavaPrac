package LeetCodeProb;

import java.util.Arrays;

public class LongCommonPrefix {

    static  String check(String s[]){
        int smallest_string = s[0].length();
        for (int i = 1; i < s.length; i++) {
            if(s[i].length()<smallest_string) smallest_string = s[i].length();
        }
        char toCheck = ' ';
        String match = "";
        for (int i = 0; i < smallest_string; i++) {
            toCheck = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                if(toCheck != s[j].charAt(i)) return match;
            }
            match += toCheck;
        }
        return  match;
    }
    public static void main(String[] args) {
        String []s = {"flower","flight","flow"};
        System.out.println(check(s));
    }
}
