import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        if (n == 0) {
            ret.add("");
        } else if (n == 1) {
            ret.add("()");
        } else {
            for (int i = 0; i < n; i++) {
                for (String inner : generateParenthesis(i)) {
                    for (String outter : generateParenthesis(n - i - 1)) {
                        ret.add("(" + inner + ")" + outter);
                    }
                }
            }
        }
        return ret;
    }
}
