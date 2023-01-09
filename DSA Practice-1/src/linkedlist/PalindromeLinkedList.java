package linkedlist;

import java.util.ArrayList;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

	public static void main(String[] args) {

	}

	public boolean isPalindrome(ListNode head) {
		ListNode temp = head;
		ArrayList<ListNode> arr = new ArrayList<>();
		while (temp != null) {
			arr.add(temp);
			temp = temp.next;
		}
		int i = 0, j = arr.size() - 1;
		while (i < j) {
			if (arr.get(i).val != (arr.get(j).val)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
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
