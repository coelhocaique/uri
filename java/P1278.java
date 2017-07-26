package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1278 {
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(scan.readLine());

		while (loop != 0) {
			int greater = 0;
			ArrayList<String> names = new ArrayList<String>();
			StringBuilder output = new StringBuilder();

			while (loop-- > 0) {

				String[] input = scan.readLine().trim().split("[ ]+");
				StringBuilder st = new StringBuilder();
				for (int i = 0; i < input.length; i++) {
					st.append(input[i]);
					if(i < input.length - 1)
						st.append(" ");
				}
				names.add(String.valueOf(st));
			}

			for (int i = 0; i < names.size(); i++) {
				if (greater < names.get(i).length()) {
					greater = names.get(i).length();
				}
			}
			
			for (int i = 0; i < names.size(); i++) {
				String aux = names.get(i);

				for (int j = 0; j < (greater - aux.length()); j++) {
					output.append(' ');
				}

				output.append(aux);
				System.out.println(output);
				output = new StringBuilder();
			}
			loop = Integer.parseInt(scan.readLine());
			if(loop != 0){
				System.out.println();
			}
		}
	}
}