package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int var1;
		int var2;
		System.out.println("ingresa un numero");
		var1 = teclado.nextInt();
		
		System.out.println("ingresa otro numero");
		var2 = teclado.nextInt();
		teclado.close();

		System.out.println("el resultado de sumar: " +  (var1 + var2));
		System.out.println("el resultado de restar el segundo numero: " +  (var1 - var2));
		System.out.println("el resultado de multiplicar ambos numeros: " +  (var1 * var2));
		System.out.println("el resultado de dividir el primero por el segundo: " +  (var1 / var2));
	}

}
