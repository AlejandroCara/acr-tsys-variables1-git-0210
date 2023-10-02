package Ej2;

public class Ej2App {

	public static void main(String[] args) {
		
		//Declaración de variables
		int n = 3;
		double a = 2.7;
		char c = 'h';
		
		//Prints de los valores
		System.out.println("Valor de N: " + n);
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de C: " + c);
		
		//Prints de las operaciones
		System.out.println("Suma N + A: " + (n + a));
		System.out.println("Diferencia de A - N: " + (a - n));
		System.out.println("Valor numerico del caracter acumulado en C: " + (int)c); //Cast de la variable C para mostrar su codificación ASCII
	}

}
