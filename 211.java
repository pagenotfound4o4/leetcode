public class WordDictionary {
    class TrieNode {
        boolean isWord;
        TrieNode[] next;
        TrieNode() {
            next = new TrieNode[26];
            isWord = false;
        }
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode cur = root;
        for (int i=0; i<word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (cur.next[pos] == null) {
                cur.next[pos] = new TrieNode();
            }
            cur = cur.next[pos];
        }
        cur.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    boolean dfs(TrieNode cur, String word, int pos) {
        if (pos == word.length()) return cur.isWord;
        if (word.charAt(pos) != '.') {
            int t = word.charAt(pos) - 'a';
            if (cur.next[t] == null) return false;
            return dfs(cur.next[t], word, pos+1);
        } else {
            for (int i=0; i<26; i++) {
                if (cur.next[i] != null) {
                    if (dfs(cur.next[i], word, pos+1)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
