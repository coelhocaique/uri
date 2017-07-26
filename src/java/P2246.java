package sbc_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2246 {

	private static int smallestAreaAux = 0;
	private static int[][] matrix;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		//String[] split = bf.readLine().split(" ");

		//matrix = new int[Integer.parseInt(split[0])][Integer.parseInt(split[1])];
		matrix = new int[200][200];
		int smallestArea = Integer.MAX_VALUE;

		for (int i = 0; i < matrix.length; i++) {
			//String[] split2 = bf.readLine().split(" ");
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = 1;//Integer.parseInt(split2[j]);
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				smallestAreaAux = 0;

				checkMatrix(i, j, matrix[i][j]);

				if (smallestArea > smallestAreaAux && smallestAreaAux > 0) {
					smallestArea = smallestAreaAux;
				}

				System.out.println("SmallestArea : " + smallestArea);
			}
		}

		System.out.println(smallestArea);

	}

	private static void checkMatrix(int i, int j, int value) {
		if (matrix[i][j] == -1) {
			return;
		}
	
			System.out.println("i: " + i + " j: " + j);
			System.out.println("valor: " + matrix[i][j] + "\n");
		matrix[i][j] = -1;
		smallestAreaAux++;

		System.out.println("SmallestAreaAux : " + smallestAreaAux + "\n");
		// direita
		if (j >= 0 && j < matrix[0].length - 1) {
			if (matrix[i][j + 1] == value) {
				checkMatrix(i, j + 1, value);	
			}
		}
		// baixo
		if (i < matrix.length - 1 && i >= 0) {
			if (matrix[i + 1][j] == value) {
				checkMatrix(i + 1, j, value);
			}
		}
		// esquerda
		if (j > 0 && j < matrix[0].length) {
			if (matrix[i][j - 1] == value) {
				checkMatrix(i, j - 1, value);
			}
		}
		// cima
		if (i > 0 && i < matrix.length - 1) {
			if (matrix[i - 1][j] == value) {
				checkMatrix(i - 1, j, value);
			}
		}

	}

}

/*
 * 
 * input				output
 *  			      
3 8							1
3 3 3 1 1 0 0 0
3 1 1 0 2 2 0 1
3 3 3 0 0 2 1 1

3 7							3
1 1 0 2 2 1 1
1 1 0 2 2 1 1
1 1 0 0 3 3 3

3 6							1
2 2 2 2 0 2
2 2 2 0 2 2
2 2 2 2 0 2

*/
