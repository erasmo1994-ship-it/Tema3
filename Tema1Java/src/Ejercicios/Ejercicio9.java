package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int añoNacimiento;
		int añoActual;
		int resultado;
		System.out.println("escribir año");
		añoNacimiento = teclado.nextInt();
		
		System.out.println("escribir año actual");
		añoActual = teclado.nextInt();
	
		resultado = añoNacimiento - añoActual;
		System.out.println("Tienes" + resultado );
		teclado.close();
	}

}
