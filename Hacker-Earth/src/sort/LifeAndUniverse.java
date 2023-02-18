package sort;

import java.util.Scanner;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
public class LifeAndUniverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			num = sc.nextInt();
			if (num == 42) {
				break;
			} else {
				System.out.println(num);
			}
		}
		sc.close();
	}
}
