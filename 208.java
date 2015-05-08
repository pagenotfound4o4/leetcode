import java.util.*;

public class Solution {
    class TrieNode {
        public boolean isWord;
        public TrieNode[] child;
        public TrieNode() {
            child = new TrieNode[26];
        }
    }

    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            TrieNode cur = root;
            for (int i=0; i<word.length(); i++) {
                int pos = word.charAt(i) - 'a';
                if (cur.child[pos] == null) {
                    cur.child[pos] = new TrieNode();
                }
                cur = cur.child[pos];
            }
            cur.isWord = true;
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode cur = root;
            for (int i=0; i<word.length(); i++) {
                int pos = word.charAt(i) - 'a';
                if (cur.child[pos] == null) {
                    return false;
                }
                cur = cur.child[pos];
            }
            return cur.isWord;
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for (int i=0; i<prefix.length(); i++) {
                int pos = prefix.charAt(i) - 'a';
                if (cur.child[pos] == null) {
                    return false;
                }
                cur = cur.child[pos];
            }
            return true;
        }
    }
}
