package linklist;

public class DLL {
	Node head;

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		node.next = null;
		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}

		while (last.next != null) {
			last = last.next;
		}
		last.next = node;
		node.prev = last;
	}

	public void display() {
		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.val + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Print in Reverse");
		while (last != null) {
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.println();
	}

	private class Node {
		int val;
		Node prev;
		Node next;

		public Node(int val) {
			this.val = val;
		}

		@SuppressWarnings("unused")
		public Node(int val, Node prev, Node next) {
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
	}
}
