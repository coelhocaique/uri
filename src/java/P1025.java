package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class P1025 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inp = bf.readLine().split(" ");
		int cas = 1;
		while(!inp[0].equals("0") && !inp[1].equals("0")){
			List<Integer> list = new ArrayList<Integer>();
			int j = 0;
			while(j++ < Integer.parseInt(inp[0])){
				list.add(Integer.parseInt(bf.readLine()));
			}
			
			Collections.sort(list);
			j=0;
			StringBuilder output = new StringBuilder();
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 0; i < list.size(); i++) {
				if(!hm.containsKey(list.get(i))){
					hm.put(list.get(i), i+1);
				}
			}
			while(j < Integer.parseInt(inp[1])){
				int marble = Integer.parseInt(bf.readLine());
				if(hm.containsKey(marble)){
					output.append(marble + " found at " + hm.get(marble));
				}else{
					output.append(marble + " not found");
				}
				
				if (++j < Integer.parseInt(inp[1])) output.append("\n");
				
			}
		
			System.out.println("CASE# " + cas + ":");
			System.out.println(output);
			inp = bf.readLine().split(" ");
			cas++;
		}
		
		
	}

}
