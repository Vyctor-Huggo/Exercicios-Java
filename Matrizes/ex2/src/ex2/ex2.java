package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] m = new int [3][3];
		int soma = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.printf("Digite um valor para a posição [%d, %d]: ", i + 1, j + 1 );
				m[i][j] = sc.nextInt();
				
			}
		}
		
		
		for (int j = 0; j < 3; j++ ) {
			soma = 0;

			for (int i = 0; i < 3; i++) {
				soma += m[i][j];
			}
			
			System.out.printf("Soma da coluna %d: %d \n", j + 1, soma);
		}
		
	}

}
