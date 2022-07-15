package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int matriz[][] = new int[n][n];
		
		int negativos = 0;
		for(int l = 0; l < n; l++) {
			for(int c = 0; c < n; c++) {
				int numero = sc.nextInt();
				matriz[l][c] = numero;
				if (numero < 0) {
					negativos ++;
				}
			}
		}
		
		for(int l = 0; l < n; l++) {
			for(int c = 0; c < n; c++) {
			
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Diagonal principal: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
			
		}
		
		System.out.println("\nNúmero de negativos: " + negativos);
		
		sc.close();
		
	}

}
