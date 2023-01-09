package gfg.LL;

public class ReverseLinkedList {

	public static void main(String[] args) {

	}

	Node reverseList(Node head) {
		Node p = null;
		Node c = head;
		Node n = null;
		while (c != null) {
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		head = p;
		return head;
	}

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}
}
