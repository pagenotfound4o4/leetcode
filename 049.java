public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        for (String str : strs) {
            String h = hash(str);
            if (map.containsKey(h)) {
                map.get(h).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(h, list);
            }
        }
        List<List<String>> ret = new ArrayList<List<String>>();
        for (List<String> list : map.values()) {
            ret.add(list);
        }
        return ret;
    }

    String hash(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
