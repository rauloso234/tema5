package ejercicio1;

import java.util.Scanner;

public class ejer1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String buscaminas[][] = new String[5][5];
		int fila = 0;
		int columna = 0;
		int minas = 0;
		for (int i = 0; i < buscaminas.length; i++) { // pedimos los digitos que se introduciran en la matriz
			for (int j = 0; j < buscaminas[i].length; j++) {
				System.out.printf("introduzca cordenada (%d, %d): ", i, j);
				buscaminas[i][j] = in.next();
			}
		}
		System.out.print("Introduzca la fila a comprobar: ");
		fila = in.nextInt();
		System.out.print("Introduzca la columna a comprobar: ");
		columna = in.nextInt();
		// esquinas
		if (fila == 0) {
			// esquinas superiores
			if (columna == 0) {
				// punto de la izquierda arriba
				if (buscaminas[fila + 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
			}
			if (columna == buscaminas.length - 1) {
				// punto de la derecha arriba
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna - 1].equals("*")) {
					minas++;
				}
			}
		}
		if (fila == buscaminas.length - 1) {
			// esquinas inferiores
			if (columna == 0) {
				// punto inferior izquierdo
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna + 1].equals("*")) {
					minas++;
				}
			}
			if (columna == buscaminas.length - 1) {
				// punto inferior derecho
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna - 1].equals("*")) {
					minas++;
				}
			}
		}
		if (fila == 0) {
			// bordes
			if (columna > 0 && columna < buscaminas.length - 1) {
				// borde de arriba
				if (buscaminas[fila + 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna + 1].equals("*")) {
					minas++;
				}
			}
		}
		if (fila == buscaminas.length - 1) {
			if (columna > 0 && columna < buscaminas.length - 1) {
				// borde abajo
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna - 1].equals("*")) {
					minas++;
				}
			}
		}
		if (fila > 0 && fila < buscaminas.length - 1) {
			if (columna == 0) {
				// borde derecho
				if (buscaminas[fila + 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna + 1].equals("*")) {
					minas++;
				}
			}
		}
		if (fila > 0 && fila < buscaminas.length - 1) {
			if (columna == buscaminas.length - 1) {
				// borde izquierdo
				if (buscaminas[fila + 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna - 1].equals("*")) {
					minas++;
				}
				
			}
		}
		if (fila < buscaminas.length - 1 && fila > 0) {
			if (columna < buscaminas.length - 1 && columna > 0) {
				// centro
				if (buscaminas[fila + 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila + 1][columna - 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna + 1].equals("*")) {
					minas++;
				}
				if (buscaminas[fila - 1][columna - 1].equals("*")) {
					minas++;
				}
			}
		}
		System.out.println(minas);
	}
}
