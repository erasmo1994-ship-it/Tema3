package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		System.out.println("Introduzca el dinero de la cuenta");
		double dinero;
		dinero = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Introduzca su nombre");
		String nombreUsuario;
		nombreUsuario = teclado.nextLine();
	
		CuentaBancaria cuentaBancaria = new CuentaBancaria(dinero, nombreUsuario, '€');

		do {
			System.out.println("Introducir la opcion a realizar");
			System.out.println("----MENÚ----");
			System.out.println("0) Salir");
			System.out.println("1) Mostrar cuenta");
			System.out.println("2) consultar saldo");
			System.out.println("3) Cambiar a € ");
			System.out.println("4) Cambiar a £ ");
			System.out.println("5) Cambiar a $ ");

					
			System.out.println("Ingresa una opción");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Finaliza");
				break;
			case 1:
				System.out.println(cuentaBancaria);
				break;
			case 2:
				System.out.println("su saldo actual es: " + cuentaBancaria.getDinero());
				
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (opcion != 0);
		teclado.close();	
	}

}
