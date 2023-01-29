package assignment.list;

public class PriorityQue {
	// array of prio que obj
	Item[] arr = new Item[1000];
	int size = -1;

	public static void main(String[] args) {
		PriorityQue p = new PriorityQue();
		p.enque(0, 0);
	}

	// method to add data in prio que
	public void enque(int value, int priority) {
		arr[++size] = new Item(value, priority);
	}

	// check the top element of que or top prio element in que
	public int peek() {
		int topPrio = 0;
		int ind = -1;
		for (int i = 0; i < size; i++) {
			if (topPrio == arr[i].priority && ind > -1 && arr[ind].value < arr[i].value) {
				topPrio = arr[i].priority;
				ind = i;
			} else if (topPrio < arr[i].priority) {
				topPrio = arr[i].priority;
				ind = i;
			}
		}
		return ind;
	}

	// method to delete the data from que by priority
	public void deque() {
		int i = peek();
		for (int j = i; j < size; j++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	// class for storing object of prio que
	class Item {
		public int value;
		public int priority;

		public Item(int value, int priority) {
			this.value = value;
			this.priority = priority;
		}
	}
}
