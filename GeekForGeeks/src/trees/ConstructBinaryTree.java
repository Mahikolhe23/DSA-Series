package trees;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/binary-tree-representation/1?page=1&difficulty[]=0&sortBy=accuracy
public class ConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node n;

	public void createTree(Node root0, ArrayList<Integer> v) {
		for (int i = 1; i < v.size(); i++) {
			int leftChild = i + 1;
			int rightChild = i + 2;
			insert(leftChild, root0);
			insert(rightChild, root0);
		}
	}

	public void insert(int i, Node root) {
		if (i % 2 == 0)
			root.left = new Node(i);
		else
			root.right = new Node(i);
	}

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
}
