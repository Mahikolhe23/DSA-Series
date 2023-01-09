package leetcode.tree;

import java.util.Stack;

//https://leetcode.com/problems/same-tree/description/
public class SameTree {

	public static void main(String[] args) {

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		// both are null then same
		if (p == null && q == null)
			return true;

		// structure
		if (p == null || q == null)
			return false;

		// value check
		if (p.val != q.val)
			return false;
		Stack<TreeNode> stackP = new Stack<>();
		Stack<TreeNode> stackQ = new Stack<>();
		stackP.push(p);
		stackQ.push(q);
		while (!stackP.isEmpty() && !stackQ.isEmpty()) {
			TreeNode temp1 = stackP.pop();
			TreeNode temp2 = stackQ.pop();
			if (temp1.val != temp2.val)
				return false;
			// check structure diffrent
			if (temp1.left == null && temp2.left != null)
				return false;
			else if (temp1.left != null && temp2.left == null)
				return false;
			else if (temp1.right == null && temp2.right != null)
				return false;
			else if (temp1.right != null && temp2.right == null)
				return false;
			// push into stack
			if (temp1.left != null && temp2.left != null) {
				stackP.push(temp1.left);
				stackQ.push(temp2.left);
			}
			if (temp1.right != null && temp2.right != null) {
				stackP.push(temp1.right);
				stackQ.push(temp2.right);
			}
		}
		return true;
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
