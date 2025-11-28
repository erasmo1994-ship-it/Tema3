package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String Multiplo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		numero = teclado.nextInt();
		teclado.close();
		
		Multiplo = ((numero <= 0) ? "negativo" : "positivo");
		System.out.println(Multiplo);
	}

}
