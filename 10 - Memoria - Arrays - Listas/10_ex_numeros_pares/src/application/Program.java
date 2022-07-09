package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n = sc.nextInt();
		
		int numeros[] = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um n�mero: ");
			numeros[i] = sc.nextInt();
		}
		int sum = 0;
		System.out.println("N�MEROS PARES: ");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				sum += 1;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + sum);
		
		sc.close();

	}

}
