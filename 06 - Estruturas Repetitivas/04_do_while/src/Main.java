import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char opcao = 'n';
		
		while(opcao != 'n') {
			System.out.println("WHILE");
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = (9  * c / 5) + 32;
			System.out.printf("Equivalente em Fhrenheit: %.1f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
			opcao = sc.next().charAt(0);
			
		}
		
		// No DO WHILE o bloco de comando vai ser executado pelo menos uma vez
		
		char opcaoB; // Não precisa iniciar a variável com um valor
		
		do {
			System.out.println("DO WHILE");
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = (9  * c / 5) + 32;
			System.out.printf("Equivalente em Fhrenheit: %.1f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
			opcaoB = sc.next().charAt(0);
		}while (opcaoB != 'n');

		
		  
		sc.close();
	}

}
