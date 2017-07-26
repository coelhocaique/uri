package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1254 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String toBeReplaced = scan.readLine();
			if (toBeReplaced == null)
				break;
			String replaceWith = scan.readLine();
			String sentence = scan.readLine();
			boolean isTagOp = false;
			StringBuilder out = new StringBuilder();
			int i = 0;

			while (i < sentence.length()) {
				char c = sentence.charAt(i);
				if (Character.toLowerCase(c) == Character.toLowerCase(toBeReplaced.charAt(0))) {
					boolean isDWor = false;

					if (i + toBeReplaced.length() < sentence.length()) {
						
						for (int j = 0; j < toBeReplaced.length(); j++) {
							if (Character.toLowerCase(toBeReplaced.charAt(j)) == Character
									.toLowerCase(sentence.charAt(i + j))) {
								isDWor = true;
							}else{
								isDWor = false;
							}
						}
					}
					if (isTagOp && isDWor) {
						out.append(replaceWith);
						i += toBeReplaced.length();
					} else {
						out.append(c);
						i++;
					}
				} else {

					if (c == '<')
						isTagOp = true;
					else if (c == '>')
						isTagOp = false;

					out.append(c);
					i++;
				}

			}
			System.out.println(out);
		}
	}
}
