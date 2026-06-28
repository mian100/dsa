package binary_trees.optimal;

// Problem: Minimum Absolute Difference in BST
// Approach: Optimal - Inorder with prev pointer
// Time Complexity: O(n)
// Space Complexity: O(h)

public class MinimumAbsoluteDifferenceInBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev.val);
        }
        prev = node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        MinimumAbsoluteDifferenceInBSTOptimal sol = new MinimumAbsoluteDifferenceInBSTOptimal();
        System.out.println(sol.getMinimumDifference(root)); // 1
    }
}