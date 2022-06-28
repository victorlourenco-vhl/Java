import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorValor = maior(a, b, c);
		mostrarResultado(maiorValor);
		
		sc.close();
	}
	public static int maior(int n1, int n2, int n3) {
		int maior;
		if(n1 >= n2 && n1 >= n3) {
			maior = n1;
		}
		else if (n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		return maior;
	}
	public static void mostrarResultado(int x) {
		System.out.println("Resultado: " + x);
	}
}

