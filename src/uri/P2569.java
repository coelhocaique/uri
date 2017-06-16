package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2569 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		int d = Integer.parseInt(split[0].replace('7', '0'));
		char op = split[1].toLowerCase().charAt(0);
		int x = Integer.parseInt(split[2].replace('7', '0'));
		
		Integer totalValue = 0;
		
		switch (op) {
		case '+':
			totalValue = d + x;
			break;
		case 'x':
			totalValue = d * x;
			break;
		}
		
		
		System.out.println(Integer.parseInt(totalValue.toString().replace('7', '0')));

	}

}
