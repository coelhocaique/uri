import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1244 {
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());
		while(loop-- > 0){
			List<String> list = Arrays.asList(scan.readLine().split(" "));
			Collections.sort(list,new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o2.length() == o1.length() ? 0 :o2.length() > o1.length() ? 1 : -1;
				}
			});
			String output = "";
			for (String string : list) {
				output += string + " ";
			}
			System.out.println(output.trim());
		}

	}
}

