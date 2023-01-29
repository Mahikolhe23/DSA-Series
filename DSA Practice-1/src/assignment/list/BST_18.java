package assignment.list;

import java.util.Stack;

public class BST_18 {
	Node root;

	public static void main(String[] args) {
		BST_18 b = new BST_18();
		b.insert(80);
		b.insert(50);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(60);
		b.inOrder();
		System.out.println();
		System.out.println("height of tree : " + b.height(b.getRoot()));
	}

	public Node getRoot() {
		return root;
	}

	// find height of tree
	public int height(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

	// delete the node from BST
	public void delete(int data) {
		// check if root is null
		if (root == null) {
			return;
		}
		// if more than one node then locate the del node along with parent node
		Node parent = root, del = root;
		while (del.data != data) {
			parent = del;
			if (data < del.data) {
				del = del.left;
			} else {
				del = del.right;
			}
			if (del == null) {
				return;
			}
		}
		while (true) {
			// check if del is leaf or not
			if (del.left == null && del.right == null) {
				// check if one node is present
				if (del == root) {
					root = null;
				}
				// check for left child
				if (del == parent.left) {
					parent.left = null;
				} else {
					parent.right = null;
				}
				return;
			}
			// if del node is not terminal then shift down to leaf node
			if (del.left != null) {
				// find max from left sub tree
				Node max = del.left;
				parent = del;
				while (max.right != null) {
					parent = max;
					max = max.right;
				}
				// swap the del with max node
				int temp = del.data;
				del.data = max.data;
				max.data = temp;
				del = max;
			} else {
				// find min from right sub tree
				Node min = del.right;
				parent = del;
				while (min.left != null) {
					parent = min;
					min = min.left;
				}
				// swap the del with max node
				int temp = del.data;
				del.data = min.data;
				min.data = temp;
				del = min;
			}
		}
	}

	// pre-order in BST without recursion
	public void preOrder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null | !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.data + " ");
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop().right;
		}
	}

	// In-order in BST w/o recursion
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

	// Post-order in BST without recursion
	public void postOrder() {
		// Inner Pair class
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
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
			} else
				System.out.print(pair.node.data + " ");
		}
	}

	// Pre-Order in BST with recursion
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	// In-order in BST with recursion
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// Post order in BST with recursion
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	// insert data in BST
	@SuppressWarnings("unused")
	public void insert(int data) {
		Node node = new Node(data);
		// check node is created or not
		if (node == null) {
			return;
		}
		// check if root is null
		if (root == null) {
			root = node;
			return;
		}
		// if root is not null , create a temp node to traverse the tree
		Node temp = root;
		while (true) {
			// check for duplicate data
			if (data == temp.data) {
				return;
			}
			// check if data is less than root
			if (data < temp.data) {
				if (temp.left == null) {
					temp.left = node;
					return;
				}
				temp = temp.left;
			}
			// check if data is greater than root
			else {
				if (temp.right == null) {
					temp.right = node;
					return;
				}
				temp = temp.right;
			}
		}
	}

	class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
		}
	}
}
