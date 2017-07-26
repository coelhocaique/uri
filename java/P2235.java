package maratona_regional_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2235 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int c = Integer.parseInt(split[2]);

		if (a == b || a == c || b == c) {
			System.out.println("S");
		} else if ((a + b) == c || (a + c) == b || (b + c) == a) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
