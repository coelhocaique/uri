import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1645 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String[] split = scan.readLine().split(" ");
			
			int n = Integer.parseInt(split[0]);
			int k = Integer.parseInt(split[1]);
			
			if(n == 0 && k == 0) break;
			
			long[] p = new long[n];
			String[] arr = scan.readLine().split(" ");
			
			for (int i = 0; i < p.length; i++) {
				p[i] = Long.parseLong(arr[i]);
			}
			
			System.out.println(maxNumOfSeqSizeK(p,n,k));
		}
	}

	private static long maxNumOfSeqSizeK(long[] p, int n, int k) {
		long[][] dp = new long[k][n];
		long sum = 0;
		
		for (int i = 0; i < n; i++) dp[0][i] = 1;
		
		for (int i = 1; i < k; i++) {
			for (int j = i; j < n; j++) {
				for (int l = i - 1; l < j; l++) {
					if(p[l] < p[j])
						dp[i][j] += dp[i - 1][l]; 
				}
			}
		}
		
		for (int i = k - 1; i < n; i++) {
			sum+= dp[k - 1][i];
		}
		
		return sum;
	}
}
