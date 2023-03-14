package practise.queue;

public class CustomQueue {
	public int[] data;
	public int front;
	public int end;
	private static final int SIZE = 10;

	public CustomQueue() {
		this(SIZE);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Queue is Full");
		}
		data[end++] = item;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		int temp = data[0];
		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;
		return temp;
	}

	public void display() {
		for (int i = front; i < end; i++) {
			System.out.print(data[i] + " -> ");
		}
		System.out.print("END");
	}

	public boolean isEmpty() {
		return front == end;
	}

	public boolean isFull() {
		return end == data.length - 1;
	}
}
