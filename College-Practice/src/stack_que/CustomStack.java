package stack_que;

public class CustomStack {
	public int[] data;
	public static int size = 10;
	int ptr = -1;

	public CustomStack() {
		this(size);
	}

	public CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("stack is full");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
	}

	public int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is empty");
		}
		return data[ptr--];
	}

	public boolean isFull() {
		return ptr == data.length - 1;
	}

	public boolean isEmpty() {
		return ptr == -1;
	}
}
