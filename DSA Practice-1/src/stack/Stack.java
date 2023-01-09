package stack;

public class Stack {
	private int[] stack;
	private int size = 10;
	private int top = -1;

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s.pop());
		
	}

	public Stack(int size) {
		stack = new int[size];
	}

	public Stack() {
		stack = new int[size];
	}

	// display function
	public void display() {
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] == 0) {
				return;
			}
			System.out.println(stack[i] + "  ");
		}
	}

	// push element into stack
	public void push(int data) {
		if (!isFull()) {
			stack[++top] = data;
			return;
		} else
			System.out.println("stack is full");
	}

	// pop element from stack
	public int pop() {
		if (!isEmpty()) {
			int temp = stack[top--];
			return temp;
		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	// peek element from stack
	public int peek() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			System.out.println("stck is empty");
			return -1;
		}
	}

	// check if stack is not empty , if top is at -1 then stack is empty , else not
	private boolean isEmpty() {
		return top == -1;
	}

	// check stack is full or not , is top is at peek of the stack then stack is
	// full else empty
	private boolean isFull() {
		return top == stack.length - 1;
	}
}
