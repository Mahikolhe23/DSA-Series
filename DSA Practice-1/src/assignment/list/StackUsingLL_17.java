package assignment.list;

public class StackUsingLL_17 {
	Node head;

	public static void main(String[] args) {
		StackUsingLL_17 s = new StackUsingLL_17();
		s.push(20);
		s.push(10);
		s.push(30);
		s.push(50);
		s.push(40);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

	// push into stack
	@SuppressWarnings("unused")
	public void push(int data) {
		Node node = new Node(data);
		if (node == null) {
			return;
		}
		// check if head is empty
		if (head == null) {
			head = node;
			return;
		}
		// more than one node is present
		node.next = head;
		head = node;
	}

	// pop from stack
	public void pop() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		head = head.next;
	}

	// peek of stack
	public int peek() {
		if (!isEmpty())
			return head.data;
		return -1;
	}

	private boolean isEmpty() {
		return head == null;
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
