package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1367 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {

			int n = Integer.parseInt(scan.readLine());

			if (n == 0)
				break;
			
			int correct = 0, sumTime= 0;
			
			String[][] matrix  = new String[n][3];
			ArrayList<Character> wasCorrect = new ArrayList<Character>();
			
			while(n-- > 0){
				String[] inp = scan.readLine().split(" ");
				
				matrix[n][0] = inp[0];
				matrix[n][1] = inp[1];
				matrix[n][2] = inp[2];
			}
			
			
			for (int i = 0; i < matrix.length; i++) {
				char letter = matrix[i][0].charAt(0);
				int time = Integer.parseInt(matrix[i][1]);
				String ans = matrix[i][2];
				
				if(ans.equalsIgnoreCase("correct") ){
					wasCorrect.add(letter);
					sumTime+=time;
					correct++;
				}else if(ans.equalsIgnoreCase("incorrect") && (wasCorrect.contains(letter))){
					sumTime+=20;
				}
			}
			
			System.out.println(correct + " " + sumTime);
		}

	}

}
