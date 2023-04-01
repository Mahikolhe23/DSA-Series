package trees;

public class BST {
	Node root;

	public static void main(String[] args) {
		BST b = new BST();
		b.insert(20);
		b.insert(50);
		b.insert(10);
		b.insert(60);
		b.insert(5);
		b.insert(30);
		b.preorder(b.getHead());
		System.out.println();
		b.inorder(b.getHead());
		System.out.println();
		b.postorder(b.getHead());
	}

	Node getHead() {
		return root;
	}

	public void insert(int val) {
		if (root == null) {
			root = new Node(val);
			return;
		}
		Node temp = root;
		Node node = new Node(val);
		while (true) {
			if (val < temp.val) {
				if (temp.left == null) {
					temp.left = node;
					return;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					return;
				}
				temp = temp.right;
			}
		}
	}

	public void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}

	class Node {
		private Node left;
		private Node right;
		private int val;

		public Node(int val) {
			this.val = val;
		}
	}
}