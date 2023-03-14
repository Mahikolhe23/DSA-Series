package practise.list;

public class Main {

	public static void main(String[] args) {
//		SLL list = new SLL();
//		list.insertFirst(10);
//		list.insertFirst(3);
//		list.insertFirst(12);
//		list.insertFirst(5);
//		list.display();
//		list.deleteByValue(10);
//		System.out.println();
//		list.display();

//		DLL list = new DLL();
//		list.insertFirst(10);
//		list.insertFirst(3);
//		list.insertFirst(12);
//		list.insertFirst(5);
//		list.display();
//		list.insertLast(23);
//		list.display();
//		list.insert(55, 2);
//		list.display();
//		list.deleteFirst();
//		list.display();
//		list.deleteLast();
//		list.display();
//		list.delete(2);
//		list.display();

		CLL list = new CLL();
		list.insertFirst(10);
		list.insertFirst(23);
		list.insertFirst(2);
		list.insertFirst(15);
		list.display();
		list.insertLast(62);
		System.out.println();
		list.display();
		list.insert(4, 29);
		System.out.println();
		list.display();
		list.deleteFirst();
		System.out.println();
		list.display();
		list.deleteLast(10);
		System.out.println();
		list.display();
	}
}
