package leetcode.sequence.num208;

/**
 * @author lqclester
 */
class Trie {
    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    class TrieNode {
        boolean word = false;
        TrieNode[] children = new TrieNode[26];
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.word = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode root = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (root.children[c - 'a'] == null) {
                return false;
            } else {
                root = root.children[c - 'a'];
            }
        }
        return root.word;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode root = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (root.children[c - 'a'] == null) {
                return false;
            } else {
                root = root.children[c - 'a'];
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */