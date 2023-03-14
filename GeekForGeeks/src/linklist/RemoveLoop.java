package linklist;

//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&category[]=Linked%20List&sortBy=submissions
public class RemoveLoop {

	public static void main(String[] args) {
	}

	public static void removeLoop(Node head) {
		boolean isCycle = false;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next == null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				isCycle = true;
				break;
			}
		}
		if (!isCycle)
			return;
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		while (slow.next != fast) {
			slow = slow.next;
		}
		slow.next = null;
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
