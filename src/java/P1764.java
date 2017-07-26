package graphos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			
			String input = scan.readLine();
			
			if(input.equals("0 0"))
				break;

			String[] split = input.split(" ");
			Integer vertexes = Integer.parseInt(split[0]);
			Integer count = Integer.parseInt(split[1]);
			PriorityQueue<Route> queue = new PriorityQueue<>();
			ArrayList<LinkedList<Route>> adjList = new ArrayList<LinkedList<Route>>();

			int totalCost = 0, index = 1;

			boolean[] checks = new boolean[vertexes];

			for (int i = 0; i < vertexes; i++) {
				adjList.add(new LinkedList<Route>());
			}

			while (count-- > 0) {

				String[] split2 = scan.readLine().split(" ");

				int origin = Integer.parseInt(split2[0]);
				int destin = Integer.parseInt(split2[1]);
				int cost = Integer.parseInt(split2[2]);

				Route router = new Route();
				router.cost = cost;
				router.destin = destin;

				Route router2 = new Route();
				router2.cost = cost;
				router2.destin = origin;

				adjList.get(origin).add(router);
				adjList.get(destin).add(router2);

			}

			while (vertexes-- > 0) {

				checks[index] = true;
				LinkedList<Route> currentRoute = adjList.get(index);

				for (int i = 0; i < currentRoute.size(); i++) {
					queue.add(currentRoute.get(i));
				}
				Route router;
				while (true) {
					router = queue.poll();

					if (router == null)
						break;

					if (!checks[router.destin]) {
						totalCost += router.cost;
						index = router.destin;
						break;
					}
				}

			}

			System.out.println(totalCost);

		}
	}

}

class Route implements Comparable<Route> {
	Integer destin;
	Integer cost;

	@Override
	public int compareTo(Route route2) {
		return cost.compareTo(route2.cost);
	}
}
