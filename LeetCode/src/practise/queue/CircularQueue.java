package practise.queue;

public class CircularQueue {
	private int[] data;
	private int front;
	private int end;
	private int size;
	private static final int CAPACITY = 10;

	public CircularQueue() {
		this(CAPACITY);
	}

	public CircularQueue(int c) {
		this.data = new int[c];
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		data[end++] = item;
		end = end % data.length;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int val = data[front++];
		front = front % data.length;
		size--;
		return val;
	}

	public void display() {
		if (isEmpty())
			return;
		int i = front;
		do {
			System.out.print(data[i] + " -> ");
			i++;
			i = i % data.length;
		} while (i != end);
		System.out.print("END");
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return (front == 0 && (end == size - 1) || (front == end + 1));
	}
}
