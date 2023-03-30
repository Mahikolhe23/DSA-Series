package linklist;

public class SLL {
	NodeClass head;

	public static void main(String[] args) {
		NodeClass n = new NodeClass();
		System.out.println(n.val + " " + n.b);
		new SLL();
	}

	public SLL() {
		System.out.println();
	}

	public void insertFirst(int val) {
		NodeClass node = new NodeClass(val);
		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
		return;
	}

}

class NodeClass extends NodeClass2 {
	int val;
	NodeClass next;
	boolean b;

	public NodeClass() {

	}

	public NodeClass(int val) {
		this.val = val;
	}

	@Override
	public void display() {
		super.display();
	}
}

class NodeClass2 {
	int val;
	NodeClass next;
	boolean b;

	public NodeClass2() {

	}

	public NodeClass2(int val) {
		this.val = val;
	}

	protected void display() {

	}
}
