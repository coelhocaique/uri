package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1234 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String inp = scan.readLine();
			if(inp == null)
				break;

			char[] letters = new char[inp.length()];

			for (int i = 0; i < letters.length; i++) {
				letters[i] = inp.charAt(i);
			}

			boolean lastUp = false;
			StringBuilder dancer = new StringBuilder();
			for (int i = 0; i < letters.length; i++) {
				if ((int)letters[i] != 32) {
					if (lastUp) {
						dancer.append(letters[i]);
						lastUp = false;
					}else{
						dancer.append(Character.toUpperCase(letters[i]));
						lastUp = true;
					}
				}else{
					dancer.append(letters[i]);
				}
			}
			System.out.printf("%s\n",dancer);
		}
	}
}
