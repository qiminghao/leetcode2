package util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName BSTIterator.java
 * @Description 173. Binary Search Tree Iterator
 * @createTime 2020/1/8 3:21
 */
public class BSTIterator {

    private List<Integer> list;
    private int cur;
    private int len;

    public BSTIterator(TreeNode root) {
        this.list = new ArrayList<>();
        this.cur = 0;
        inOrder(root);
        this.len = list.size();
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        this.list.add(root.val);
        inOrder(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(cur++);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cur == len - 1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */