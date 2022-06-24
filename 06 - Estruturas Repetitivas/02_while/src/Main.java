import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int accumulator = 0;

		while (x != 0) {
			accumulator += x;
			x = sc.nextInt();

		}

		System.out.println("A soma foi: " + accumulator);
		System.out.println("Programa finalizado!");

		sc.close();

	}

}
