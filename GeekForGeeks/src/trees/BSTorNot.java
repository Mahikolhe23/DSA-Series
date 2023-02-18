package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BSTorNot {

	public static void main(String[] args) {

	}

	static int minValue(Node node) {
		if (node == null) {
			return -1;
		}
		if ((node.left == null && node.right == null) || node.left == null) {
			return node.data;
		}
		Node temp = node;
		if (node.left == null) {

		}
		while (temp != null) {
			

		}

		return -1;
	}

	static boolean isBST(Node root) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			list.add(temp.data);
			temp = temp.right;
		}
		Collections.sort(list);
		int count = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				count++;
			}
		}
		if (count == list.size() - 1) {
			return true;
		}
		return false;
	}

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
}
