import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        final String[] map = new String[] {" ", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz"};
        List<String> ret = new ArrayList<String>();
        ret.add("");
        for (int i=0; i<digits.length(); i++) {
            int d = digits.charAt(i) - '0';
            List<String> nlist = new ArrayList<String>();
            for (String str : ret) {
                for (int j=0; j<map[d].length(); j++) {
                    nlist.add(str + map[d].charAt(j));
                }
            }
            ret = nlist;
        }
        return ret;
    }
}
