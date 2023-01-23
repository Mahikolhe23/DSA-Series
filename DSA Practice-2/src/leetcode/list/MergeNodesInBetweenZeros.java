package leetcode.list;

import java.util.ArrayList;

//https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class MergeNodesInBetweenZeros {

	public static void main(String[] args) {

	}

	public ListNode mergeNodes(ListNode head) {
		ListNode curr;
		ListNode root = new ListNode();
		curr = root;
		int sum = 0;
		while (head != null) {
			if (head.val == 0 && sum != 0) {
				curr.next = new ListNode(sum);
				curr = curr.next;
				sum = 0;
			}
			sum += head.val;
			head = head.next;
		}
		return root.next;
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
