package assignment.stack_que;

public class CircularQue {
	private int[] cq;
	private int front = -1;
	private int rear = -1;
	private int count = 0;
	private int size = 10;

	public static void main(String[] args) {
		CircularQue c = new CircularQue(5);
		c.enqueue(20);
		c.enqueue(10);
		c.enqueue(40);
		c.enqueue(30);
		c.enqueue(60);
		System.out.println(c.deque());
		System.out.println(c.deque());
		System.out.println(c.deque());
		System.out.println(c.deque());
		System.out.println(c.deque());
	}

	public CircularQue() {
		cq = new int[size];
	}

	public CircularQue(int size) {
		cq = new int[size];
	}

	// insert element into cq
	public void enqueue(int data) {
		if (!isFull()) {
			rear = (++rear) % cq.length;
			cq[rear] = data;
			if (front == -1)
				front = 0;
			count++;
		} else {
			System.out.println("que is full");
		}
	}

	// check que is full or not
	private boolean isFull() {
		return count == cq.length;
	}

	// delete element from que
	public int deque() {
		if (!isEmpty()) {
			int temp = cq[front];
			front = (++front) % cq.length;
			count--;
			return temp;
		} else
			System.out.println("Que is Empty");
		return -1;
	}

	private boolean isEmpty() {
		return count == 0;
	}
}
