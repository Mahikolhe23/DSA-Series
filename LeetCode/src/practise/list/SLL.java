package practise.list;

public class SLL {
	private Node head;
	private Node tail;
	private int size;

	// insert first
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	// insert last
	public void insertLast(int val) {
		Node node = new Node(val);
		if (tail == null) {
			insertFirst(val);
			return;
		}
		tail.next = node;
		tail = node;
		size++;
	}

	// insert at index
	public void insert(int val, int index) {
		if (index == 0)
			insertFirst(val);
		if (index == size - 1)
			insertLast(val);
		Node temp = get(index);
		Node node = new Node(val, temp.next);
		temp.next = node;
	}

	public Node get(int n) {
		Node temp = head;
		for (int i = 1; i < n; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// delete first
	public int deleteFirst() {
		if (head.next == null) {
			int val = head.val;
			head = null;
			tail = null;
			return val;
		}
		int val = head.val;
		head = head.next;
		return val;
	}

	// delete last node
	public int deleteLast() {
		Node temp = get(size - 1);
		int val = tail.val;
		tail = temp;
		temp.next = null;
		return val;
	}

	// delete at index
	public int delete(int index) {
		if (index == 0)
			deleteFirst();
		if (index == size - 1)
			deleteLast();
		Node temp = get(index);
		int val = temp.next.val;
		temp.next = temp.next.next;
		return val;
	}

	// delete by value
	public int deleteByValue(int value) {
		Node temp = head;
		Node prev = temp;
		if (head.val == value)
			return deleteFirst();
		if (tail.val == value)
			return deleteLast();
		while (temp.val != value) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		return prev.next.val;
	}

	// display function
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.print("END");
	}

	// Node class
	private class Node {
		private int val;
		private Node next;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		public Node(int val) {
			this.val = val;
		}
	}
}
