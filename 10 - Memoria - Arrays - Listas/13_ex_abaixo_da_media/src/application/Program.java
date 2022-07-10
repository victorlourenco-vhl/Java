package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int t = sc.nextInt();
		
		double vetor[] = new double[t];
		
		double sum = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
		}
		double media = sum / vetor.length;
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
