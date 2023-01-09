package gfg.LL;

import linkedlist.LL;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		LL l = new LL();
		l.delete(1);

	}

	public static int getNthFromLast(Node head, int n) {
		Node temp = head;
		int counter = 1;
		while (temp.next != null) {
			temp = temp.next;
			counter = counter + 1;
		}
		if (n > counter) {
			return -1;
		}
		int i = counter - n;
		temp = head;
		while (i > 0) {
			temp = temp.next;
			i--;
		}
		return temp.val;
	}

	private class Node {
		private int val;
		private Node next;

		@SuppressWarnings("unused")
		public Node(int val) {
			this.val = val;
		}

		@SuppressWarnings("unused")
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}
}
