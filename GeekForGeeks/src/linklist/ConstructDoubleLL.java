package linklist;

//https://practice.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?page=1&difficulty[]=0&sortBy=accuracy
public class ConstructDoubleLL {

	public static void main(String[] args) {
	}

	Node constructDLL(int arr[]) {
		if (arr.length == 0)
			return null;

		if (arr.length == 1)
			return new Node(arr[0]);

		Node head = new Node(arr[0]);
		Node temp = head;
		for (int i = 1; i < arr.length; i++) {
			Node node = new Node(arr[i]);
			temp.next = node;
			node.prev = temp;
			temp = temp.next;
		}
		return head;
	}

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int x) {
			data = x;
			next = null;
			prev = null;
		}
	}
}
