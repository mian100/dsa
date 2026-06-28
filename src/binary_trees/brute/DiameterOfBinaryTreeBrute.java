package binary_trees.brute;

// Problem: Diameter of Binary Tree
// Approach: Brute Force - For each node compute left+right height
// Time Complexity: O(n^2)
// Space Complexity: O(n)

public class DiameterOfBinaryTreeBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int throughRoot = leftHeight + rightHeight;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(throughRoot, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        DiameterOfBinaryTreeBrute sol = new DiameterOfBinaryTreeBrute();
        System.out.println(sol.diameterOfBinaryTree(root)); // 3
    }
}
