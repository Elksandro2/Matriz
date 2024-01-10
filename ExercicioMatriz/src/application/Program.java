package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número que será a relação NxN na matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		System.out.printf("\nFaça a matriz %dx%d:%n", n, n);
		for (int i=0; i<matriz.length; i++) {
			for (int c=0; c<matriz[i].length; c++) {
				matriz[i][c] = sc.nextInt();
			}
		}
		
		System.out.println("\nMain diagonal:");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int cont = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int c=0; c<matriz[i].length; c++) {
				if (matriz[i][c] < 0) {
					cont++;
				}
			}
		}
		System.out.println("\nNegative numbers = " + cont);
		
		sc.close();

	}

}
