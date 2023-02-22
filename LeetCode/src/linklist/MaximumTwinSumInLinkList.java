package linklist;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
public class MaximumTwinSumInLinkList {

	public static void main(String[] args) {

	}

	public static int pairSum(ListNode head) {
		ListNode temp = head;
		int sum = 0;
		int max = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}
		for (int i = 0; i < list.size(); i++) {
			sum = 0;
			sum = list.indexOf(i) + list.indexOf(list.size() - i);
			if (max < sum) {
				max = sum;
			}
		}
		return max;
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
