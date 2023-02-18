package linklist;

public class MiddleElemetnInLL {

	public static void main(String[] args) {

	}

	public static int getMiddle(Node head) {
		if (head.next == null) {
			return head.val;
		}
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int m = (count / 2) + 1;
		for (int i = 1; i < m; i++) {
			head = head.next;
		}
		return head.val;
	}

	public class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}
}
