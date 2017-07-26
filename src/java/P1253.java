package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1253 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		char[] alphabet = new char[26];
		int index = 0;
		for (int i = 65; i < (65 + alphabet.length); i++) {
			alphabet[index] = (char) i;
			index++;
		}

		int loop = Integer.parseInt(scan.readLine());

		while (loop-- > 0) {
			
			String inp = scan.readLine();
			int positions = Integer.parseInt(scan.readLine());
			StringBuilder out = new StringBuilder();
			
			for (int i = 0; i < inp.length(); i++) {
				
				for (int j = 0; j < alphabet.length; j++) {
					if(inp.charAt(i) == alphabet[j]){
						index = (1 + j + (25 - positions)) % alphabet.length;
						break;
					}
				}
				out.append(alphabet[index]);
			}
			
			System.out.println(out);
		}
	}
}
