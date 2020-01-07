package util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName WordFilter.java
 * @Description 745. Prefix and Suffix Search
 * @createTime 2020/1/8 0:29
 *
 * solution 1: Trie + Set Intersection [Time Limit Exceeded]
 */
public class WordFilter {

    private Node pre;
    private Node suf;
    private int maxWeights;
    private Set<Integer> allWeights;

    public WordFilter(String[] words) {
        this.pre = new Node();
        this.suf = new Node();
        this.maxWeights = words.length - 1;
        this.allWeights = new HashSet<>();
        for (int i = words.length - 1; i >= 0; i--) {
            addWord(pre, words[i], i);
            addWord(suf, new StringBuilder(words[i]).reverse().toString(), i);
            allWeights.add(i);
        }
    }

    private void addWord(Node root, String word, int weight) {
        Node p = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (p.child[index] == null) {
                p.child[index] = new Node();
            }
            p = p.child[index];
            p.weights.add(weight);
        }
    }

    public int f(String prefix, String suffix) {
        if ("".equals(prefix) && "".equals(suffix)) {
            return this.maxWeights;
        }
        Set<Integer> preSet = "".equals(prefix) ? this.allWeights : search(pre, prefix);
        Set<Integer> sufSet = "".equals(suffix) ? this.allWeights : search(suf, new StringBuilder(suffix).reverse().toString());
        if (preSet.size() > sufSet.size()) {
            Set<Integer> temp = preSet;
            preSet = sufSet;
            sufSet = temp;
        }
        int res = -1;
        for (int x : preSet) {
            if (sufSet.contains(x)) {
                res = Math.max(res, x);
            }
        }
        return res;
    }

    private Set<Integer> search(Node root, String word) {
        Node p = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (p.child[index] == null) {
                return Collections.EMPTY_SET;
            }
            p = p.child[index];
        }
        return p.weights;
    }

    private class Node {
        Set<Integer> weights;
        Node[] child;
        public Node() {
            this.weights = new HashSet<>();
            this.child = new Node[26];
        }
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
