package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo forma = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		forma.width = sc.nextDouble();
		forma.height = sc.nextDouble();
		System.out.println(forma);

		
		sc.close();
	}

}
