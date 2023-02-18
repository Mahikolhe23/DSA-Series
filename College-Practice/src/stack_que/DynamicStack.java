package stack_que;

public class DynamicStack extends CustomStack {

	@Override
	public boolean push(int item) {
		if (this.isFull()) {
			// double the size
			int[] temp = new int[data.length * 2];
			// copy the previous item in temp;
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
		// insert the item
		return super.push(item);
	}
}
