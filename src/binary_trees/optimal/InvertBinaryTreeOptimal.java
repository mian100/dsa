package binary_trees.optimal;

// Problem: Invert Binary Tree
// Approach: Optimal - Recursive DFS
// Time Complexity: O(n)
// Space Complexity: O(h) where h is height of tree

public class InvertBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode invertTree(TreeNode root) {
        // Base case: empty tree
        if (root == null) return null;

        // Recursively invert left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap children
        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertBinaryTreeOptimal sol = new InvertBinaryTreeOptimal();
        TreeNode result = sol.invertTree(root);
        System.out.println(result.val);       // 4
        System.out.println(result.left.val);  // 7
        System.out.println(result.right.val); // 2
    }
}