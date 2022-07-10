package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quanto valores vai ter cada vetor? ");
		int t = sc.nextInt();
		
		int vetorA[] = new int[t];
		int vetorB[] = new int[t];
		int vetorFinal[] = new int[t];
//		int vetorB[] = new int[t];
		
		System.out.println("Digite os valores do vetorA: ");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetorB: ");
		for(int i = 0; i < vetorB.length; i++) {
			
			vetorB[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vetorFinal.length; i++) {
			vetorFinal[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorFinal[i]);
		}
		
		sc.close();
	}
}
