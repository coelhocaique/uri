package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2571 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] split = scan.readLine().split(" ");
		double m = Double.parseDouble(split[0]);// initial
		double p = Double.parseDouble(split[1]);// percent
		double j = Double.parseDouble(split[2]);// interest
		double x = Double.parseDouble(split[3]); // needded
		int count = 0;

		while (true) {
			double donated = (m * p) / 100;
			
			m -= (int) donated;
			
			double profit = (m * j) / 100;
			
			if (profit < x)
				break;
			
			count++;
		}

		System.out.println(count);

	}

}
