package ex5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] m = new int [3][3];
		int [][] mi = new int [3][3];
		int i;
		int j;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("Digite um valor para a posição [%d, %d]: ", i + 1, j + 1);
				m[i][j] = sc.nextInt();
				mi[j][i] = m[i][j];
			}
		}
		
		System.out.println("\nMatriz:");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\nMatriz invertida:");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(mi[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
