package graphs;

import java.util.Scanner;
import java.util.Stack;

public class Graphs {
	private int vertices[];
	private int[][] edges;
	private int n;
	Scanner in = new Scanner(System.in);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the No. of Vertices : ");
		Graphs g = new Graphs(in.nextInt());
		g.insert();
		// g.display();
		g.dfs(0);
//		g.dfs(2, new int[4]);
	}

	// dfs in graphs
	public void dfs(int start) {
		Stack<Integer> stack = new Stack<Integer>();
		// array for visited nodes
		int[] visit = new int[n];
		// starting index;
		// visit the index
		System.out.print(vertices[start] + " ");
		// mark this this as visited in visit array
		visit[start] = 1;
		// push this on stack
		stack.push(start);
		while (!stack.isEmpty()) {
			for (int i = 0; i < vertices.length; i++) {
				if (edges[start][i] == 1 && visit[i] == 0) {
					System.out.print(vertices[i] + " ");
					visit[i] = 1;
					stack.push(i);
					start = i;
					i = -1;
				}
			}
			start = stack.pop();
		}
		System.out.println();
	}

	// recursive dfs
	public void dfs(int start, int[] visit) {
		if (visit[start] == 0) {
			System.out.println(vertices[start] + " ");
			visit[start] = 1;
			for (int i = 0; i < vertices.length; i++) {
				if (edges[start][i] == 1 && visit[i] == 0) {
					dfs(i, visit);
				}
			}
		}
	}

	// insert data into graphs;
	public void insert() {
		System.out.println("Enter the values : ");
		for (int i = 0; i < vertices.length; i++) {
			vertices[i] = in.nextInt();
		}
		System.out.println("Enter the edges : ");
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < edges[i].length; j++) {
				edges[i][j] = in.nextInt();
			}
		}
	}

	// display function
	public void display() {
		for (int i : vertices) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(vertices[i] + " ");
			for (int j = 0; j < n; j++) {
				System.out.print(edges[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// graphs constructor
	public Graphs(int n) {
		this.n = n;
		vertices = new int[n];
		edges = new int[n][n];
	}
}
