package linklist;

import java.util.Stack;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		Stack<ListNode> stack1 = new Stack<>();
		Stack<ListNode> stack2 = new Stack<>();
		ListNode temp = head;
		while (temp != null) {
			stack1.push(temp);
			stack2.push(temp.next);
			temp = temp.next.next;
		}
		ListNode temp1 = head;
		head = head.next;
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			temp1 = stack2.pop();
			temp1.next = stack1.pop();
			temp1 = temp1.next;
		}
		return head;
	}
}
