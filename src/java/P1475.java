package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1475 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String br = scan.readLine();

			if (br == null)
				break;

			String[] values = br.split(" ");

			int furos = Integer.parseInt(values[0]);
			int tamPneu = Integer.parseInt(values[1]);
			int rem1 = Integer.parseInt(values[2]);
			int rem2 = Integer.parseInt(values[3]);
			int cam1 = rem1, cam2 = rem2, y1 = rem1, y2 = rem2, m1 = 0;

			String[] lugares = scan.readLine().split(" ");

			for (int i = 1; i < lugares.length; i++) {
				int r = Integer.parseInt(lugares[i]) - Integer.parseInt(lugares[i - 1]);
				y1 -= r;
				y2 -= r;

				if (y1 < 0 && y2 < 0) {
					m1 = cam1 > cam2 ? cam2 : cam1;
					cam1 = m1 + rem1;
					cam2 = m1 + rem2;
					y1 = rem1;
					y2 = rem2;
				} else if (y1 < 0) {
					cam1 += rem1;
					y1 = rem1;
				} else if (y2 < 0) {
					cam2 += rem2;
					y2 = rem2;
				}
			}
			m1 = cam1 > cam2 ? cam2 : cam1;

			System.out.println(m1);
		}

	}

}
