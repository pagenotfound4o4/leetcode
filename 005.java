public class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        char[] str = s.toCharArray();
        // odd
        for (int i=0; i<str.length; i++) {
            int shift = 1;
            while (i-shift>=0 && i+shift<str.length && str[i-shift]==str[i+shift]) {
                shift++;
            }
            if (2*shift-1 > end - start) {
                start = i - shift + 1;
                end = i + shift;
            }
        }
        // even
        for (int l=0; l<str.length-1; l++) {
            int r = l + 1;
            if (str[l] == str[r]) {
                int shift = 1;
                while (l-shift>=0 && r+shift<str.length && str[l-shift]==str[r+shift]) {
                    shift++;
                }
                if (2*shift > end - start) {
                    start = l - shift + 1;
                    end = r + shift;
                }
            }
        }
        return s.substring(start, end);
    }
}
