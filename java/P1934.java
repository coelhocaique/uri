package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1934 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		// while (true) {

		String[] vecSize = scan.readLine().split(" ");

		int columns = Integer.parseInt(vecSize[0]);
		int rows = Integer.parseInt(vecSize[1]);

		int index = rows + 1;

		while (index-- > 0) {
			String[] col = scan.readLine().split(" ");
			boolean isSame = true;
			for (int i = 1; i < col.length; i++) {

				if (isSame) {
					if (col[i].equals(col[i - 1])) {

					}
				}
				
			}

		}

		// }

	}

}
