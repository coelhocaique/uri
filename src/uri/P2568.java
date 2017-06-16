package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2568 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		int d = Integer.parseInt(split[0]);
		int i = Integer.parseInt(split[1]);
		int x = Integer.parseInt(split[2]);
		int f = Integer.parseInt(split[3]);
		
		int totalValue = i;
		
		for (int j = d + 1 ; j <= (d + f); j++) {	
			if(j % 2 == 0)
				totalValue += x;
			else 
				totalValue -= x;
		}
		
		System.out.println(totalValue);

	}

}
