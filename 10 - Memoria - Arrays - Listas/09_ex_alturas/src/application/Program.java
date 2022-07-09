package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int nPessoas = sc.nextInt();
		
		Person pessoa[] = new Person[nPessoas];
		
		double sumAltura = 0;
		int contIdade = 0;
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d° pessoa: \n", i+1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			if(idade < 16) {
				contIdade += 1;
			}
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sumAltura += altura;
			pessoa[i] = new Person(name, idade, altura);
		}
		double alturaMedia =  sumAltura/pessoa.length;
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		double porcentagemMenores =  (double) contIdade * 100 / pessoa.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%s\n", porcentagemMenores, "%");
		
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getName());
			}
		}
		
		sc.close();

	}

}
