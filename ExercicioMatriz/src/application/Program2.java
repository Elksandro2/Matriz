package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=".repeat(30)+"MATRIZ"+"=".repeat(30));
		System.out.print("Quantidade de linhas: ");
		int linha = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		int coluna = sc.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		System.out.println("\nInsira os elementos da matriz:");
		for (int i=0; i<matriz.length; i++) {
			for (int c=0; c<matriz[i].length; c++) {
				matriz[i][c] = sc.nextInt();
			}
		}
		
		System.out.print("\nEscolha um número para obter informações: ");
		int num = sc.nextInt();
		int cont = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int c=0; c<matriz[i].length; c++) {
				if (matriz[i][c] == num) {
					cont ++;
					System.out.printf("Position %d,%d:%n", i, c);
					
					if (c > 0) {
						System.out.printf("Left: %d%n", matriz[i][c-1]);
					}
					if (c < (matriz[i].length - 1)) {
						System.out.printf("Right: %d%n", matriz[i][c+1]);
					}
					if (i > 0) {
						System.out.printf("Up: %d%n", matriz[i-1][c]);
					}
					if (i < (matriz.length - 1)) {
						System.out.printf("Down: %d%n", matriz[i+1][c]);
					}
					
				}
			}
		}
		if (cont == 0) {
			System.out.println("Número não encontrado na matriz!");
		}
		sc.close();
		
	}

}
