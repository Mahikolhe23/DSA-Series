package linklist;

//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1?page=1&category[]=Linked%20List&sortBy=submissions
public class AddTwoNumber {
	public static void main(String[] args) {
	}

	Node addTwoLists1(Node first, Node second) {
		Node temp = first;
		String s1 = "";
		String s2 = "";
		while (temp != null) {
			s1 += temp.data;
			temp = temp.next;
		}
		temp = second;
		while (temp != null) {
			s2 += temp.data;
			temp = temp.next;
		}
		int n = Integer.parseInt(s1) + Integer.parseInt(s2);
		String ans = Integer.toString(n);
		Node node = new Node(ans.charAt(0) - '0');
		temp = node;
		for (int i = 1; i < ans.length(); i++) {
			int a = ans.charAt(i) - '0';
			temp.next = new Node(a);
			temp = temp.next;
		}
		return node;
	}

	Node addTwoLists(Node first, Node second) {
		first = reverse(first);
		second = reverse(second);
		Node dummy = new Node(-1);
		Node temp = dummy;
		int carry = 0;
		while (first != null || second != null || carry == 1) {
			int sum = 0;
			if (first != null) {
				sum += first.data;
				first = first.next;
			}
			if (second != null) {
				sum += second.data;
				second = second.next;
			}
			sum += carry;
			carry = sum / 10;
			Node node = new Node(sum % 10);
			temp.next = node;
			temp = temp.next;
		}
		return reverse(dummy.next);
	}

	// reverse linklist
	public Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
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
