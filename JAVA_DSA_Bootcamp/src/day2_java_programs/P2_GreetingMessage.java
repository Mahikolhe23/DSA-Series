package day2_java_programs;

import java.util.Scanner;

public class P2_GreetingMessage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name");
		greeting(in.next());
		in.close();
	}

	public static void greeting(String name) {
		System.out.println("Hello , Welcome to Java " + name);
	}
}
