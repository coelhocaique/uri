package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1257 {

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
			int lines = Integer.parseInt(scan.readLine()), posInp = 0, value = 0;
			while (lines-- > 0) {
				String word = scan.readLine();
				for (int i = 0; i < word.length(); i++) {
					char letter = word.charAt(i);
					
					int j = 0;
					
					while(j < alphabet.length){
						
						if(alphabet[j] == letter)
							break;
						
						j++;
					}
					value+= j + posInp + i;
				}
				
				posInp++;
			}
			
			System.out.println(value);
		}
	}
}
