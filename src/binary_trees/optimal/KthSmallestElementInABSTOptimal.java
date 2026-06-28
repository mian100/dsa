package binary_trees.optimal;

// Problem: Kth Smallest Element in BST
// Approach: Optimal - Iterative inorder, stop at kth
// Time Complexity: O(k)
// Space Complexity: O(h)

import java.util.Stack;

public class KthSmallestElementInABSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 0;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            count++;
            if (count == k) return curr.val;
            curr = curr.right;
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        KthSmallestElementInABSTOptimal sol = new KthSmallestElementInABSTOptimal();
        System.out.println(sol.kthSmallest(root, 1)); // 1
    }
}