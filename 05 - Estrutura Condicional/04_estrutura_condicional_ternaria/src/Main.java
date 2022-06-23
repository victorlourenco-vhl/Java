
public class Main {

	public static void main(String[] args) {
		
		//Estrutura condicional
		double preco= 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		// Condicional ternária
		double precoB = 47.5;
		double descontoB = (precoB < 23.0)? precoB * 0.12 : precoB * 0.06;
		
		System.out.println(descontoB);

	}

}
