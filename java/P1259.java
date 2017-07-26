package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1259 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(bf.readLine());
		List<Integer> pair = new ArrayList<>();
		List<Integer> notPair = new ArrayList<>();
		
		while(loop-- > 0){
			int inp = Integer.parseInt(bf.readLine());
			
			if(inp % 2 == 0){
				pair.add(inp);
			}else{
				notPair.add(inp);
			}
		}
		
		Collections.sort(pair);
		Collections.sort(notPair,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		for (Integer integer : pair) {
			System.out.println(integer);
		}
		for (int i = 0; i < notPair.size(); i++) {
			System.out.println(notPair.get(i));
		}
	}

}
