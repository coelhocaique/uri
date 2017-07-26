package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1263 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String input = scan.readLine();

			if (input == null) {
				break;
			}

			String[] words = input.split(" ");
			int ali = 0, index = 0;
			char lastChar = '?';
			while (index < words.length - 1) {
				char firstLetter = Character.toLowerCase(words[index].charAt(0));
				char secLetter = Character.toLowerCase(words[index + 1].charAt(0));
				
				if(firstLetter == secLetter && firstLetter != lastChar){
					ali++;
				}
				index ++;
				lastChar = firstLetter;
			}
			System.out.println(ali);
		}
	}
}
