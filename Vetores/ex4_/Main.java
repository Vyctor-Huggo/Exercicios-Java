package projeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] v1 = new int[10];
		int[] v2 = new int[10];

		for(var i = 0; i != 10; i++) {
			System.out.println("Digite o valor " + i+1 + " do vetor1: ");
			v1[i] = input.nextInt();
		}
		for(var i = 0; i != 10; i++) {
			System.out.println("Digite o valor " + i+1 + " do veto2: ");
			v2[i] = input.nextInt();

			v1[i] = v1[i] + v2[i];
		}

		for (int i:v1)
		System.out.print(i + " ");
	}

}
