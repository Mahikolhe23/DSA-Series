package linklist.easy;

import java.util.Stack;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkList {

	public static void main(String[] args) {
	}

	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		Stack<ListNode> stack = new Stack<>();
		ListNode temp = head;
		while (temp.next != null) {
			stack.push(temp);
			temp = temp.next;
		}
		head = temp;
		while (!stack.isEmpty()) {
			temp.next = stack.pop();
			temp = temp.next;
		}
		temp.next = null;
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
