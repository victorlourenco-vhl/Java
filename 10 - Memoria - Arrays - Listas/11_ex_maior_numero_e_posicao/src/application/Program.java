package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int t = sc.nextInt();
		
		double numeros[] = new double[t];
		
		int pos = 0;
		double maior = 0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			if(i == 0) {
				pos = i;
				maior = numeros[i];
			}
			if(numeros[i] > maior) {
				pos = i;
				maior = numeros[i];
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+ pos);
		
		sc.close();

	}

}
