package linklist.easy;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromLast {

	public static void main(String[] args) {

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n < 0 || (head.next == null && n > 1) || (head.next == null && n == 1)) {
			return null;
		}
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (count == n) {
			head = head.next;
			return head;
		}
		temp = head;
		for (int i = 1; i < count - n; i++) {
			temp = temp.next;
			if (temp.next == null) {
				return null;
			}
		}
		temp.next = temp.next.next;
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
