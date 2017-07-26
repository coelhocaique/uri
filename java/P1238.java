package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1238 {

	public static void main(String[] args)throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());
		
		while(loop-- > 0){
			
			String[] input = scan.readLine().split(" ");
			
		    int length = Math.max(input[0].length(), input[1].length());
		    
		    StringBuilder word = new StringBuilder(); 
			
		    for (int i = 0; i < length; i++) {
				if(i < input[0].length()){
					word.append(input[0].charAt(i));
				}
				
				if(i < input[1].length()){
					word.append(input[1].charAt(i));
				}
			}
		    
		    System.out.println(word);
			
		}

	}

}
