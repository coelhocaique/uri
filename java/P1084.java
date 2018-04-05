import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1084 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			
			String[] split = scan.readLine().split(" ");
			int n = Integer.parseInt(split[0]);
			int d = Integer.parseInt(split[1]);
			
			if(n == 0 && d == 0) break;
			
			Stack<Integer> dQueue = new Stack<>();
			int removedNums = 0;
			String number = scan.readLine();
			
			for (int i = 0; i < n; i++) {
				int num = number.charAt(i) - '0';
				
				while(dQueue.size() > 0 && num > dQueue.peek() && removedNums < d){
					dQueue.pop();
					removedNums++;
				}
				
				dQueue.push(num);
			}
			
			while(removedNums++ < d){
				dQueue.pop();
			}
			
			for (int i = 0; i < dQueue.size(); i++) {
				System.out.print(dQueue.elementAt(i));
			}		
			System.out.println();			
		}	
	}
}
