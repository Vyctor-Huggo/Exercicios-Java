import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		int[] v1 = new int[20];
        int pares = 0;
        int impar = 0;
        int ma50 = 0;
        int me7 = 0;


        for(var i = 0; i != 20; i++) {
			System.out.println("Digite o valor " + i+1 + " do vetor: ");
			v1[i] = input.nextInt();
		}

        for(int i:v1) {
            if(i % 2 == 0) {
                pares++;
            } else {
                impar++;
            }
            if(i > 50) {
                ma50++;
            }
            if(i < 7) {
                me7++;
            }
        }
        System.out.println("Pares: " + pares + " Impares: " + impar + " Maiores que 50: " + ma50 + " Menores de 7: " + me7);
    }
}
