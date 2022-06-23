import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte numero;
		String dia;
		
		System.out.println("Digite um valor de 1 a 7: ");
		numero = sc.nextByte();
		
		switch (numero) {
			case(1):
				dia = "Domingo";
				break;
			case(2):
				dia = "Segunda";
				break;
			case(3):
				dia = "Terça";
				break;
			case(4):
				dia = "Quarta";
				break;
			case(5):
				dia = "Quinta";
				break;
			case(6):
				dia = "Sexta";
				break;
			case(7):
				dia = "Sábado";
				break;
			default:
				dia = "Inválido";
				break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
