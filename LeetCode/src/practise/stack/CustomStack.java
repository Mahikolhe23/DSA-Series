package practise.stack;

public class CustomStack {
	public int[] data;
	private int top = -1;
	private static final int SIZE = 10;

	public CustomStack() {
		this(SIZE);
	}

	CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return false;
		}
		data[++top] = item;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = data[top--];

		return val;
	}

	public boolean isFull() {
		return top == data.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(data[i] + " -> ");
		}
		System.out.println("END");
	}

	public int top() {
		return data[top];
	}
}
