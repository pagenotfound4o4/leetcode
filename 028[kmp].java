import java.util.*;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] next = init(needle);
        int q = 0;
        for (int i=0; i<haystack.length(); i++) {
            while (q > 0 && needle.charAt(q) != haystack.charAt(i)) q = next[q-1];
            if (needle.charAt(q) == haystack.charAt(i)) q++;
            if (q == needle.length()) return i - q + 1;
        }
        return -1;
    }

    public int[] init(String B) {
        int[] next = new int[B.length()];
        next[0] = 0;
        int k = 0;
        for (int q=1; q<B.length(); q++) {
            while (k > 0 && B.charAt(k) != B.charAt(q)) k = next[k-1];
            if (B.charAt(k) == B.charAt(q)) k++;
            next[q] = k;
        }
        return next;
    }
}
