package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1973 {
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		long[] visitedStars = new long[Integer.parseInt(scan.readLine())];
		String[] split = scan.readLine().split(" ");
		long[] stars = new long[split.length];
		long totalSheeps = 0;
		for (int i = 0; i < split.length; i++) {
			stars[i] = Long.parseLong(split[i]);
			totalSheeps+= stars[i];
		}
		
		int i = 0;
		long stolenSheeps = 0;
		while(true){
			
			if(i >= stars.length || i < 0)
				break;
			boolean isEven = stars[i] % 2 == 0;
			if(isEven){
				if(stars[i] > 0){
					stolenSheeps++;
					stars[i]--;
				}
				visitedStars[i] = 1;
				i--;
			}else{
				if(stars[i] > 0){
					stolenSheeps++;
					stars[i]--;
				}
				visitedStars[i] = 1;
				i++;
			}
		}
		long starss = 0;
		for (long j : visitedStars) {
			starss+= j;
		}
		System.out.println(starss + " " + (totalSheeps - stolenSheeps));
	}
}
