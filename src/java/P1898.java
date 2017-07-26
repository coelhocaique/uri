package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class P1898 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder line1 = new StringBuilder(scan.readLine().replaceAll("[^0-9 \\. ]", ""));
		StringBuilder line2 = new StringBuilder(scan.readLine().replaceAll("[^0-9 \\. ]", ""));
		
		StringBuilder cpf = new StringBuilder();
		for (int i = 0; i <= 10; i++) {
			cpf.append(line1.charAt(i));
			line1.setCharAt(i, ' ');
		}
		
		String aux = line1.toString();
		BigDecimal bd = new BigDecimal(aux.trim()).setScale(2, 1);
		BigDecimal bd2 = new BigDecimal(line2.toString()).setScale(2, 1);
			
		System.out.println("cpf " + cpf);
		System.out.println(bd.add(bd2));
	}

}
