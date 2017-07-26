package maratona_regional_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2234 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		Double a = Double.parseDouble(split[0]);
		Double b = Double.parseDouble(split[1]);
		
		System.out.printf("%.2f\n",(a/b));
	}

}
