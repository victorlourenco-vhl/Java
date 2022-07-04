package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.notaA = sc.nextDouble();
		aluno.notaB = sc.nextDouble();
		aluno.notaC = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();

	}

}
