import java.util.*;

public class Kruskal
{
	static int V = 20;
	public static int[] parent = new int[V];
	public static int INF = Integer.MAX_VALUE;

	public static int find(int i)
	{
		while (parent[i] != i)
			i = parent[i];
		return i;
	}

	public static void form(int i, int j)
	{
		int x = find(i);
		int y = find(j);
		parent[x] = y;
	}

	public static void kruskalMT(int cost[][])
	{
		int mincost = 0;
		for (int i = 0; i < V; i++)
			parent[i] = i;
		
		int edge_count = 0;
		
		while(edge_count < V - 1) {
			int min = INF, x = -1, y = -1;
			for(int i =0; i<V; i++) {
			for(int j = 0; j < V; j++) {
				if(find(i) != find(j) && cost[i][j] < min) {
					min = cost[i][j];
					x=i;
					y=j;
				}
			}
		}
		}
		
		form(mincost, INF);
		System.out.printf("Edgd %d:(%d,%d) cost:%d \n",edge_count++, mincost, INF, edge_count);
		mincost += edge_count;
	}
}