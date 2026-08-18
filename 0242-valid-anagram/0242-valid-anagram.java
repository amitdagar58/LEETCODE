import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        } 
        else {
            return false;
        }
    }
}