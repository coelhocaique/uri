package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class P1255 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(scan.readLine());

		while (loop-- > 0) {

			String reader = scan.readLine();
			Set<Character> tree = new TreeSet<Character>();
			StringBuilder st = new StringBuilder();
			int greater = 0;

			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

			for (int i = 0; i < reader.length(); i++) {

				if (Character.isLetter(reader.charAt(i))) {

					Integer value = hm.get(Character.toLowerCase(reader.charAt(i)));

					if (value == null) {
						hm.put(Character.toLowerCase(reader.charAt(i)), 1);
					} else {
						hm.put(Character.toLowerCase(reader.charAt(i)), new Integer(value.intValue()) + 1);
					}
				}
			}

			for (Integer values : hm.values()) {
				if (values > greater) {
					greater = values;
				}
			}

			for (Character key : hm.keySet()) {
				if (hm.get(key) == greater) {
					tree.add(key);
				}
			}

			for (Character character : tree) {
				st.append(character);
			}

			System.out.println(st);
		}
	}
}
