
public class Driver
{
	public static void main (String[] args) {
		
		int cost[][] = {
				{Kruskal.INF, 2661, Kruskal.INF, 2161, Kruskal.INF, 1306, Kruskal.INF},
				{2661, Kruskal.INF, 661, 1483, 1532},
				{661, Kruskal.INF, 1613, 1145},
				{1613, Kruskal.INF, 725, 338},
				{338, Kruskal.INF, 383, 2145},
				{1145, 725, 383, Kruskal.INF, 1709, 2113},
				{1306, Kruskal.INF, 919, 629},
				{919, Kruskal.INF, 1225, 435, 1983},
				{2161, 1483, Kruskal.INF, 1225, 1258},
				{1983, 1258, 1932, 2113,Kruskal.INF, 2161},
				{629, Kruskal.INF, 435},
				{Kruskal.INF, 2161, 1709, 2145, Kruskal.INF}
				};
		Kruskal.kruskalMT(cost);
		}
	}
