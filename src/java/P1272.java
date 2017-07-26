package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1272 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());

		while (loop-- > 0) {
			String[] input = scan.readLine().trim().split("[ ]+");
			StringBuilder st = new StringBuilder();

			if (input[0].length() != 0) {
				for (int i = 0; i < input.length; i++) {
					st.append(input[i].charAt(0));
				}

				System.out.println(st);
			}else{
				System.out.println();
			}
		}
	}
}
