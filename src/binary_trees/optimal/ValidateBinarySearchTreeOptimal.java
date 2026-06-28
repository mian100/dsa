package binary_trees.optimal;

// Problem: Validate Binary Search Tree
// Approach: Optimal - DFS with min/max bounds
// Time Complexity: O(n)
// Space Complexity: O(h)

public class ValidateBinarySearchTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        ValidateBinarySearchTreeOptimal sol = new ValidateBinarySearchTreeOptimal();
        System.out.println(sol.isValidBST(root)); // true
    }
}
