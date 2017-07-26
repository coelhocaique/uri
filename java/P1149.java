package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1149 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] ent = scan.readLine().split(" ");
		long a = Long.parseLong(ent[0]);
		long n = Long.parseLong(ent[1]);
		if (n <= 0) {
			while (true) {
				n = Long.parseLong(scan.readLine());
				if (n > 0)
					break;
			}
		}

		int soma = 0;
		for (int i = (int)a; i < (a + n); i++) {
			soma += i;
		}

		System.out.println(soma);

	}

}