package tree;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
import java.util.ArrayList;
import java.util.List;

public class PreorderTraverselBST {

	public static void main(String[] args) {

	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
//		TreeNode temp = root;
//		Stack<TreeNode> stack = new Stack<>();
//		while (temp != null || !stack.isEmpty()) {
//			while (temp != null) {
//				list.add(temp.val);
//				stack.push(temp);
//				temp = temp.left;
//			}
//			temp = stack.pop().right;
//		}
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