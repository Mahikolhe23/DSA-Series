package linkedlist;

public class DLL3 {
	Node head;

	public static void main(String[] args) {
		DLL3 d = new DLL3();
		d.insertFirst(10);
		d.insertFirst(30);
		d.insertFirst(20);
		d.insertFirst(40);
		d.insertLast(50);
		d.insertLast(60);
		d.display();
		System.out.println();
		d.reverse();
		d.display();

	}

	// reverse LL using without stack , using two pointer method
	public void reverse() {
		Node temp = null;
		Node curr = head;
		while (curr != null) {
			//swap the current with next
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;//update current position
		}
		if (temp != null) {
			head = temp.prev;
		}
	}

	// count node in LL
	public int count() {
		// if LL empty
		if (head == null) {
			return 0;
		}
		// only one node
		if (head.next == null) {
			return 1;
		}
		// More than one node
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	// search by value and return index
	public int searchByValue(int data) {
		// check if head is null or negative index
		if (head == null) {
			return -1;
		}
		int count = 1;
		// check for head data
		if (head.data == data) {
			return count;
		}
		// find the node and return index
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return count;
			}
			temp = temp.next;
			count++;
		}
		return -1;
	}

	// insert at first node
	@SuppressWarnings("unused")
	public void insertFirst(int data) {
		Node node = new Node(data);
		if (node == null) {
			return;
		}
		// check if no node is present
		if (head == null) {
			head = node;
			return;
		}
		// more than one node
		node.next = head;
		head.prev = node;
		head = node;
	}

	// insert at last node
	@SuppressWarnings("unused")
	public void insertLast(int data) {
		Node node = new Node(data);
		if (node == null) {
			return;
		}
		// if head is null
		if (head == null) {
			head = node;
			return;
		}
		// more than one node in LL
		Node temp = head;
		// locate the last node of LL
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;
	}

	// insert at index
	@SuppressWarnings("unused")
	public void insertAtIndex(int data, int index) {
		Node node = new Node(data);
		if (node == null) {
			return;
		}
		// check if head is empty
		if (head == null || index == 1) {
			insertFirst(data);
			return;
		}
		Node temp = head;
		// check if more than one node is present, locate the previous node of new node
		for (int i = 1; i < index - 1; i++) {
			temp = temp.next;
			if (temp == null) {
				return;
			}
		}
		node.prev = temp;
		node.next = temp.next;
		if (temp.next != null) {
			temp.next.prev = node;
		}
		temp.next = node;

	}

	// delete by index
	public void deleteByIndex(int index) {
		// empty LL or negative index
		if (head == null || index < 0) {
			return;
		}
		// if only one node
		if (head.next == null) {
			head = null;
			return;
		}
		// more than one node is present , locate the prev index of deletable node
		if (index == 1) {
			head = head.next;
			head.prev = null;
			return;
		}
		Node temp = head;
		for (int i = 2; i < index; i++) {
			temp = temp.next;
			if (temp.next == null) {
				return;
			}
		}
		temp.next = temp.next.next;
	}

	// search by index
	public int searchByIndex(int index) {
		// if index is negative or head is null
		if (head == null || index < 0) {
			return -1;
		}
		// only one node
		if (head.next == null || index == 1) {
			return head.data;
		}
		// more than one node locate the node
		Node temp = head;
		for (int i = 2; i <= index; i++) {
			temp = temp.next;
			if (temp == null) {
				return -1;
			}
		}
		return temp.data;
	}

	// Display of LL
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
		}
	}
}
