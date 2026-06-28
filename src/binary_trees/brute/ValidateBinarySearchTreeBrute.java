package binary_trees.brute;

// Problem: Validate Binary Search Tree
// Approach: Brute Force - Inorder traversal, check if sorted
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTreeBrute {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        ValidateBinarySearchTreeBrute sol = new ValidateBinarySearchTreeBrute();
        System.out.println(sol.isValidBST(root)); // true
    }
}