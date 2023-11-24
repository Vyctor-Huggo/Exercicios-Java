package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int	[][] m = new int [5][2];
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.printf("Digite um valor para a posição [%d, %d]: ", i + 1, j + 1);
				m[i][j] = sc.nextInt();
				
				soma += m[i][j];
				
			}
		}
		
		System.out.println("\nA média desses números é igual a " + soma/10);
		

	}

}
