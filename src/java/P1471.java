package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1471 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {

			String br = scan.readLine();
			
			if(br == null)
				break;
			
			String[] b = br.split(" ");
			String[] array = scan.readLine().split(" ");
			
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < array.length; i++) {
				al.add(Integer.parseInt(array[i]));
			}
			StringBuilder st = new StringBuilder();
			
			int index = Integer.parseInt(b[0]);
			
			for (int j = 1; j <= index; j++) {
				if(!al.contains(j)){
					st.append(j + " ");
				}
			}
			
			if(st.length() > 0)
				System.out.println(st);
			else 
				System.out.println("*");
		}

	}

}
