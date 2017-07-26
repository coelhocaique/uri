package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1568 {
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			
			String inp = scan.readLine();
			
			if(inp == null)
				break;
			
			long number = Long.parseLong(inp);
			double calc = (-1 + Math.sqrt(1 + (8 * number)))/2;
			int out = 0;
			int n = (int) calc + 1;
						
			for (int i =1; i <=n;i++){
				long restoValido = 0L;
				if(i % 2 == 0){
					restoValido = i/2L;
				}
				if(number % i == restoValido){
					out++;
				}		
			}
			System.out.println(out);
		}
	}
}