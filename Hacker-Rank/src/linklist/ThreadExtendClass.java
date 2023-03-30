package linklist;

public class ThreadExtendClass extends Thread {
	int counter = 1;
	static int N;

	public static void main(String[] args) {
		N = 10;
		ThreadExtendClass t = new ThreadExtendClass();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.oddNumber();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.evenNumber();
			}
		});
		t1.start();
		t2.start();
	}

	public void oddNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}

	public void evenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}
}
