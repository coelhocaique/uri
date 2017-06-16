package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2570 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		int k = Integer.parseInt(split[2]);

		char[][] matrix = new char[n][m];

		char[] rhcp = { 'R', 'H', 'C', 'P' };
		int[] count = new int[4];
		
		
		for (int i = 0; i < k; i++) {

			int pos = i % rhcp.length;

			split = scan.readLine().split(" ");
			char c = split[0].charAt(0);
			int xy = Integer.parseInt(split[1]);

			switch (c) {
			case 'L':
								
				break;
			case 'C':
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][xy - 1] = rhcp[pos];
				}
				break;
			}
		}

		for (char[] row : matrix) {
			for (char value : row) {
				switch (value) {
				case 'R':
					count[0]++; 
					break;
				case 'H':
					count[1]++; 
					break;
				case 'C':
					count[2]++; 
					break;
				case 'P':
					count[3]++; 
					break;
				}
				System.out.print(value + " ");
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < rhcp.length; i++) {
			if(i < rhcp.length - 1)
				System.out.print("" + rhcp[i] + count[i] + " ");
			else
				System.out.println("" + rhcp[i] + count[i]);
		}

	}

}
