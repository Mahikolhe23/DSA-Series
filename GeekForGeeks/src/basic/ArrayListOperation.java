package basic;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/arraylist-operation/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=accuracy
public class ArrayListOperation {

	public static void main(String[] args) {

	}

	public static void insert(ArrayList<Character> clist, char c) {
		clist.add(c);
	}

	public static void freq(ArrayList<Character> clist, char c) {
		for (int i = 0; i < clist.size(); i++) {
			if (clist.get(i) == 'c')
				System.out.println(/* Your code here */);
			else
				System.out.println("Not Present");
		}
	}
}
