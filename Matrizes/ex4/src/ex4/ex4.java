package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] m = new int [6][3];
		int maior = m[0][0];
		int menor = m[0][0];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite um valor para a posição [%d, %d]: ", i + 1, j + 1);
				m[i][j] = sc.nextInt();
				
				if (i == 0 & j == 0) {
					maior = m[0][0];
					menor = m[0][0];
				}
				
				if (m[i][j] > maior) {	
					maior = m[i][j];
					
				}else if (m[i][j] < menor) {
					menor = m[i][j];
					
				}
			}
		}
		
		System.out.printf("\nO maior número é %d e o menor é %d.", maior, menor);
	}

}
