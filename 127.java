public class Solution {    
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if (beginWord.equals(endWord)) return 1;
        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> step = new LinkedList<Integer>();
        queue.offer(beginWord);
        step.offer(1);
        if (wordDict.contains(beginWord)) {
            wordDict.remove(beginWord);
        }
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            int curStep = step.poll();
            for (int i=0; i<cur.length(); i++) {
                char[] curArray = cur.toCharArray();
                for (char c='a'; c<='z'; c++) {
                    curArray[i] = c;
                    String nextStr = String.valueOf(curArray);
                    if (wordDict.contains(nextStr)) {
                        if (nextStr.equals(endWord)) {
                            return curStep + 1;
                        }
                        wordDict.remove(nextStr);
                        queue.offer(nextStr);
                        step.offer(curStep + 1);
                    }
                }
            }
        }
        return 0;
    }
}
