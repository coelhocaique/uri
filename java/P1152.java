package graphos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			ArrayList<LinkedList<No>> listaAdjacente = new ArrayList<>();

			String entrada = scan.readLine();

			if (entrada.equals("0 0"))
				break;

			String[] split = entrada.split(" ");
			int custoTotal = 0, custoEconomia = 0;

			int vertices = Integer.parseInt(split[0]);
			int entradas = Integer.parseInt(split[1]);

			boolean[] checados = new boolean[vertices];

			for (int i = 0; i < vertices; i++) {
				listaAdjacente.add(new LinkedList<No>());
			}

			while (entradas-- > 0) {
				String[] split2 = scan.readLine().split(" ");

				int origem = Integer.parseInt(split2[0]);
				int destino = Integer.parseInt(split2[1]);
				int custo = Integer.parseInt(split2[2]);

				custoTotal += custo;

				No no = new No();
				no.custo = custo;
				no.destino = destino;

				No no1 = new No();
				no1.custo = custo;
				no1.destino = origem;

				listaAdjacente.get(origem).add(no);
				listaAdjacente.get(destino).add(no1);
			}

			PriorityQueue<No> pq = new PriorityQueue<>();

			int index = 0;

			while (vertices-- > 0) {

				checados[index] = true;
				LinkedList<No> noDaVez = listaAdjacente.get(index);

				for (int i = 0; i < noDaVez.size(); i++) {
					pq.add(noDaVez.get(i));
				}
				No no;
				while (true) {
					no = pq.poll();
					
					if(no == null)
						break;
					
					if (!checados[no.destino]) {
						custoEconomia += no.custo;
						index = no.destino;
						break;
					}
				}

			}

			System.out.println(custoTotal - custoEconomia);
		}

	}

}

class No implements Comparable<No> {
	Integer destino;
	Integer custo;

	@Override
	public int compareTo(No o) {
		// TODO Auto-generated method stub
		return custo.compareTo(o.custo);
	}

}
