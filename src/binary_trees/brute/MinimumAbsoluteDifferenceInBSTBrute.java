package binary_trees.brute;

// Problem: Minimum Absolute Difference in BST
// Approach: Brute Force - Inorder list, compare all pairs
// Time Complexity: O(n^2)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBSTBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(j)));
            }
        }
        return minDiff;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        MinimumAbsoluteDifferenceInBSTBrute sol = new MinimumAbsoluteDifferenceInBSTBrute();
        System.out.println(sol.getMinimumDifference(root)); // 1
    }
}