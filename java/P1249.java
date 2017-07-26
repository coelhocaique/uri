package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1249 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		char[] alphabet = new char[26];
		int index = 0;
		for (int i = 97; i < (97 + alphabet.length); i++) {
			alphabet[index] = (char) i;
			index++;
		}

		while (true) {
			String message = scan.readLine();
			
			if(message == null)
				break;
			
			StringBuilder encrypted = new StringBuilder();
			for (int i = 0; i < message.length(); i++) {
				boolean isUp = false;
				char character = message.charAt(i);
				int indexOfChar = 0;
				
				if (Character.isLetter(character)) {
					if (Character.isUpperCase(character)) {
						character = Character.toLowerCase(character);
						isUp = true;
					}
					
					for (int j = 0; j < alphabet.length; j++) {
						if (character == alphabet[j]) {
							indexOfChar = j + 13;
							break;
						}
					}
					
					if(isUp){
						character = Character.toUpperCase(alphabet[indexOfChar % alphabet.length]);
					}else{
						character = alphabet[indexOfChar % alphabet.length];
					}	
					
					encrypted.append(character);
				} else {
					encrypted.append(character);
				}
			}

			System.out.println(encrypted);
		}
	}
}
