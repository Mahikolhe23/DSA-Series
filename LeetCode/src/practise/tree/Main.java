package practise.tree;

public class Main {

	public static void main(String[] args) {
		BST b = new BST();
		b.insert(50);
		b.insert(40);
		b.insert(60);
		b.insert(20);
		b.preorder(b.getRoot());
		System.out.println();
		b.inorder(b.getRoot());
		System.out.println();
		b.postorder(b.getRoot());
		System.out.println();
		b.preorder();
		System.out.println();
		b.inorder();
		System.out.println();
		b.postorder();
		System.out.println();
		System.out.println(b.getMin() + " " + b.getMax());
	}
}
