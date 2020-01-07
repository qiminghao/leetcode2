package util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName PeekingIterator.java
 * @Description 284. Peeking Iterator
 * @createTime 2020/1/8 4:03
 */
public class PeekingIterator implements Iterator<Integer> {

    private Queue<Integer> queue;
    private Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.queue = new LinkedList<>();
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (queue.isEmpty()) {
            queue.add(iterator.next());
        }
        return queue.peek();
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (!queue.isEmpty()) {
            return queue.remove();
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty() || iterator.hasNext();
    }
}
