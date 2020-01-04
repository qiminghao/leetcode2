package util;

/**
 * @author qiminghao
 * @version 1.0.0
 * @ClassName Codec.java
 * @Description 297. Serialize and Deserialize Binary Tree
 * @createTime 2020/1/5 3:06 上午
 */

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.remove();
                if (cur == null) {
                    sb.append(",#");
                    continue;
                }
                sb.append(",").append(cur.val);
                queue.add(cur.left);
                queue.add(cur.right);
            }
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        if (nodes.length == 1) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        queue.add(root);
        int index = 1;
        while(!queue.isEmpty()) {
            TreeNode cur = queue.remove();
            if (cur == null) {
                continue;
            }
            if (!"#".equals(nodes[index])) {
                cur.left = new TreeNode(Integer.valueOf(nodes[index]));
            }
            index++;
            if (!"#".equals(nodes[index])) {
                cur.right = new TreeNode(Integer.valueOf(nodes[index]));
            }
            index++;
            queue.add(cur.left);
            queue.add(cur.right);
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));