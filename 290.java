public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] ss = str.split("\\s+");
        if (pattern.length() != ss.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        char[] p = pattern.toCharArray();
        for (int i=0; i<p.length; i++) {
            if (map.containsKey(p[i])) {
                if (!ss[i].equals(map.get(p[i]))) return false;
            } else {
                if (set.contains(ss[i])) return false;
                map.put(p[i], ss[i]);
                set.add(ss[i]);
            }
        }
        return true;
    }
}
