import java.util.*;

public class Solution {
    public String addBinary(String a, String b) {
        int pa = a.length()-1, pb = b.length()-1;
        String ans = "";
        int c = 0;
        while (pa>=0 && pb>=0) {
            int t = a.charAt(pa--) - '0' + b.charAt(pb--) - '0' + c;
            c = t / 2;
            t %= 2;
            ans = (char)(t + '0') + ans;
        }
        while (pa >= 0) {
            int t = a.charAt(pa--) - '0' + c;
            c = t / 2;
            t %= 2;
            ans = (char)(t + '0') + ans;
        }
        while (pb >= 0) {
            int t = b.charAt(pb--) - '0' + c;
            c = t / 2;
            t %= 2;
            ans = (char)(t + '0') + ans;
        }
        if (c > 0) {
            ans = '1' + ans;
        }
        return ans;
    }
}
