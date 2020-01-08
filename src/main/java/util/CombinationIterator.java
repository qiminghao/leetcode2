package util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName CombinationIterator.java
 * @Description 1286. Iterator for Combination
 * @createTime 2020/1/9 1:29
 */
public class CombinationIterator {

    Queue<String> qu = new LinkedList();
    String orig = "";
    public CombinationIterator(String characters, int combinationLength) {
        orig = characters;
        find("", 0, combinationLength);
    }

    void find(String str, int index, int len) {
        if(len ==0) {
            qu.add(str);
            return;
        }
        for(int i= index; i<orig.length(); i++) {
            char ch = orig.charAt(i);
            find(str+ch , i+1, len-1);
        }

    }

    public String next() {
        if(!qu.isEmpty()) {
            return qu.poll();
        }
        return "";
    }

    public boolean hasNext() {
        return !qu.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */