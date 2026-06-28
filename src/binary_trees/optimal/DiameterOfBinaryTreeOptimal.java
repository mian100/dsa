package binary_trees.optimal;

// Problem: Diameter of Binary Tree
// Approach: Optimal - Single DFS pass, update global max
// Time Complexity: O(n)
// Space Complexity: O(h)

public class DiameterOfBinaryTreeOptimal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        // Update max diameter
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        DiameterOfBinaryTreeOptimal sol = new DiameterOfBinaryTreeOptimal();
        System.out.println(sol.diameterOfBinaryTree(root)); // 3
    }
}