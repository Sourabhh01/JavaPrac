package LeetCodeProb;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanTonum(String s){
        Map <Character,Integer> m = new HashMap<>();
        m.put('M',1000);
        m.put('D',500);
        m.put('C',100);
        m.put('L',50);
        m.put('X',10);
        m.put('V',5);
        m.put('I',1);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))
                res -= m.get(s.charAt(i));
            else res += m.get(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "MCMCVII";
        System.out.println(romanTonum(s));
    }
}
