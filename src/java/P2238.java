package maratona_regional_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2238 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] array = scan.readLine().split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		int d = Integer.parseInt(array[3]);
		
		long index = (long)Math.sqrt(a * c);
	
		int res = -1;
		for (int i = 2; i <= index; i++) {
			if(i % a == 0 && c % i == 0
			  && i % b != 0 && d % i != 0) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		//2 3 999999966 999999966
		//7 2 42 35
	}

}
