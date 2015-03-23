import java.util.*;

public class Solution {
    public String countAndSay(int n) {
        StringBuilder prev = new StringBuilder("1");
        for (int t=2; t<=n; t++) {
            StringBuilder sb = new StringBuilder("");
            char c = prev.charAt(0);
            int cnt = 1;
            for (int i=1; i<prev.length(); i++) {
                if (prev.charAt(i) == prev.charAt(i-1)) {
                    cnt++;
                } else {
                    sb.append((char)(cnt + '0'));
                    sb.append(c);
                    c = prev.charAt(i);
                    cnt = 1;
                }
            }
            sb.append((char)(cnt + '0'));
            sb.append(c);
            prev = sb;
        }
        return prev.toString();
    }
}
