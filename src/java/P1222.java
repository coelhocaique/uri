package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1222 {
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));


		while (true) {
			
			String inp = scan.readLine();
			
			if(inp == null)
				break;
			
			String[] word = scan.readLine().split(" ");
			
			String[] aux = inp.split(" ");
			int linesPerPage = Integer.parseInt(aux[1]);
			int charPerLine = Integer.parseInt(aux[2]);
			
			int wordsPerPage = linesPerPage * charPerLine,
				wordLength = word.length,output = 0; 
			
		
			System.out.println(output);
		}
	}
}