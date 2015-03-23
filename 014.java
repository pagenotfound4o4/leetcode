import java.util.*;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (strs[j].length() <= i || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
