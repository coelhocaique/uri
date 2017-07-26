package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1024 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(scan.readLine());
		
		while(loop-- > 0){
			
			String input = scan.readLine();
			StringBuilder output = new StringBuilder();
			
			for (int i = 0; i < input.length(); i++) {
				if(Character.isLetter(input.charAt(i))){
					int aux = input.charAt(i) + 3;
					char letter = (char) aux;
					output.append(letter);
				}else{
					output.append(input.charAt(i));
				}
			}
			
			output.reverse();
			for (int i = (output.length()/ 2); i < output.length(); i++) {
					int aux = output.charAt(i) - 1;
					char letter = (char) aux;
					output.setCharAt(i, letter);
			}
			
			System.out.println(output);
			
		}
	}
}
