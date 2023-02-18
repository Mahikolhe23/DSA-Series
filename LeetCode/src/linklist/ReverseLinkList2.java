package linklist;

import java.util.Stack;

//https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkList2 {

	public static void main(String[] args) {
	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode leftNode = head;
		ListNode rightNode = head;
		@SuppressWarnings("unused")
		ListNode leftNodeprev = head;
		@SuppressWarnings("unused")
		ListNode rightNodeprev = head;
		for (int i = 1; i < left; i++) {
			leftNodeprev = leftNode;
			leftNode = leftNode.next;
		}
		for (int i = 1; i < right; i++) {
			rightNodeprev = rightNode;
			rightNode = rightNode.next;
		}
		ListNode[] list = reverseList(leftNode, rightNode);
		leftNodeprev = list[0];
		rightNodeprev = list[1];
		return head;
	}

	public ListNode[] reverseList(ListNode left, ListNode right) {
		Stack<ListNode> stack = new Stack<>();
		ListNode temp = left;
		while (temp != right) {
			stack.push(temp);
			temp = temp.next;
		}
		left = temp;
		while (!stack.isEmpty()) {
			temp.next = stack.pop();
			temp = temp.next;
		}
		temp.next = null;
		ListNode[] list = new ListNode[2];
		list[0] = left;
		list[1] = temp;
		return list;
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
