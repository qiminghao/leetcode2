package util;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName Trie.java
 * @Description 208. Implement Trie (Prefix Tree)
 * @createTime 2020/1/5 12:39 上午
 */
public class Trie {

    private TreeNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TreeNode p = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.child[index] == null) {
                p.child[index] = new TreeNode();
            }
            p = p.child[index];
        }
        p.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TreeNode p = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.child[index] == null) {
                return false;
            }
            p = p.child[index];
        }
        return p.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TreeNode p = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (p.child[index] == null) {
                return false;
            }
            p = p.child[index];
        }
        return p != null;
    }

    private class TreeNode {
        boolean isWord;
        TreeNode[] child;

        public TreeNode() {
            isWord = false;
            child = new TreeNode[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
