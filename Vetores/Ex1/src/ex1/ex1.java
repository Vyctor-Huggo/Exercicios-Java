package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v[] = new int [10];
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um valor para a adicionar no vetor: ");
			v[i] = sc.nextInt();
			
			soma += v[i];
		}

		System.out.println("\nA soma dos números deste vetor é igual a " + soma);
		
	}

}
