package tree;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.com/problems/symmetric-tree/
public class SymmetricBinaryTree {

	public static void main(String[] args) {

	}

	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return false;
		TreeNode temp = root;
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			list.add(temp.val);
			temp = temp.right;
		}
		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			if (list.get(i) != list.get(j)) {
				return false;
			} else {
				i++;
				j--;
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
