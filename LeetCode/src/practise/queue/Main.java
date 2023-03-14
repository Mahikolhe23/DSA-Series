package practise.queue;

public class Main {

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.display();
	}
}
