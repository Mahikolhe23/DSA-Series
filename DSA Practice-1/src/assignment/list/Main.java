package assignment.list;

public class Main {

	public static void main(String[] args) {
//		LL l = new LL();
//		l.insertFirst(10);
//		l.insertFirst(20);
//		l.insertFirst(30);
//		l.insertFirst(40);
//		l.insert(15, 2);
//		l.display();
//		System.out.println(l.deleteFirst());
//		l.display();
//		l.deleteLast();
//		l.display();
//		DLL dl = new DLL();
//		dl.insertFirst(10);
//		dl.insertFirst(20);
//		dl.insertFirst(30);
//		dl.display();
		DLL2 d = new DLL2();
		d.insertFirst(10);
		d.insertFirst(20);
		d.insertFirst(30);
		// d.display();
		d.insertLast(40);
		d.insertLast(50);
		d.display();
		d.insertAtIndex(100, 5);
		d.display();

	}

}
