package com.example.recursion;

public class MaxiumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int maxLeft = maxDepth(root.left);
		int maxRight = maxDepth(root.right);
		int res = Math.max(maxLeft, maxRight) + 1;
		return res;
	}

}
