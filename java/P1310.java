import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1310 {
 
    public static void main(String[] args) throws IOException {
 
       BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String read = scan.readLine();
			
			if(read == null) break;
			
			int n = Integer.parseInt(read);

			int cost = Integer.parseInt(scan.readLine());

			int[] costs = new int[n];

			for (int i = 0; i < n; i++) {
				costs[i] = Integer.parseInt(scan.readLine());
			}

			int[] dp = new int[n];

			for (int i = 0; i < costs.length; i++) {
				int sum = costs[i];
				int count = 1;
				dp[count - 1] = Math.max(dp[count - 1], sum - (count * cost));

				for (int j = i + 1; j < costs.length; j++) {
					count++;
					sum += costs[j];
					dp[count - 1] = Math.max(dp[count - 1], sum - (count * cost));
				}
			}

			int maxSum = 0;
			for (int i = 0; i < dp.length; i++) {
				maxSum = dp[i] > maxSum ? dp[i] : maxSum;
			}

			System.out.println(maxSum);
		}
 
    }
 
}
