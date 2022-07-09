package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int tamanho = sc.nextInt();
		
		int numeros[] = new int[tamanho];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			if(numero < 0) {
				System.out.println(numero);
			}
		}
		
		
		sc.close();
	}

}
