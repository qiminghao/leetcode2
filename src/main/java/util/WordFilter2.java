package util;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName WordFilter2.java
 * @Description 745. Prefix and Suffix Search
 * @createTime 2020/1/8 2:37
 *
 *
 * solution 2 : Trie [Accepted]
 * for word "apple"
 * we insert "{apple", "e{apple", "le{apple", "ple{apple", "pple{apple", "apple{apple" into trie
 * the code for '{' equals to 'z' + 1
 */
public class WordFilter2 {

    private Node root;

    public WordFilter2(String[] words) {
        this.root = new Node();
        this.root.weight = words.length - 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                addWord(words[i].substring(j) + "{" + words[i], i);
            }
        }
    }

    private void addWord(String word, int weight) {
        Node p = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (p.child[index] == null) {
                p.child[index] = new Node();
            }
            p = p.child[index];
            p.weight = weight;
        }
    }

    public int f(String prefix, String suffix) {
        return search(suffix + "{" + prefix);
    }

    private int search(String word) {
        Node p = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (p.child[index] == null) {
                return -1;
            }
            p = p.child[index];
        }
        return p.weight;
    }

    private class Node {
        int weight;
        Node[] child;
        public Node() {
            this.weight = 0;
            child = new Node[27];
        }
    }
}
