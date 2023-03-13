package string;

//https://practice.geeksforgeeks.org/problems/count-number-of-nodes-in-a-binary-tree/1?page=1&difficulty[]=0&sortBy=accuracy
public class CounterNumberOfNodes {

	public static void main(String[] args) {

	}

	public int countNodes(Node root) {
		if (root == null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

}
