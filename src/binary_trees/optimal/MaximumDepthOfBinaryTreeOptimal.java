package binary_trees.optimal;

// Problem: Maximum Depth of Binary Tree
// Approach: Optimal - DFS Recursive
// Time Complexity: O(n)
// Space Complexity: O(h)

public class MaximumDepthOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // 1 + max of left and right depth
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepthOfBinaryTreeOptimal sol = new MaximumDepthOfBinaryTreeOptimal();
        System.out.println(sol.maxDepth(root)); // 3
    }
}