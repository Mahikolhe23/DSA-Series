package linklist;

import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1?page=1&category[]=Linked%20List&sortBy=submissions
public class SortLinkListUsingBubbleSort {

	public static void main(String[] args) {

	}

	public Node removeDuplicates(Node head) {
//		Node sort = sorting(head);
//		// remove duplicate
//		Node temp = sort;
//		while (temp != null) {
//			if (temp.data == temp.next.data)
//				temp.next = temp.next.next;
//			else
//				temp = temp.next;
//		}
//		return head;
		Node node = head;
		HashSet<Integer> set = new HashSet<Integer>();
		while (node.next != null) {
			set.add(node.data);
			if (set.contains(node.next.data))
				node.next = node.next.next;
			else
				node = node.next;
		}
		return head;
	}

	public Node sorting(Node node) {
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			while (next != null) {
				// if current is greater than next then swap
				if (current.data > next.data) {
					int num = current.data;
					current.data = next.data;
					next.data = num;
				}
				next = next.next;
			}
			current = current.next;
		}
		return node;
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
