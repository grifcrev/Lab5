import java.util.*;

public class Kruskal
{
	int[][] cost;
	static int V = 12;
	public static int[] parent = new int[V];
	public static int INF = Integer.MAX_VALUE;
	static String[] cities =
	{ "Seattle", "San Francisco", "Los Angeles", "Las Vegas", "Denver", "Minneapolis", "Dallas", "Chicago",
			"Washington DC", "Miami", "New York", "Boston" };

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

		while (edge_count < V - 1)
		{
			int min = INF, x = -1, y = -1;
			for (int i = 0; i < cost.length; i++)
			{
				for (int j = 0; j < cost[i].length; j++)
				{
					if (find(i) != find(j) && cost[i][j] < min)
					{
						min = cost[i][j];
						x = i;
						y = j;

					}
				}

			}
			int totalcost = min * 1000;
			form(x, y);
			System.out.printf("%s -> %s ($%,d) \n", cities[x], cities[y], totalcost, edge_count++);
			mincost += totalcost;
		}
		int finalcost = mincost;
		System.out.printf("Total Cost: $%,d \n", finalcost);
	}
}
//https://www.geeksforgeeks.org/kruskals-algorithm-simple-implementation-for-adjacency-matrix/
