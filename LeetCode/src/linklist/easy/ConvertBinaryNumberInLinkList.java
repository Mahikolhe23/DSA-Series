package linklist.easy;

//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class ConvertBinaryNumberInLinkList {
	public static void main(String[] args) {

	}

	public static int getDecimalValue(ListNode head) {
		ListNode temp = head;
		if (head == null)
			return 0;
		String ans = "";
		while (temp != null) {
			ans += temp.val;
			temp = temp.next;
		}
		int value = Integer.parseInt(ans, 2);
		return value;
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
