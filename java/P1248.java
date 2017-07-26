package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class P1248 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());   

		while (loop-- > 0) {

			String food = scan.readLine();
			String inp = scan.readLine();
			String ate = scan.readLine() + inp;
			inp = "";
			Set<Character> out = new TreeSet<Character>();

			for (int i = 0; i < food.length(); i++) {
				out.add(food.charAt(i));
			}

			for (int j = 0; j < food.length(); j++) {

				if (j < ate.length()) {

					if (out.contains(ate.charAt(j))) {
						out.remove(ate.charAt(j));
					} else {
						inp = "CHEATER";
					}
				} 
			}

			if (inp == "" && out.size() > 0){
				for (Character character : out) {
					inp += String.valueOf(character);
				}
			}else if(out.size() == 0 && food.trim().length() > 0 ||
					 food.length() < ate.length()){
				inp = "CHEATER";
			}
			System.out.println(inp);
		}
	}
}
