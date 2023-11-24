package ex3_;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v[] = new int [8];
		int num;
		int i;
		boolean verif = false;
		
		for (i = 0; i < 8; i++) {
			System.out.print("Digite um valor para adicionar no vetor: ");
			v[i] = sc.nextInt();		
		}

		
		System.out.print("\nQual valor deseja encontrar no vetor? : ");
		num = sc.nextInt();
		System.out.printf("O valor %d ", num);
		
		for (i = 0; i < 8; i++) {
			if (v[i] == num) {
				System.out.printf("se encontra na posição %d do vetor.", i);
				verif = true;
			}
		}
		
		if (verif == false) {
			System.out.println("não se encontra no vetor.");
		}
		
	}

}
