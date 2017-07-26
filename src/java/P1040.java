package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P1040 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] ent = scan.readLine().split(" ");

		float nota1 = Float.parseFloat(ent[0]) * 2;
		float nota2 = Float.parseFloat(ent[1]) * 3;
		float nota3 = Float.parseFloat(ent[2]) * 4;
		float nota4 = Float.parseFloat(ent[3]);
		DecimalFormat dec = new DecimalFormat("0.0");

		float media = (nota1 + nota2 + nota3  + nota4) /10;
		
		if (media < 5) {
			System.out.println("Media: " + dec.format(media));
			System.out.println("Aluno reprovado.");
		} else if (media >= 7) {
			System.out.println("Media: " + dec.format(media));
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Media: " + dec.format(media));
			System.out.println("Aluno em exame.");

			float notaExame = Float.parseFloat(scan.readLine());
			System.out.println("Nota do exame: " + notaExame);

			float mediaFinal = (float) (notaExame + media) / 2;

			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}

			System.out.println("Media final: " + dec.format(mediaFinal));

		}

	}
}
