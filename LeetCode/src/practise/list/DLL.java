package practise.list;

public class DLL {
	Node head;
	int size;

	// insert first
	public void insertFirst(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
		size++;
	}

	// insert last
	public void insertLast(int val) {
		Node node = new Node(val);
		Node temp = head;
		if (head == null) {
			insertFirst(val);
			return;
		}

		while (temp.next != null)
			temp = temp.next;
		temp.next = node;
		node.prev = temp;
		size++;
	}

	// insert at index
	public void insert(int val, int index) {
		if (index == 0 || (head == null) && index > 1) {
			insertFirst(val);
			return;
		}
		Node temp = get(index);
		Node node = new Node(val);
		node.prev = temp;
		node.next = temp.next;
		if (temp.next != null)
			node.next.prev = node;
		temp.next = node;
		size++;
	}

	// get Node at index
	public Node get(int index) {
		Node temp = head;
		for (int i = 1; i < index; i++) {
			if (temp.next == null)
				return temp;
			temp = temp.next;
		}
		return temp;
	}

	// delete first
	public int deleteFirst() {
		int val;
		if (head.next == null) {
			val = head.val;
			head = null;
			return val;
		}
		val = head.val;
		head = head.next;
		size--;
		return val;
	}

	// delete last
	public int deleteLast() {
		int val;
		if (head.next == null) {
			val = head.val;
			head = null;
			return val;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		val = temp.val;
		temp.prev.next = null;
		size--;
		return val;
	}

	// delete at index
	public int delete(int index) {
		if (index > size)
			return -1;
		if (index == 0)
			return deleteFirst();
		if (index == size)
			return deleteLast();
		Node temp = get(index);
		int val = temp.next.val;
		temp.next = temp.next.next;
		temp.next.prev = null;
		return val;
	}

	// display
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private class Node {
		private int val;
		private Node next;
		private Node prev;

		public Node(int val) {
			this.val = val;
		}
	}
}
