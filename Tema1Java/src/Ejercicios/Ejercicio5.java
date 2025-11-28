package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		float var1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero");
		var1 = teclado.nextFloat();
		teclado.close();
		System.out.println("El numero es " + var1);

	}

}
