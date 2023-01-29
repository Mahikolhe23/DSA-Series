package graphs;

import java.util.Scanner;

public class GraphsUsingArray {
	private int[] vertices;
	private int[][] edges;
//	private int n;
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		GraphsUsingArray g = new GraphsUsingArray(4);
		g.insert();
		g.dfs(2, new int[4]);
	}

	// dfs in graphs with recursion
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

	// graphs constructor
	public GraphsUsingArray(int n) {
		vertices = new int[n];
		edges = new int[n][n];
	}

	// insert into graphs
	public void insert() {
		// value for vertices
		System.out.println("Enter the vertices value");
		for (int i = 0; i < vertices.length; i++) {
			vertices[i] = in.nextInt();
		}
		// edged value for connected vertices
		System.out.println("Enter the value for edges");
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < edges[i].length; j++) {
				edges[i][j] = in.nextInt();
			}
		}
	}
}
