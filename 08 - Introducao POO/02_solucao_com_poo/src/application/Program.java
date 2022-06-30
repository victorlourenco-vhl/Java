package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Formula para calcular a área do triângulo
		double areaX = x.area();
		double areaY = y.area();  
		
		System.out.printf("Area triangle X: %.3f\n", areaX);
		System.out.printf("Area triangle Y: %.3f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}
