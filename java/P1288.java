import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1288 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(scan.readLine());
		
		while (count-- > 0) {
			
			int n = Integer.parseInt(scan.readLine());
			
			int[] w = new int[n];
			int[] val = new int[n];
			
			for (int i = 0; i < n; i++) {
				String[] split = scan.readLine().split(" ");
				w[i] = Integer.parseInt(split[1]);
				val[i] = Integer.parseInt(split[0]);				
			}
			
			int limit = Integer.parseInt(scan.readLine());
			int totalResistance = Integer.parseInt(scan.readLine());
			
			int totalDamage = knapsack(n, limit, w, val);
			
			if(totalDamage >=  totalResistance){
				System.out.println("Missao completada com sucesso");
			}else{
				System.out.println("Falha na missao");
			}			
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
 
