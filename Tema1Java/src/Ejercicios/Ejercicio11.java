package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Ingresa el radio de la circunferencia");
		Double radio = teclado.nextDouble();
 
		double longitud = 2 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);
 
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El área del círculo es: " + area);
		teclado.close();
	}

}
