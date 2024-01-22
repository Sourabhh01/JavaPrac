package LeetCodeProb;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstr {
    public static  int lengthOfLongestSubstring(String s){
        HashSet<Character> uniqueChars = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxSubstringLength = 0;

        while (end < s.length()) {
            if (!uniqueChars.contains(s.charAt(end))) {
                uniqueChars.add(s.charAt(end));
                maxSubstringLength = Math.max(maxSubstringLength, end - start + 1);
                end++;
            } else {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
        }
        return maxSubstringLength;
    }
    public static void main(String[] args) {
        String s = "abhchgjjsddsmahdhabcdef";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
