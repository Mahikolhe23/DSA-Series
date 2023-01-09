package gfg.LL;

public class CountNodesInLL {

	public static void main(String[] args) {

	}

	public static int getCount(Node head) {
		if (head == null) {
			return 0;
		}
		if (head.next == null) {
			return 1;
		}
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	class Node {
		int data;
		Node next;

		Node(int a) {
			data = a;
			next = null;
		}
	}
}
