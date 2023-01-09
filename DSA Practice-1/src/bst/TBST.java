package bst;

public class TBST {

	public static void main(String[] args) {
		TBST t = new TBST();
		t.insert(50);
		t.insert(10);
		t.insert(20);
		t.insert(30);
		t.insert(60);
		t.insert(40);
		t.inOrder();
		t.preOrder();
	}

	private Node root;

	// insert data into TSBT
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node node = new Node(data);
		if (node == null) {
			return false;
		}
		// check if root is null or not
		if (root == null) {
			root = node;
			return true;
		}
		// compare data with the left or right side
		Node temp = root;
		while (true) {
			// check for duplicate
			if (temp.data == data) {
				return false;
			}
			// check in left side
			if (data < temp.data) {
				if (temp.lFlag == 'T') {
					node.right = temp;
					node.left = temp.left;
					temp.left = node;
					temp.lFlag = 'L';
					return true;
				}
				temp = temp.left;
			}
			// check in right side
			else {
				if (temp.rFlag == 'T') {
					node.left = temp;
					node.right = temp.right;
					temp.right = node;
					temp.rFlag = 'L';
					return true;
				}
				temp = temp.right;
			}
		}
	}

	// in order in TBST
	public void inOrder() {
		Node temp = root;
		char flag = 'L';
		System.out.println("IN-ORDER : ");
		while (temp != null) {
			while (temp.lFlag == 'L' && flag == 'L') {
				temp = temp.left;
			}
			System.out.print(temp.data + " ");
			flag = temp.rFlag;
			temp = temp.right;
		}
		System.out.println();
	}

	// pre order in TBST
	public void preOrder() {
		Node temp = root;
		char flag = 'L';
		System.out.println("Pre-Order : ");
		while (temp != null) {
			while (temp.lFlag == 'L' && flag == 'L') {
				System.out.print(temp.data + " ");
				temp = temp.left;
			}
			if (flag == 'L') {
				System.out.print(temp.data + " ");
			}
			flag = temp.rFlag;
			temp = temp.right;
		}
		System.out.println();
	}
	//post order TBST
	

	private class Node {
		private int data;
		private Node left, right;
		private char lFlag, rFlag;

		public Node(int data) {
			this.data = data;
			left = right = null;
			lFlag = rFlag = 'T';
		}
	}
}
