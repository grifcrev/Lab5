
public class Driver
{
	public static void main(String[] args)
	{

		int cost[][] =
		{
				{ 0, 1306, Kruskal.INF, Kruskal.INF, 2161, 2661, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF, Kruskal.INF }, // Seattle
				{ 1306, 0, 629, 919, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF, Kruskal.INF }, // San Francisco
				{ Kruskal.INF, 629, 0, 435, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF, Kruskal.INF, Kruskal.INF }, // Los Angeles
				{ Kruskal.INF, 919, 435, 0, 1225, Kruskal.INF, 1983, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF }, // Las Vegas
				{ 2161, Kruskal.INF, Kruskal.INF, 1225, 0, 1483, 1258, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF, Kruskal.INF }, // Denver
				{ 2661, Kruskal.INF, Kruskal.INF, Kruskal.INF, 1483, 0, 1532, 661, 1145, Kruskal.INF, Kruskal.INF,
						Kruskal.INF }, // Minneapolis
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, 1983, 1258, 1532, 0, Kruskal.INF, 2113, 2161, Kruskal.INF,
						Kruskal.INF }, // Dallas
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, 661, Kruskal.INF, 0, 1145,
						Kruskal.INF, Kruskal.INF, 1613 }, // Chicago
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, 2113, 1145, 0, 1709,
						383, 725 }, // Wash DC
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, 2161, Kruskal.INF, 1709,
						0, 2145, Kruskal.INF }, // Miami
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF,
						Kruskal.INF, 383, 2145, 0, 338 }, // New York
				{ Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, Kruskal.INF, 1613, 725,
						Kruskal.INF, 338, 0 } }; // Boston
		Kruskal.kruskalMT(cost);
	}
}
