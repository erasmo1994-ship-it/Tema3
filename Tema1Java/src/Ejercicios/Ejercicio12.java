package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		boolean esTres;
		
		System.out.println("ingresar numero");
		numero = teclado.nextInt();
		esTres = (numero == 3);
		teclado.close();
		
		System.out.println("¿es tres?" + esTres);
	}

}
