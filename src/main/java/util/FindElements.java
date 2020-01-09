package util;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName FindElements.java
 * @Description 1261. Find Elements in a Contaminated Binary Tree
 * @createTime 2020/1/10 2:38
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class FindElements {

    private Set<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();
        preOrder(root, 0);
    }

    private void preOrder(TreeNode root, int value) {
        if (root == null) {
            return;
        }
        root.val = value;
        set.add(value);
        if (root.left != null) {
            preOrder(root.left, value * 2 + 1);
        }
        if (root.right != null) {
            preOrder(root.right, value * 2 + 2);
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
