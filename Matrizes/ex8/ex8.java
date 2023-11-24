import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] p = new int[5][5];
	    int a = 0;
	    boolean isTS = true;
		int[] is0 = new int[5];
		int[] template = {0, 1, 2, 3, 4};
	    
	    for(var i = 0; i != 5; i++) {
	        
	        String oi = sc.nextLine();
	        String[] valores = oi.split("\\s");
	        p[i][0] = Integer.parseInt(valores[0]);
	        p[i][1] = Integer.parseInt(valores[1]);
	        p[i][2] = Integer.parseInt(valores[2]);
	        p[i][3] = Integer.parseInt(valores[3]);
	        p[i][4] = Integer.parseInt(valores[4]);
	    }
	    
	    for(int i = 0; i != 5; i++) {
			for(int j = 0; j != 5; j++) {
			    if(p[i][j] == 0) {
			        a++;
			    }
			}
		    is0[i] = a;
		    if(is0[i] == template[i]) {
		        a = 0;
		    } else {
		        System.out.println("tá errado mano");
		        isTS = false;
		        break;
		    }
		}
		if(isTI) {
		   System.out.println("tudo certo"); 
		}
	}
}