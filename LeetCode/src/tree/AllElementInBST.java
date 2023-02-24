package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import tree.PreorderTraverselBST.TreeNode;

//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public class AllElementInBST {
	public static void main(String[] args) {

	}

	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> list = preorderTraversal(root1);
		list.addAll(preorderTraversal(root2));
		Collections.sort(list);
		return list;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
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
