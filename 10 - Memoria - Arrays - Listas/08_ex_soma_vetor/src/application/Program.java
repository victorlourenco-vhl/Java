package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto números você vai digitar? ");
		int tamanho = sc.nextInt();
		
		double numeros[] = new double[tamanho];
		
		double sum = 0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
		}
		System.out.print("VALORES = ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			System.out.print(" ");
		}
		System.out.printf("\nSOMA = %.2f", sum);
		System.out.printf("\nMEDIA = %.2f", sum/numeros.length);
		
		sc.close();

	}

}
