package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1277 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(scan.readLine());
		while(loop-- > 0){
			
			int nmb = Integer.parseInt(scan.readLine());
			String[] stu = scan.readLine().split(" ");
			String[] freq = scan.readLine().split(" ");
			
			StringBuilder output = new StringBuilder();
			
			for (int i = 0; i < stu.length; i++) {
				int m=0,p=0;
				double avg;
				
				for (int j = 0; j < freq[i].length(); j++) {
					
					switch(freq[i].charAt(j)){
						
					case 'M':
						m++;
						break;
					case 'P':
						p++;
						break;
					}
					
				}
			
				avg = (double)p / (freq[i].length() - m);
				if(avg < 0.75){
					output.append(stu[i] + " ");
				}
			}
			
			String out = String.valueOf(output);
			System.out.println(out.trim());
		}
	}
}
