package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		int entero1, entero2, entero3;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca un entero: ");
		entero1 = lector.nextInt();
		
		System.out.println("Introduzca un entero: ");
		entero2 = lector.nextInt();
		
		System.out.println("Introduzca un entero: ");
		entero3 = lector.nextInt();
		
		System.out.println("Los tres enteros son: ");
		System.out.println(entero1);
		System.out.println(entero2);
		System.out.println(entero3);

		double real1, real2, real3;

		
		real1 = entero1;
		real2 = entero2;
		real3 = entero3;
		
		System.out.println("Los tres reales son: ");

		System.out.println(real1);
		System.out.println(real2);
		System.out.println(real3);
		lector.close();

	}

}
