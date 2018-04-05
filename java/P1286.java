import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1286 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(scan.readLine());

			if (n == 0)
				break;

			int limit = Integer.parseInt(scan.readLine());
			int[] weights = new int[n];
			int[] values = new int[n];

			for (int i = 0; i < n; i++) {
				String[] split = scan.readLine().split(" ");
				weights[i] = Integer.parseInt(split[1]);
				values[i] = Integer.parseInt(split[0]);
			}
			
			System.out.println(knapsack(n, limit, weights, values) + " min.");
		}
	}

	private static int knapsack(int numberOfWeights, int capacity, int[] weights, int[] values) {
		int dp[][] = new int[numberOfWeights + 1][capacity + 1];

		for (int i = 1; i <= numberOfWeights; i++) {
			for (int c = 1; c <= capacity; c++) {
				
				// weight fits to current capacity?
				// so it receives the value + (w - weights[i]) in dp matrix
				// or else it receives the value of row above 
				if (weights[i - 1] <= c){ 
					dp[i][c] = Math.max(values[i - 1] + dp[i - 1][c - weights[i - 1]], dp[i - 1][c]);
				}else{
					dp[i][c] = dp[i - 1][c];
				}
			}
		}
		return dp[numberOfWeights][capacity];
	}
}
