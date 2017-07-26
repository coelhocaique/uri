package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1332 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());
		while (loop-- > 0) {

			String inp = scan.readLine();
			
			if(inp.length() == 5){
				String three = "three";
				int mist = 0;
				for (int i = 0; i < three.length(); i++) {
					if(inp.charAt(i) != three.charAt(i)){
						mist++;
					}
				}
				
				if(mist <= 1)
					System.out.println("3");
			}else{
				
				String one = "one";
				String two = "two";
				int mist1 = 0, mist2 = 0;
				for (int i = 0; i < one.length(); i++) {
					if(inp.charAt(i) != one.charAt(i)){
						mist1++;
					}
				}
				
				for (int i = 0; i < two.length(); i++) {
					if(inp.charAt(i) != two.charAt(i)){
						mist2++;
					}
				}
				
				if(mist1 <= 1)
					System.out.println("1");
				else if (mist2 <= 1)
					System.out.println("2");
			}
		}
	}
}
