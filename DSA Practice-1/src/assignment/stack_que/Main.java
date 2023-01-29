package assignment.stack_que;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Book b = new Book(1, "Java", 200);
		int a = 10;
		String t = "mysdflsfndslfsfj";
		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("file"))) {
//			FileOutputStream f = new FileOutputStream("file");
			o.writeObject(b);
			ObjectInputStream i = new ObjectInputStream(new FileInputStream("file"));
			System.out.println("read - " + i.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
