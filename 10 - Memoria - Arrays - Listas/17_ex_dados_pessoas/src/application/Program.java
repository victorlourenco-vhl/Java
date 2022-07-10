package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person pessoa[] = new Person[n];
		
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double sumAlturasM = 0.0;
		int countMulheres = 0;
		int countHomens = 0;
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura %d° pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero %d° pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			
			pessoa[i] = new Person(altura, genero);
			
			
			
			if(i == 0) {
				menorAltura = pessoa[i].getAltura();
				maiorAltura = pessoa[i].getAltura();
			}else {
				if(pessoa[i].getAltura() < menorAltura) {
					menorAltura = pessoa[i].getAltura();
				}
				if(pessoa[i].getAltura() > maiorAltura) {
					maiorAltura = pessoa[i].getAltura();
				}
			}
			
			if(genero == 'M') {
				countHomens += 1;
			}else {
				countMulheres += 1;
				sumAlturasM += pessoa[i].getAltura();
			}
		}
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Menor altura: " + maiorAltura);
		System.out.printf("Média das alturas da mulheres: %.2f\n", sumAlturasM / countMulheres);
		System.out.println("Número de homens = " + countHomens);
		sc.close();

	}

}
