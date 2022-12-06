package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class ejer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sudoku[][] = new int[3][3];
		int sudoku1[] = new int[9];
		int comprobador = 0;
		int repeticiones = 0;
		for (int i = 0; i < sudoku.length; i++) { // pedimos los digitos que se introduciran en la matriz
			for (int j = 0; j < sudoku[i].length; j++) {
				System.out.printf("introduzca cordenada (%d, %d): ", i + 1, j + 1);
				sudoku[i][j] = in.nextInt();
			}
		}
		for (int i = 0, contador = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) { // metemos todos los numeros en un array unidimensional
				sudoku1[contador] = sudoku[i][j];
				contador++;
			}
		}
		Arrays.sort(sudoku1);
		comprobador = sudoku1[0];
		for (int i = 1; i < sudoku1.length; i++) { // comprueba que el array de una dimension creado anteriormente
			if (sudoku1[i] == comprobador)
				repeticiones++;
			comprobador = sudoku1[i];
		}
		if (repeticiones == 0) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
