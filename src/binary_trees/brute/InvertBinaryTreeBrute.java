package binary_trees.brute;

// Problem: Invert Binary Tree
// Approach: Brute Force - Iterative BFS using Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeBrute {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // BFS using queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Swap left and right children
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // Add children to queue
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }

    public static void main(String[] args) {
        // Build tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertBinaryTreeBrute sol = new InvertBinaryTreeBrute();
        TreeNode result = sol.invertTree(root);
        System.out.println(result.val); // 4
        System.out.println(result.left.val); // 7
        System.out.println(result.right.val); // 2
    }
}