
public class Main {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		// Calculando �rea d o trap�zio

		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("Area: " + area);
		
		
		// EXEMPLOS DE USO DO CASTING
		
		// Para manter o ponto flutuante na opera��o com inteiros:
		
		int w, j;
		double resultado;
		
		w = 5; 
		j = 2;
		
		resultado = (double) w / j;
			
		System.out.println(resultado);
		
		// Avisar o compilador que n�o tem problema perder as casas decimais
		
		double l;
		int m;
		
		l = 5.0;
		m = (int) l;
		
		System.out.println(m);
		

	}

}
