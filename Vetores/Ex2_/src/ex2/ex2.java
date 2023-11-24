package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v[] = new int [15];
		String po = "";
		
		
		for (int i = 0; i < 15; i++) {
			System.out.print("Digite um valor para adicionar no vetor: ");
			v[i] = sc.nextInt();
			
			if (v[i] > 0) {
				po += v[i] + " ";
			}
		}
		
		System.out.println("\nEsses são os números positivos presente nesse vetor: " + po);

	}

}
