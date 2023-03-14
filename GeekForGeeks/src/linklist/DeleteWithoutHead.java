package linklist;

//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&category[]=Linked%20List&sortBy=submissions
public class DeleteWithoutHead {

	public static void main(String[] args) {
	}

	void deleteNode(Node del) {
		Node prev = del;
		while (del.next != null) {
			prev = del;
			del.data = del.next.data;
			del = del.next;
		}
		prev.next = null;
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
