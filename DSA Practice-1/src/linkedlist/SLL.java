package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class SLL {
	private Node head;

	public static void main(String[] args) {
		SLL s = new SLL();
		s.insertFirst(10);
		s.insertFirst(20);
		s.insertFirst(30);
		s.insertFirst(50);
		s.insertFirst(40);
//		// s.insertFirst(60);
//		s.display();
//		System.out.println();
//		s.alter();
		s.display(s.getHead());
		System.out.println();
		Node n = s.reverse(s.getHead());
		s.display(n);
	}

	public Node getHead() {
		return head;
	}

	// remove duplicates from LL
	// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	public Node deleteDuplicates(Node head) {
		if (head == null || head.next == null)
			return head;
		HashSet<Integer> h = new HashSet<Integer>();
		while (head != null) {
			h.add(head.data);
			head = head.next;
		}
		ArrayList<Integer> l = new ArrayList<Integer>(h);
		head = new Node(l.get(0));
		Node temp = head;
		for (int i = 1; i < h.size(); i++) {
			Node node = new Node(l.get(i));
			temp.next = node;
			temp = temp.next;
		}
		return head;
	}

	// swap pair of nodes
	// https://leetcode.com/problems/swap-nodes-in-pairs/
	public Node swapPairs(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		Node temp = head;
		Node newHead = head.next;
		while (temp != null) {
			Node node = temp.next;
			Node t = node.next;
			node.next = temp;
			temp = temp.next;
			temp.next = t;
		}
		return newHead;
	}

	// merge two LL
	// https://leetcode.com/problems/merge-two-sorted-lists/
	public Node mergeTwoLists(Node list1, Node list2) {
		Node temp = new Node(0);
		Node prev = temp;
		while (list1 != null && list2 != null) {
			if (list1.data <= list2.data) {
				prev.next = list1;
				list1 = list1.next;
			} else {
				prev.next = list2;
				list2 = list2.next;
			}
			prev = prev.next;
		}
		while (list1 != null) {
			prev.next = list1;
		}

		while (list2 != null) {
			prev.next = list2;
		}
		return temp.next;
	}

	// https://leetcode.com/problems/add-two-numbers/
	// add two LL
	public Node addTwoNumbers(Node l1, Node l2) {
		Node temp = l1;
		String n1 = "";
		String n2 = "";
		while (temp != null) {
			n1 = n1 + temp.data;
			temp = temp.next;
		}
		temp = l2;
		while (temp != null) {
			n2 = n2 + temp.data;
			temp = temp.next;
		}

		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int revn1 = rev(num1);
		int revn2 = rev(num2);
		int ans = revn1 + revn2;
		int revans = rev(ans);
		String ans1 = Integer.toString(revans);
		char a = ans1.charAt(0);
		int b = a - '0';
		Node node = new Node(b);
		head = node;
		temp = head;
		for (int i = 1; i < ans1.length(); i++) {
			a = ans1.charAt(i);
			b = a - '0';
			node = new Node(b);
			temp.next = node;
			temp = temp.next;
		}
		return head;
	}

	// reverse the number
	public int rev(int n) {
		int rever = 0;
		while (n > 0) {
			int rem = n % 10;
			rever = rever * 10 + rem;
			n = n / 10;
		}
		return rever;
	}

	// reverse using recursion
	public Node reverse(Node head) {
		if (head == null)
			return head;
		if (head.next == null)
			return head;
		Node node = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return node;
	}

	// reverse print using recursion
	public void revPrint(Node root) {
		if (root == null) {
			return;
		}
		revPrint(root.next);
		System.out.print(root.data + " -> ");
	}

	// check if LL is palindrome
	public boolean palindrome() {
		// if only one node
		if (head.next == null) {
			return true;
		}
		// more than one node add to list collection
		ArrayList<Integer> list = new ArrayList<>();
		Node temp = head;
		// add all element in list
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		}
		// call the reverse method to reverse the LL
		reverse();
		// again add all element in list2
		ArrayList<Integer> list2 = new ArrayList<>();
		temp = head;
		while (temp != null) {
			list2.add(temp.data);
			temp = temp.next;
		}
		// check both list are equal or not
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == list2.get(i)) {
				count++;
			}
		}
		if (count == list.size())
			return true;
		return false;
	}

	// search by index
	public int searchByIndex(int index) {
		// check if only one node is present or index is one
		if (index < 0) {
			return -1;
		}
		if (head.next == null || index == 1) {
			return head.data;
		}
		// more than one is present
		Node temp = head;
		// locate the prev node of index
		for (int i = 2; i <= index; i++) {
			temp = temp.next;
			if (temp == null) {
				return -1;
			}
		}
		return temp.data;
	}

	// search by value and return index
	public int searchByValue(int data) {
		Node temp = head;
		int count = 1;
		while (temp != null) {
			if (temp.data == data) {
				return count;
			}
			count++;
			temp = temp.next;
		}
		return -1;
	}

	// sort LL using collection and return new head
	public Node sortLL() {
		// check only one node is present
		if (head.next == null) {
			return head;
		}
		// more than one node in LL , then add to arraylist and apply collection sort
		Node temp = head;
		ArrayList<Integer> list = new ArrayList<>();
		// add every node in arraylist
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		} // sort by collection method
		Collections.sort(list);
		head = new Node(list.get(0));
		temp = head;
		// create new sorted LL
		for (int i = 1; i < list.size(); i++) {
			Node node = new Node(list.get(i));
			temp.next = node;
			temp = temp.next;
		}
		return head;
	}

	// reverse LL using stack
	public void reverse() {
		Stack<Node> stack = new Stack<>();
		Node temp = head;
		if (head == null) {
			return;
		}
		// push all element in stack
		while (temp.next != null) {
			stack.push(temp);
			temp = temp.next;
		}
		head = temp;
		while (!stack.isEmpty()) {
			temp.next = stack.pop();
			temp = temp.next;
		}
		temp.next = null;
	}

	// insert data at first index
	@SuppressWarnings("unused")
	public void insertFirst(int data) {
		Node node = new Node(data);
		// check new node created or not
		if (node == null) {
			return;
		}
		// check if LL is Empty or not
		if (head == null) {
			head = node;
			return;
		}
		// More than one node in LL
		node.next = head;
		head = node;
	}

	// delete alternate node
	public void alter() {
		if (head == null) {
			return;
		}
		Node temp = head;
		// make new node to every next.next node
		while (temp != null && temp.next != null) {
			temp.next = temp.next.next;
			temp = temp.next;
		}
	}

	// Insert at last in LL
	@SuppressWarnings("unused")
	public void insertLast(int data) {
		Node node = new Node(data);
		// check new node created or not
		if (node == null) {
			return;
		}
		// check if head is null
		if (head == null) {
			head = node;
			return;
		}
		// if more than one node present in LL
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			prev = temp;
			temp = temp.next;
		}
		// temp is at null and prev is at last position
		prev.next = node;
	}

	// insert at index
	public void insertAtIndex(int data, int index) {
		Node node = new Node(data);
		// check if node is created or not
		if (node == null || index < 0) {
			return;
		}
		// check if head is empty
		if (head == null || index == 1) {
			insertFirst(data);
			return;
		}
		Node temp = head;
		// locate the prev node of new node
		for (int i = 2; i < index; i++) {
			temp = temp.next;
			if (temp == null) {
				return;
			}
		}
		node.next = temp.next;
		temp.next = node;
	}

	// delete first
	public void deleteFirst() {
		// if only one node
		if (head.next == null) {
			head = null;
			return;
		}
		// if more than one node present in LL
		head = head.next;
	}

	// delete last
	public void deleteLast() {
		// if only one node is present
		if (head.next == null) {
			head = null;
			return;
		}
		// if more than one node is present
		Node temp = head;
		Node prev = head;
		// locate the prev node of last node
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	// delete at index
	public void deleteAtIndex(int index) {
		// check only one node is present in LL
		if (head.next == null || index == 1) {
			deleteFirst();
		}
		// more than one node then locate the prev node of deletable node
		Node prev = head;
		for (int i = 2; i < index; i++) {
			prev = prev.next;
			if (prev == null) {
				return;
			}
		}
		prev.next = prev.next.next;
	}

	// find no. of node in LL
	public int count() {
		Node temp = head;
		int count = 0;
		// check if head is null
		if (head == null) {
			return count;
		}
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	// display
	public void display(Node head) {
		Node temp = head;
		if (head == null) {
			System.out.print("Empty LL");
			return;
		}
		// if head is not null then traverse to entire LL
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	// Node Class
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
