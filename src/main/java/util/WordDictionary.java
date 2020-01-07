package util;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName WordDictionary.java
 * @Description 211. Add and Search Word - Data structure design
 * @createTime 2020/1/7 23:57
 */
public class WordDictionary {

    private Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node p = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (p.child[index] == null) {
                p.child[index] = new Node();
            }
            p = p.child[index];
        }
        p.isWord = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelper(root, word, 0);
    }

    private boolean searchHelper(Node node, String word, int index) {
        if (index == word.length()) {
            return node.isWord;
        }
        char c = word.charAt(index);
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.child[i] != null && searchHelper(node.child[i], word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int i = c - 'a';
            if (node.child[i] == null) {
                return false;
            }
            return searchHelper(node.child[i], word, index + 1);
        }
    }

    private class Node {
        boolean isWord;
        Node[] child;
        public Node() {
            this.isWord = false;
            this.child = new Node[26];
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */