package linklist;

//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=1&category[]=Linked%20List&sortBy=submissions
public class RemoveDuplicate {

	public static void main(String[] args) {
	}

	Node removeDuplicates(Node head) {
		Node temp = head;
		while (temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
}
