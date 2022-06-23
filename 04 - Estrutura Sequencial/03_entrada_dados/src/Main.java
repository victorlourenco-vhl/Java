import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		// Ler uma palavra pelo teclado
//		String x;
//		x = sc.next();
//		System.out.println("Voc� digitou: " + x);
		
		// Ler um n�mero Inteiro
//		int a;
//		a = sc.nextInt();
//		System.out.println(a);
		
		// Ler um n�mero double (como ponto flutuante)
//		double a;
//		a = sc.nextDouble();
//		System.out.println(a);
		
		// Ler um caractere
//		char a;
//		a = sc.next().charAt(0);
//		System.out.println(a);
		
		// Ler v�rios dados na mesma linha
		String a;
		int y;
		double z;
		
		a = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("String: " + a);
		System.out.println("Int: " + y);
		System.out.println("Double: " + z);
		
		sc.close();
	}

}
