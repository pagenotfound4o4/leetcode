public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] table = new int[128];
        for (int i=0; i<128; i++) table[i] = -1;
        char[] charArray = s.toCharArray();
        int maxlen = 0;
        int start = 0;
        for (int i=0; i<charArray.length; i++) {
            int pos = (int)charArray[i];
            if (table[pos] >= start) {
                maxlen = Math.max(maxlen, i - start);
                start = table[pos] + 1;
            }
            table[pos] = i;
        }
        maxlen = Math.max(maxlen, charArray.length-start);
        return maxlen;
    }
}
