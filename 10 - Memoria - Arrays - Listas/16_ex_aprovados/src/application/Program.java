package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Student alunos[] = new Student[n];
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %d° aluno: \n", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
		
			
			alunos[i] = new Student(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i].media() >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();

	}

}
