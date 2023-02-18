package tree;

import java.util.Stack;

public class RangeSumOfBST {

	public static void main(String[] args) {

	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		int sum = 0;
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return root.val;
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (root.val >= low && root.val <= high)
				sum += root.val;
			root = root.right;
		}
		return sum;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
