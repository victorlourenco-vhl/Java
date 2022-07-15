package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int matriz[][] = new int[l][c];
		
		for(int i = 0; i < l; i++ ) {
			for(int j = 0; j < c; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for(int i = 0; i < l; i++ ) {
			for(int j = 0; j < c; j++) {
				if(matriz[i][j] == num) {
					
					System.out.println("Posion "+ i + "," + j);
					if(j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if(j + 1 < c) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if(i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if(i + 1 < l) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
				
			}
		}
		
		
		sc.close();
	}

}
