import java.util.*;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<List<String>>();
        List<String> root = new ArrayList<String>();
        root.add(String.valueOf(s.charAt(0)));
        ret.add(root);
        for (int i=1; i<s.length(); i++) {
            List<List<String>> nret = new ArrayList<List<String>>();
            for (List<String> list: ret) {
                String last = list.get(list.size() - 1);
                if (isPalindrome(last)) {
                    List<String> nlist = new ArrayList<String>(list);
                    nlist.add(String.valueOf(s.charAt(i)));
                    nret.add(nlist);
                }
                if (!(i == s.length()-1 && !isPalindrome(last + s.charAt(i)))) {
                    list.remove(list.size() - 1);
                    list.add(last + s.charAt(i));
                    nret.add(list);
                }
            }
            ret = nret;
        }
        return ret;
    }

    public boolean isPalindrome(String str) {
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
}
