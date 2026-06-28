package binary_trees.brute;

// Problem: Kth Smallest Element in BST
// Approach: Brute Force - Collect all inorder, index k-1
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABSTBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        KthSmallestElementInABSTBrute sol = new KthSmallestElementInABSTBrute();
        System.out.println(sol.kthSmallest(root, 1)); // 1
    }
}