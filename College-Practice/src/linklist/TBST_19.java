package linklist;

public class TBST_19 {
	Node root;

	public static void main(String[] args) {
		TBST_19 t = new TBST_19();
		t.insert(20);
		t.insert(40);
		t.insert(10);
		t.insert(70);
		t.insert(30);
		t.insert(60);
		t.preOrder();
		System.out.println();
		t.inOrder();
		System.out.println();
		t.postOrder();
	}

	// in-order in tree
	public void inOrder() {
		Node temp = root;
		char flag = 'L';
		while (temp != null) {
			while (temp.lflag == 'L' && flag == 'L') {
				temp = temp.left;
			}
			System.out.print(temp.data + " ");
			flag = temp.rflag;
			temp = temp.right;
		}
	}

	// pre order in tree
	public void preOrder() {
		Node temp = root;
		char flag = 'L';
		while (temp != null) {
			while (temp.lflag == 'L' && flag == 'L') {
				System.out.print(temp.data + " ");
				temp = temp.left;
			}
			if (flag == 'L') {
				System.out.print(temp.data + " ");
			}
			flag = temp.rflag;
			temp = temp.right;
		}
	}

	// post-order in tree
	public void postOrder() {
		Node temp = root;
		char flag = 'L';
		while (temp != null) {
			while (temp.lflag == 'L' && flag == 'L') {
				temp = temp.left;
			}
			flag = temp.rflag;
			// check if temp has right child or not
			if (flag == 'L') {
				// if temp has right child shift the temp to its right and start iteration again
				// from start
				temp = temp.right;
			} else {
				while (true) {
					// if temp has no left or right child then get the temp data and move to its
					// right
					System.out.print(temp.data + " ");
					// check temp is right child or not
					if (isRightchild(temp)) {
						// temp is right child
						while (temp.lflag == 'L') {
							temp = temp.left;
						}
						temp = temp.left;
					} else {
						// temp is left child
						while (temp.rflag == 'L') {
							temp = temp.right;
						}
						temp = temp.right;
						break;
					}
				}
			}
		}
	}

	private boolean isRightchild(Node node) {
		if (node == null) {
			return false;
		}
		Node temp = root;
		while (temp != null) {
			// checking in left tree
			if (node.data < temp.data) {
				temp = temp.left;
				if (node == temp) {
					return false;
				}
			}
			// check in right tree
			else {
				temp = temp.right;
				if (node == temp) {
					return true;
				}
			}
		}
		return false;
	}

	// insert data into tree
	@SuppressWarnings("unused")
	public void insert(int data) {
		Node node = new Node(data);
		// check if new node is created or not
		if (node == null) {
			return;
		}
		// check root is empty
		if (root == null) {
			root = node;
			return;
		}
		// locate the node which data is less or greater to new node
		Node temp = root;
		while (true) {
			// check for duplicates
			if (data == temp.data) {
				return;
			}
			// check in left sub tree
			if (data < temp.data) {
				// if left child is thread then put make child of left tree to node
				if (temp.lflag == 'T') {
					node.right = temp;
					node.left = temp.left;
					temp.left = node;
					temp.lflag = 'L';
					return;
				}
				temp = temp.left;
			}
			// if data is greater than root , then search in right sub tree
			else {
				if (temp.rflag == 'T') {
					node.left = temp;
					node.right = temp.right;
					temp.right = node;
					temp.rflag = 'L';
					return;
				}
				temp = temp.right;
			}
		}

	}

	class Node {
		private int data;
		private Node left, right;
		private char lflag, rflag;

		public Node(int data) {
			this.data = data;
			lflag = rflag = 'T';
		}
	}
}
