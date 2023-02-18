package linklist;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class FindMiddleOfLinkList {

	public static void main(String[] args) {

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

	public ListNode middleNode(ListNode head) {
		if (head.next == null)
			return head;
		if (head.next.next == null)
			return head.next;
		int c = 0;
		ListNode temp = head;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		temp=head;
		for (int i = 0; i < c / 2; i++) {
			temp = temp.next;
		}
		if (c % 2 == 1)
			return temp;
		return temp.next;
	}
}
