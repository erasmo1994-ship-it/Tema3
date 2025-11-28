package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		boolean esPar;
		System.out.println("ingresar numero");
		numero = teclado.nextInt();
		
		esPar = ((numero % 2) == 0);
		
		System.out.println("El numero " + numero + " es par: " + esPar);
		teclado.close();
	}

}
