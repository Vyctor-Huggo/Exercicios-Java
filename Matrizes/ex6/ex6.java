import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] p = new int[2][5];
		int[][] p1 = new int[2][5];
	    int a = 0;
	    
	    for(var i = 0; i != 2; i++) {
	        
	        String oi = sc.nextLine();
	        String[] valores = oi.split(" ");
	        p[i][0] = Integer.parseInt(valores[0]);
	        p[i][1] = Integer.parseInt(valores[1]);
	        p[i][2] = Integer.parseInt(valores[2]);
	        p[i][3] = Integer.parseInt(valores[3]);
	        p[i][4] = Integer.parseInt(valores[4]);
	    }

		for(var i = 0; i != 2; i++) {
	        
	        String oi = sc.nextLine();
	        String[] valores = oi.split(" ");
	        p1[i][0] = Integer.parseInt(valores[0]);
	        p1[i][1] = Integer.parseInt(valores[1]);
	        p1[i][2] = Integer.parseInt(valores[2]);
	        p1[i][3] = Integer.parseInt(valores[3]);
	        p1[i][4] = Integer.parseInt(valores[4]);

			p[i][0] += p1[i][0];
			p[i][1] += p1[i][1];
			p[i][2] += p1[i][2];
			p[i][3] += p1[i][3];
			p[i][4] += p1[i][4];
	    }
	    System.out.print("matriz[1]: ");
	    for(int i:p[0]) {
	        System.out.print(i + " ");
	    }
	    System.out.print("matriz[2]: ");
	    for(int i:p[1]) {
	        System.out.print(i + " ");
	    }
	}
}
