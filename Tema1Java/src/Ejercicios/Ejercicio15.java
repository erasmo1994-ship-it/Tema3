package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numero;
		boolean esImpar;
		System.out.println("ingresar numero");
		numero = teclado.nextInt();

		esImpar = ((numero % 2) != 0);

		System.out.println("El numero " + numero + " es impar: " + esImpar);
		teclado.close();
	}

}
