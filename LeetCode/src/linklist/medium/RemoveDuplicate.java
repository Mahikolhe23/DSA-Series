package linklist.medium;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicate {
	public static void main(String[] args) {
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode prev = head;
		ListNode temp = head;
		while (temp != null) {
			if (prev.val == temp.val) {
				prev = prev.next;
				if (temp.next != null)
					temp = temp.next.next;
				else
					temp = temp.next;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
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
