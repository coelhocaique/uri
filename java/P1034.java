import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(scan.readLine());
		while(loop-- > 0){
			String[] split = scan.readLine().split(" ");
			int n = Integer.parseInt(split[0]);
			int m = Integer.parseInt(split[1]);
			String[] split2 = scan.readLine().split(" ");
			int[] vals = new int[n];
			for (int j = 0; j < split2.length; j++) {
				vals[j] = Integer.parseInt(split2[j]);
			}
			Arrays.sort(vals);
			
			System.out.println(calculate(vals, n, m));
		}
	}
	static int calculate(int valores[], int n, int m){
		int i, j, k;
	    
	    if(m%valores[n-1] == 0) 
	    	return m/valores[n-1];
	    
	    int[] pd = new int[m + 1];
	    pd[0] = 0;
	    for(i=0; i < n; i++){
	        k = valores[i];
	        for(j = k; j <= m; j++){
	        	if(pd[j] == 0) pd[j] = 999999999;
	             pd[j] = Integer.min(pd[j], pd[j-k]+1);
	        }
	    }
	    return pd[m];
	}
}
