package practise.stack;

public class DynamicStack extends CustomStack {
	public DynamicStack() {
		super();
	}

	DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int item) {
		// if stack is full double the size
		if (this.isFull()) {
			int[] temp = new int[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
		return super.push(item);
	}
}
