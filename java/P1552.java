package graphos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P1552 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(scan.readLine());
		
		while (testCases-- > 0) {

			Integer count = Integer.parseInt(scan.readLine());
			PriorityQueue<Web> queue = new PriorityQueue<>();
			ArrayList<LinkedList<Web>> adjList = new ArrayList<LinkedList<Web>>();
			ArrayList<Person> personList = new ArrayList<>();

			Double totalCost = new Double(0); 
            int index = 0;

			boolean[] checks = new boolean[count];

			for (int i = 0; i < count; i++) {
				adjList.add(new LinkedList<Web>());
			}

			for (int i = 0; i < count; i++) {
				
				String[] split2 = scan.readLine().split(" ");

				int origin = Integer.parseInt(split2[0]);
				int destin = Integer.parseInt(split2[1]);
				
				Person person = new Person();
				person.x = origin;
				person.y = destin;
				
				personList.add(person);
			}
			
			for (int i = 0; i < count; i++) {
				Person p1 = personList.get(i);
				for (int j = i + 1; j < count; j++) {
					Person p2 = personList.get(j);
					
					double cost = Math.sqrt(
						Math.pow((p1.x - p2.x),2) + 	
						Math.pow((p1.y - p2.y),2));
					
					Web web = new Web();
					web.origin = i;
					web.destin = j;
					web.cost = cost;
					queue.add(web);
				}
			}
			
			while (count-- > 0) {

				checks[index] = true;
				LinkedList<Web> currentWeb = adjList.get(index);

				for (int i = 0; i < currentWeb.size(); i++) {
					queue.add(currentWeb.get(i));
				}
				Web web;
				while (true) {
					web = queue.poll();

					if (web == null)
						break;

					if (!checks[web.destin]) {
						totalCost += web.cost;
						index = web.destin;
						break;
					}
				}

			}

			System.out.printf("%.2f\n",(totalCost / 100));

		}
	}

}

class Web implements Comparable<Web> {
	Integer destin;
	Double cost;
	Integer origin;

	@Override
	public int compareTo(Web web2) {
		return cost.compareTo(web2.cost);
	}
}

class Person{
	int x;
	int y;
}
