public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new LinkedList<String>();
        if (s == null || s.length()>12) return ret;
        for (int i=1; i<s.length()-2; i++) {
            if (i>3 || s.length()-i>9) continue;
            if (s.charAt(0)=='0' && i>1) continue;
            int numa = Integer.valueOf(s.substring(0, i));
            if (numa > 255) continue;
            for (int j=i+1; j<s.length()-1; j++) {
                if (j-i>3 || s.length()-j>6) continue;
                if (s.charAt(i)=='0' && j-i>1) continue;
                int numb = Integer.valueOf(s.substring(i, j));
                if (numb > 255) continue;
                for (int k=j+1; k<s.length(); k++) {
                    if (k-j>3 || s.length()-k>3) continue;
                    if (s.charAt(j)=='0' && k-j>1) continue;
                    if (s.charAt(k)=='0' && s.length()-k>1) continue;
                    int numc = Integer.valueOf(s.substring(j, k));
                    int numd = Integer.valueOf(s.substring(k, s.length()));
                    if (numc>255 || numd>255) continue;
                    String str = String.format("%d.%d.%d.%d", numa, numb, numc, numd);
                    ret.add(str);
                }
            }
        }
        return ret;
    }
}
