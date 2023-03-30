package linklist;

public class ThreadImplementRunnable {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		EvenPrint e = new EvenPrint();
//		OddPrint o = new OddPrint();
//		Thread t1 = new Thread(e);
//		Thread t2 = new Thread(o);
//		t1.start();
//		t2.start();

//		String s = "42";
//		try {
//			s = s.concat(".5"); /* Line 8 */
//			double d = Double.parseDouble(s);
//			s = Double.toString(d);
//			int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
//			System.out.println(x);
//		} catch (NumberFormatException e1) {
//			System.out.println("bad number");
//		}
//		int a;
//		System.out.println(a);
		Boolean b1 = new Boolean("false");
		boolean b2;
		b2 = b1.booleanValue();
		if (!b2) {
			b2 = true;
			System.out.print("x ");
		}
		System.out.print(b1 & b2);
		if (b1 & b2) /* Line 13 */
		{
			System.out.print("y ");
		}
		System.out.println("z");

	}
}

class EvenPrint implements Runnable {
	@Override
	public void run() {
		int c = 1;
		int n = 10;
		synchronized (this) {
			while (c < n) {
				while (c % 2 == 0) {
					try {
						wait();
					} catch (Exception e) {
					}
				}
				System.out.print("Even" + c + " ");
				c++;
				notifyAll();
			}
		}
	}
}

class OddPrint implements Runnable {
	@Override
	public void run() {
		int c = 1;
		int n = 10;
		synchronized (this) {
			while (c < n) {
				while (c % 2 == 1) {
					try {
						wait();
					} catch (Exception e) {
					}
				}
			}
			System.out.print("Odd" + c + " ");
			c++;
			notifyAll();
		}
	}
}
