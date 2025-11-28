package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		double real1, real2, real3;
		Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca un real: ");
		real1 = lector.nextDouble();

		System.out.println("Introduzca un real: ");
		real2 = lector.nextDouble();

		System.out.println("Introduzca un real: ");
		real3 = lector.nextDouble();

		System.out.println("Los tres reales son: ");
		System.out.println(real1);
		System.out.println(real2);
		System.out.println(real3);

		int entero1, entero2, entero3;

		entero1 = (int) real1;
		entero2 = (int) real2;
		entero3 = (int) real3;

		System.out.println("Los tres enteros son: ");

		System.out.println(entero1);
		System.out.println(entero2);
		System.out.println(entero3);
		lector.close();

	}

}
