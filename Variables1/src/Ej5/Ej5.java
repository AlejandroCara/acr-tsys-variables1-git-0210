package Ej5;

public class Ej5 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int a = 5;
		int b = 12;
		int c = 2;
		int d = 32;
		
		//Valores iniciales
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de D: " + d);
		
		//Operaciones y print de los resultados
		b = c;
		System.out.println("B = C: " + b);
		
		c = a;
		System.out.println("C = A: " + c);
		
		a = d;
		System.out.println("A = D: " + a);
		
		d = b;
		System.out.println("D = B: " + d);

	}

}
