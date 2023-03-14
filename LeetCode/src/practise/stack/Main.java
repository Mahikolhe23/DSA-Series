package practise.stack;

public class Main {

	public static void main(String[] args) {
		CustomStack stack = new DynamicStack(2);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.display();
		System.out.println(stack.top());
	}
}
