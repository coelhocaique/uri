package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1026 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			String inp = scan.readLine();
			
			if(inp == null)
				break;
			
			String[] arr = inp.split(" ");
			
			String n1 = Integer.toBinaryString(Integer.parseInt(arr[0]));
			String n2 = Integer.toBinaryString(Integer.parseInt(arr[1]));
			
			int[] bits = new int[32];
			
//			for (int i = 0; i < bits.length; i++) {
//				
//			}
			
			
			System.out.println(n1);
			System.out.println(n2);
			
		}

	}
}
