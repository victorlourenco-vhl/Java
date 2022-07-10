package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		Person pessoa[] = new Person[n];
		
		String maisVelho = "";
		int maiorIdade = 0;
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d° pessoa: \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Person(nome, idade);
			
			if(i == 0) {
				maisVelho = pessoa[i].getNome();
				maiorIdade = pessoa[i].getIdade();
			}else {
				if(pessoa[i].getIdade() > maiorIdade) {
					maisVelho = pessoa[i].getNome();
					maiorIdade = pessoa[i].getIdade();
				}
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();

	}

}
