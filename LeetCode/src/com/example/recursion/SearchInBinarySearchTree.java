package com.example.recursion;

public class SearchInBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode searchBST(TreeNode root, int val) {
		if (root.val == val) {
			return root;
		}
		if (root.val < val) {
			return searchBST(root.right, val);
		}

		return searchBST(root.left, val);
	}

}
