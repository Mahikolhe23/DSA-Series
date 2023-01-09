package linkedlist;

public class DLL2 {
	Node head;

	// Insert First
	public void insertFirst(int val) {
		Node newNode = new Node(val);
		newNode.prev = null;
		// check if head is null
		if (head == null) {
			head = newNode;
		}
		// More than one node in LL
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	// insert value at last
	public void insertLast(int val) {
		Node newNode = new Node(val);
		Node last = head;
		// check if head is null
		if (head == null) {
			insertFirst(val);
		}
		// More than one element in list
		else {
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.prev = last;
			newNode.next = null;
		}
	}

	public void insertAtIndex(int val, int index) {
		Node newNode = new Node(val);
		int size = 0;
		Node count = head;
		while (count.next != null) {
			size++;
			count = count.next;
		}
		size++;
		if (head == null) {
			head = newNode;
		} else {
			if (index == 1) {
				insertFirst(val);
			} else if (index == size) {
				insertLast(val);
			} else {
				Node temp = head;
				for (int i = 1; i < index; i++) {
					temp = temp.next;
				}
				newNode.prev = temp;
				newNode.next = temp.next;
				newNode.next.prev = newNode;
				temp.next = newNode;
			}
		}
	}

	// display element of LL
	public void display() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.val);
	}

	private class Node {
		private int val;
		private Node next;
		@SuppressWarnings("unused")
		private Node prev;

		public Node(int val) {
			this.val = val;
		}
	}
}
