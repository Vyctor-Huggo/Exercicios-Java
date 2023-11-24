/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[][] p = new int[5][5];
	    int a = 0;
	    
	    for(var i = 0; i != 5; i++) {
	        
	        String oi = sc.nextLine();
	        String[] valores = oi.split("\\s");
	        p[i][0] = Integer.parseInt(valores[0]);
	        p[i][1] = Integer.parseInt(valores[1]);
	        p[i][2] = Integer.parseInt(valores[2]);
	        p[i][3] = Integer.parseInt(valores[3]);
	        p[i][4] = Integer.parseInt(valores[4]);
	    }
	    
	    for(var i = 0; i != 5; i++) {
	        for(var j = 0; j != 5; j++) {
	            if((p[j][i] % 2) == 0) {
	                a++;
	            }
	        }
	    }
	    System.out.println("Temos " + a + " pares na matriz");
	}
}
