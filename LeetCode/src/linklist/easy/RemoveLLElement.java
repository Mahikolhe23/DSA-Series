package linklist.easy;

//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLLElement {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {
		// check if head is empty
		if (head == null)
			return null;
		// if more than one is present
		ListNode temp = head;
		while (temp.next != null) {
			if (temp.next.val == val) {
				temp.next = temp.next.next;
			} else
				temp = temp.next;
		}
		return head.val == val ? head.next : head;
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
