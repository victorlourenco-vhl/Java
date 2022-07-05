package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// Formula para calcular a área do triângulo
		double pX = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		double pY = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
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
