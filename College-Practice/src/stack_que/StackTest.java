package stack_que;

public class StackTest {

	public static void main(String[] args) throws StackException {
		CustomStack stack = new CustomStack();
		System.out.println(stack.push(10));
		System.out.println(stack.pop());

		DynamicStack s = new DynamicStack();
		System.out.println(s.push(15));
		System.out.println(s.pop());
	}
}
