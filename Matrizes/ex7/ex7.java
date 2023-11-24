import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] p = new int[5][5];
	    int soma = 0;
	    
	    for(var i = 0; i != 5; i++) {
	        
	        String oi = sc.nextLine();
	        String[] valores = oi.split(" ");
	        p[i][0] = Integer.parseInt(valores[0]);
	        p[i][1] = Integer.parseInt(valores[1]);
	        p[i][2] = Integer.parseInt(valores[2]);
	        p[i][3] = Integer.parseInt(valores[3]);
	        p[i][4] = Integer.parseInt(valores[4]);
	    }

	    for(var i = 0; i != 5; i++) {
			soma += p[i][i];
		}
		System.out.println(soma);
	}
}