package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1467 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {

			String br = scan.readLine();
			
			if(br == null)
				break;
			
			String[] array = br.split(" ");
			
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int c = Integer.parseInt(array[2]);
			
			if(a != b && a !=c){
				br = "A";
			}else if(b != a && b != c){
				br = "B";
			}else if(c != b && c != a){
				br = "C";
			}else{
				br = "*";
			}
			
			System.out.println(br);
		}

	}

}
