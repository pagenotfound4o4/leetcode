public class Solution {
    public boolean isAnagram(String s, String t) {
        int[][] cnt = new int[26][2];
        for (char c : s.toCharArray()) {
            cnt[c-'a'][0]++;
        }
        for (char c : t.toCharArray()) {
            cnt[c-'a'][1]++;
        }
        for (int i=0; i<26; i++) {
            if (cnt[i][0] != cnt[i][1]) return false;
        }
        return true;
    }
}
