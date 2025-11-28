package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		numero = teclado.nextInt();
		teclado.close();
		
		String numeroMultiplo = (numero % 5) == 0 ? "Es multiplo de 5" : "No es multiplo de 5";
		System.out.println(numeroMultiplo);
	}

}
