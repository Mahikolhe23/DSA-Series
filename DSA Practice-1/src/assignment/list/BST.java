package assignment.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {
	public static void main(String[] args) {
		BST b = new BST();
		b.insert(50);
		b.insert(30);
		b.insert(60);
		b.insert(20);
		b.insert(70);
		b.insert(90);
		b.insert(10);
		b.preOrder(b.getRoot());
		System.out.println();
		b.inOrder(b.getRoot());
		System.out.println();
		b.postOrder(b.getRoot());
		System.out.println();
		b.preOrder();
		System.out.println();
		b.inOrder();
		System.out.println();
		b.postOrder();
		System.out.println();
		b.delete(20);
		b.inOrder();
	}

	public Node root;

	public Node getRoot() {
		return root;
	}

	// valid BST or Not
	public boolean isValidBST(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			list.add(temp.data);
			temp = temp.right;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	// In-order return list
	public List<Integer> inorderTraversal(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			list.add(temp.data);
			temp = temp.right;
		}
		return list;
	}

	// Insert data in BST - Method
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node node = new Node(data);
		if (node == null) {
			return false;
		}
		if (root == null) {
			root = node;
			return true;
		}
		// If Root is not null insert the to left or right of root node
		Node temp = root;
		while (true) {
			if (temp.data == data) {
				return false;
			}
			// check in left tree
			if (data < temp.data) {
				if (temp.left == null) {
					temp.left = node;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	// In order in BST wit recursion
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// Pre-order in BST wit recursion
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	// Post order in BST using recursion
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	// Pre-order without recursion
	public void preOrder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.data + " ");
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop().right;
		}
	}

	// In order without recursion
	public void inOrder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}

	// Post Order without recursion
	public void postOrder() {
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}
		Node temp = root;
		Stack<Pair> stack = new Stack<>();
		// check left-->right-->root
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
				System.out.print(pair.node.data + " ");
			}
		}
	}

	// delete node from BST
	public boolean delete(int data) {
		if (root == null) {
			return false;
		}
		// locate the del note along with parent node
		Node parent = root, del = root;
		while (del.data != data) {
			parent = del;
			if (data < del.data) {
				del = del.left;
			} else {
				del = del.right;
			}
			if (del == null) {
				return false;
			}
		}
		while (true) {
			// check del node is terminal or not
			if (del.left == null && del.right == null) {
				if (del == root) {
					root = null;
				}
				if (del == parent.left) {
					parent.left = null;
				} else {
					parent.right = null;
				}
				return true;
			}
			// if del is not terminal shift down to tree
			if (del.left != null) {
				// find max node from left of del node
				Node max = del.left;
				parent = del;
				while (max.right != null) {
					parent = max;
					max = max.right;
				}
				int temp = del.data;
				del.data = max.data;
				max.data = temp;
				del = max;
			} else {
				// find min node from right of del node
				Node min = del.right;
				parent = del;
				while (min.left != null) {
					parent = min;
					min = min.left;
				}
				int temp = del.data;
				del.data = min.data;
				min.data = temp;
				del = min;
			}
		}
	}

	// Node class
	private class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
}
