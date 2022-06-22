import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.00;
		double x = 27.4553243298;
				
		System.out.println("Olá, Mundo!");
		System.out.println(idade);
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US); // Serve para definir uma localidade padrão 
		System.out.printf("%.2f\n", x);
		
		// Tipos de concatenação
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
	}

}
