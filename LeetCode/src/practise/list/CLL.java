package practise.list;

public class CLL {
	Node head;
	Node tail;
	int size;

	// insert first
	public void insertFirst(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		node.next = head;
		head = node;
		tail.next = node;
		size++;
	}

	// insert last
	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		node.next = head;
		tail = node;
		size++;
	}

	// insert at index
	public void insert(int index, int val) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size - 1) {
			insertLast(val);
			return;
		}
		if (index > size)
			return;
		Node node = new Node(val);
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	// delete first
	public int deleteFirst() {
		int val;
		if (head.next == null) {
			val = head.val;
			head.next = null;
			return val;
		}
		val = head.val;
		head = head.next;
		tail.next = head;
		size--;
		return val;
	}

	// delete by value
	public void deleteLast(int val) {
		Node node = head;
		if (node.val == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		do {
			Node next = node.next;
			if (next.val == val) {
				node.next = next.next;
				break;
			}
			node = node.next;
		} while (node != head);

	}

	// display
	public void display() {
		Node temp = head;
		do {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.print("END");
	}

	private class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}
	}
}
