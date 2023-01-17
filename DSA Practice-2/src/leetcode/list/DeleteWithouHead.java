package leetcode.list;

//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class DeleteWithouHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void deleteNode(ListNode node) {
		if (node != null && node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
