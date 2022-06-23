import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = 50.00;
		int minutos = 0;
		
		
		System.out.print("Quantos minutos vc utilizou? ");
		minutos = sc.nextInt();
		
		if(minutos <= 100) {
			System.out.printf("Você deve pagar: R$ %.2f\n", valor);
		}
		else {
			valor += (minutos - 100) * 2;
			System.out.printf("Você deve pagar: R$ %.2f\n", valor);
		}
		sc.close();
	}

}
