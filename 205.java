import java.util.*;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s2t = new int[256];
        int[] t2s = new int[256];
        Arrays.fill(s2t, -1);
        Arrays.fill(t2s, -1);
        for (int i=0; i<s.length(); i++) {
            int a = s.charAt(i) - t.charAt(i);
            if (s2t[s.charAt(i)] == -1 && t2s[t.charAt(i)] == -1) {
                s2t[s.charAt(i)] = t2s[t.charAt(i)] = a;
            } else if (s2t[s.charAt(i)] != a || t2s[t.charAt(i)] != a) {
                return false;
            }
        }
        return true;
    }
}
