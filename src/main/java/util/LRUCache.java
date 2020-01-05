package util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName LRUCache.java
 * @Description 146. LRU Cache
 * @createTime 2020/1/5 5:25 上午
 */
public class LRUCache {

    private Map<Integer, DLinkedNode> cache;
    private DLinkedNode head, tail;
    private int capacity;
    private int size;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        head = new DLinkedNode(0, 0);
        tail = new DLinkedNode(0, 0);
        head.next = tail;
        tail.pre = head;
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        DLinkedNode node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DLinkedNode node = cache.get(key);
            node.value = value;
            moveToHead(node);
            return;
        }
        DLinkedNode node = new DLinkedNode(key, value);
        cache.put(key, node);
        addHead(node);
        size++;
        if (size > capacity) {
            cache.remove(tail.pre.key);
            removeNode(tail.pre);
        }
    }

    private class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre, next;

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private void addHead(DLinkedNode node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addHead(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
