import java.util.*;

public class Solution {
    public int lengthOfLastWord(String s) {
        int start = -1, end = -1;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) != ' ') {
                if (end == -1) {
                    end = i;
                }
            } else {
                if (end != -1) {
                    start = i + 1;
                    return end - start + 1;
                }
            }
        }
        if (end != -1) return end + 1;
        return 0;
    }
}
