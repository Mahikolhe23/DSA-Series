package gfg.LL;

public class LengthOfLL {
//https://practice.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1?page=2&category[]=Linked%20List&sortBy=submissions
	public static void main(String[] args) {

	}

	int isLengthEvenorOdd(Node head1) {
		Node temp = head1;
		if (head1 == null)
			return 0;
		if (head1.next == null)
			return 1;
		int c = 0;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		if (c % 2 == 0) {
			return 0;
		}
		return 1;
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
