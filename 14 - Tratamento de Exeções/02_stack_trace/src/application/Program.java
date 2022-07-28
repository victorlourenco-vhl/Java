package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		metodo1();
		System.out.println("End program!");
	}
	
	public static void metodo1() {
		System.out.println("*** METODO1 START ***");
		metodo2();
		System.out.println("*** METODO1 END ***");
	}
	
	public static void metodo2() {
		
		System.out.println("*** METODO2 START ***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String vect[] = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("*** METODO2 END ***");
	}
	
}