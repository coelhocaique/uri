import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class P2729 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(scan.readLine());
		while (n-- > 0) {
			Set<String> treeSet = new TreeSet<>();
			String[] sp = scan.readLine().split(" ");
			for (String st : sp) {
				treeSet.add(st);
			}
			
			int i = 0;
			for (String string : treeSet) {
				System.out.printf(string);
				if(i < treeSet.size() - 1){
					System.out.printf(" ");
				}
				i++;
			}
			System.out.println();
		}
	}
}
