package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String lastBiggest = "";
		
 		while(true){
			
			String read = scan.readLine();
			
			if(read.equals("0")){
				System.out.println();
				System.out.println("The biggest word: "+lastBiggest);
				break;
			}
			
			String[] array = read.split(" ");
			
			for (int i = 0; i < array.length; i++) {
				if(i == array.length - 1)
					System.out.print(array[i].length()+ "\n");
				else 
					System.out.print(array[i].length() + "-");
				
				if(lastBiggest.length() <= array[i].length())
					lastBiggest = array[i];
		    }
		}
	}
}
