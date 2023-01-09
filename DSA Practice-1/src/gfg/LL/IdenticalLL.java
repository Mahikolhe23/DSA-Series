package gfg.LL;

public class IdenticalLL {

	public static void main(String[] args) {

	}

	public boolean isIdentical(Node head1, Node head2) {
		if (head1 == null && head2 == null) {
			return true;
		}
		if (head1 != null && head2 != null)
			return (head1.data == head2.data) && isIdentical(head1.next, head2.next);
		return false;
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
