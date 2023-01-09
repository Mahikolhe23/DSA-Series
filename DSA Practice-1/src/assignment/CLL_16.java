package assignment;

//16 - Implement singly circular linked list with all operations mentioned in assignment 13
public class CLL_16 {
	Node head;

	public static void main(String[] args) {
		CLL_16 c = new CLL_16();
		c.insertFirst(10);
		c.insertFirst(20);
		c.insertLast(50);
		c.insertLast(60);
		c.insertLast(70);
		c.display();
		System.out.println();
		c.deleteLast();
		c.display();

	}

	// delete last
	public void deleteLast() {
		// check for empty LL
		if (head == null) {
			return;
		}
		// check if one node
		if (head.next == head) {
			head = null;
			return;
		}
		// check if more than one node then locate the second last node of last node
		Node temp = head;
		while (temp.next.next != head) {
			temp = temp.next;
		}
		temp.next = head;
	}

	// delete first
	public void deleteFirst() {
		// check for empty LL
		if (head == null) {
			return;
		}
		// check if only one node is present
		if (head.next == head) {
			head = null;
			return;
		}
		// check if more than one node locate the last node
		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		// check the head to its next node and make next of last node to new head
		head = head.next;
		temp.next = head;
	}

	// insert at last
	@SuppressWarnings("unused")
	public void insertLast(int data) {
		Node node = new Node(data);
		if (node == null) {
			return;
		}
		// check for empty LL
		if (head == null) {
			head = node;
			node.next = head;
			return;
		}
		// more than one is present locate the last node
		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		temp.next = node;
		node.next = head;
	}

	// insert at first of LL
	@SuppressWarnings("unused")
	public void insertFirst(int data) {
		Node node = new Node(data);
		// check new is created or not
		if (node == null) {
			return;
		}
		// check if head is empty
		if (head == null) {
			head = node;
			node.next = head;
			return;
		}
		// more than one is present locate the last node
		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		node.next = head;
		temp.next = node;
		head = node;
	}

	// display
	public void display() {
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
