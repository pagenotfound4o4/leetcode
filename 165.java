import java.util.*;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] l0 = version1.split("\\.");
        String[] l1 = version2.split("\\.");
        int p = 0, q = 0;
        while (p<l0.length && q<l1.length) {
            int t = Integer.parseInt(l0[p]) - Integer.parseInt(l1[q]);
            if (t > 0) return 1;
            if (t < 0) return -1;
            p++;
            q++;
        }
        while (p < l0.length) {
            if (Integer.parseInt(l0[p]) > 0) {
                return 1;
            }
            p++;
        }
        while (q < l1.length) {
            if (Integer.parseInt(l1[q]) > 0) {
                return -1;
            }
            q++;
        }
        return 0;
    }
}
