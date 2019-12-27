package util;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void build(String[] words) {
        for (String word : words) {
            insert(word.toCharArray());
        }
    }

    public void insert(char[] word) {

    }

    public boolean search(char[] word) {
        return true;
    }

    public void delete(char[] word) {
        if (!search(word)) {
            return;
        }
    }

    private class Node {
        int count;
        Map<Character, Node> child;
        boolean isWord;

        public Node() {
            this.count = 0;
            this.child = new HashMap<>();
            this.isWord = false;
        }
    }
}
