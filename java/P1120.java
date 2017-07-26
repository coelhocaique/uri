package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1120 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String[] input = scan.readLine().split(" ");

			char defeito = input[0].charAt(0);
			if(defeito == '0' && input[1].equals("0"))
				break;

			String finalValue = "";

			for (int i = 0; i < input[1].length(); i++) {
				if (input[1].charAt(i) != defeito) {
					finalValue += input[1].charAt(i);
				}
			}
			
			if(finalValue.length() == 0){
				finalValue = "0";
			}
				
			BigInteger saida = new BigInteger(finalValue);
			System.out.println(saida);

			
		}

	}

}
