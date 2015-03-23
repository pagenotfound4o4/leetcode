import java.util.*;

public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (r > l) {
            char lc = toLower(s.charAt(l)), rc = toLower(s.charAt(r));
            if (!isChar(lc)) {
                l++;
                continue;
            }
            if (!isChar(rc)) {
                r--;
                continue;
            }
            if (lc == rc) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public char toLower(char c) {
        if (c >= 'A' && c <= 'Z')
            return (char)(c - 'A' + 'a');
        return c;
    }

    public boolean isChar(char c) {
        return ((c >= 'a' && c<= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
}
