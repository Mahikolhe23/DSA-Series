package practise.tree;

import java.util.Stack;

public class BST {
	private Node root;

	// insert data
	public boolean insert(int val) {
		Node node = new Node(val);
		if (root == null) {
			root = node;
			return true;
		}
		Node temp = root;
		while (true) {
			// check duplicate value
			if (val == temp.val)
				return false;

			// insert to left
			if (val < temp.val) {
				if (temp.left == null) {
					temp.left = node;
					return true;
				}
				temp = temp.left;
			} else {
				// insert to right
				if (temp.right == null) {
					temp.right = node;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	// pre-order traversal without recursion
	public void preorder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.val + " ");
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop().right;
		}
	}

	// inorder traversal without recursion
	public void inorder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			System.out.print(temp.val + " ");
			temp = temp.right;
		}
	}
	// post-order without recursion

	public void postorder() {
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char c) {
				this.node = node;
				this.flag = c;
			}
		}
		Stack<Pair> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.left;
			}
			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				temp = pair.node.right;
				pair.flag = 'R';
				stack.push(pair);
			} else {
				System.out.print(pair.node.val + " ");
			}
		}
	}

	// pre-order traversal
	public void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	// in-order traversal
	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	// post-order traversal
	public void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}

	// get max element from tree
	public Integer getMax() {
		if (root == null)
			return null;
		Node temp = root;
		while (temp.right != null) {
			temp = temp.right;
		}
		return temp.val;
	}

	// get min element from tree
	public Integer getMin() {
		if (root == null)
			return null;
		Node temp = root;
		while (temp.left != null) {
			temp = temp.left;
		}
		return temp.val;
	}

	public Node getRoot() {
		return root;
	}

	private class Node {
		private int val;
		private Node left;
		private Node right;

		Node(int val) {
			this.val = val;
		}
	}
}
