package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int t = sc.nextInt();
		
		int vetor[] = new int[t];
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				sum += vetor[i];
				count += 1;
			}
		}
		
		if(count > 0) {
			double media = sum / count;
			System.out.println("MEDIA PARES = " + media);
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
			
		
		sc.close();

	}

}
