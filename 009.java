import java.util.*;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;
        int y = 0;
        while (y < x) {
            y = y * 10 + x % 10;
            x /= 10;
            if (x == y) return true;
            if (x / 10 > 0 && x / 10 == y) return true;
        }
        return false;
    }
}
