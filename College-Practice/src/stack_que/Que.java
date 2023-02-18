package stack_que;

public class Que {
	private int[] que;
	private int front = -1;
	private int rear = -1;
	private int size = 10;

	public static void main(String[] args) {
		Que q = new Que(5);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(50);
		q.enqueue(10);
		q.enqueue(40);
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
	}

	// constructor for que
	public Que(int size) {
		que = new int[size];
	}

	public Que() {
		que = new int[size];
	}

	// inset element in que from rear
	public void enqueue(int data) {
		if (!isFull()) {
			que[++rear] = data;
			if (front == -1) {
				front = 0;
			}
		} else {
			System.out.println("Que is full");
		}
	}

	// check if que is full or not
	private boolean isFull() {
		return rear == que.length - 1;
	}

	// dequeue from que
	public int deque() {
		if (!isEmpty())
			return que[front++];
		return -1;
	}

	// check if que is empty or not
	private boolean isEmpty() {
		return (front == -1 || front > rear);
	}
}
