package util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName AllOne.java
 * @Description 432. All O`one Data Structure
 * @createTime 2020/1/8 4:51
 */
public class AllOne {

    private Map<String, Integer> map1;
    private Map<Integer, DLinkedNode> map2;
    private DLinkedNode head;
    private DLinkedNode tail;

    /** Initialize your data structure here. */
    public AllOne() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        head = new DLinkedNode(0);
        tail = new DLinkedNode(0);
        head.next = tail;
        tail.pre = head;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if (map1.containsKey(key)) {
            int val = map1.get(key);
            map1.put(key, val + 1);
            DLinkedNode node = map2.get(val);
            node.keys.remove(key);
            DLinkedNode preNode = node.pre;
            if (preNode == head || preNode.val > val + 1) {
                DLinkedNode newNode = new DLinkedNode(val + 1);
                newNode.keys.add(key);
                newNode.next = node;
                newNode.pre = preNode;
                preNode.next = newNode;
                node.pre = newNode;
                map2.put(val + 1, newNode);
                preNode = newNode;
            } else {
                preNode.keys.add(key);
            }
            if (node.keys.size() == 0) {
                preNode.next = node.next;
                node.next.pre = preNode;
                map2.remove(val);
            }
        } else {
            map1.put(key, 1);
            DLinkedNode node = map2.get(1);
            if (node == null) {
                DLinkedNode newNode = new DLinkedNode(1);
                newNode.keys.add(key);
                newNode.next = tail;
                newNode.pre = tail.pre;
                tail.pre.next = newNode;
                tail.pre = newNode;
                map2.put(1, newNode);
            } else {
                node.keys.add(key);
            }
        }
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if (map1.containsKey(key)) {
            int val = map1.get(key);
            DLinkedNode node = map2.get(val);
            node.keys.remove(key);
            if (val == 1) {
                map1.remove(key);
                if (node.keys.size() == 0) {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
            } else {
                map1.put(key, val - 1);
                DLinkedNode nextNode = node.next;
                if (nextNode == tail || nextNode.val < val - 1) {
                    DLinkedNode newNode = new DLinkedNode(val - 1);
                    newNode.keys.add(key);
                    newNode.pre = node;
                    newNode.next = nextNode;
                    node.next = newNode;
                    nextNode.pre = newNode;
                    map2.put(val - 1, newNode);
                } else {
                    nextNode.keys.add(key);
                }
            }
            if (node.keys.size() == 0) {
                node.pre.next = node.next;
                node.next.pre = node.pre;
                map2.remove(val);
            }
        }
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (head.next == tail) {
            return "";
        } else {
            return head.next.keys.iterator().next();
        }
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (tail.pre == head) {
            return "";
        } else {
            return tail.pre.keys.iterator().next();
        }
    }

    private class DLinkedNode {
        int val;
        Set<String> keys;
        DLinkedNode pre, next;
        public DLinkedNode(int val) {
            this.val = val;
            this.keys = new HashSet<>();
        }
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
