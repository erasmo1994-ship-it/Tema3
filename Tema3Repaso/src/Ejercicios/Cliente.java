package Ejercicios;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		Ejercicio6 cuenta = new Ejercicio6("PEDRO", "salamanca", "124352B", 250);
		do {
			System.out.println("----MENÚ----");
			System.out.println("0) Salir");
			System.out.println("1) Ver info cuenta");
			System.out.println("2) Ver saldo");
			System.out.println("3) Ingresar");
			System.out.println("4) Sacar dinero");
			System.out.println("5) Modificar domicilio");

			System.out.println("Introduzca la opción deseada: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion){
			case 0:
				System.out.println("finaliza");
				break;
			case 1:
				System.out.println(cuenta);
				break;
			case 2:
				System.out.println("saldo de la cuenta: " + cuenta.getDinero() + " € ");
				break;
			case 3:
				System.out.println("cuanto dinero quiere ingresar");
				int dineroIngresar = teclado.nextInt();
				teclado.nextLine();
				boolean resultado = cuenta.sacarDinero(dineroIngresar);
				if (resultado) {
					System.out.println("Operacion realizada con exito");
				}else {
					System.out.println("Error realizado la operacion");
				}
				break;
			case 4:
				System.out.println("cuanto dinero quiere sacar?");
				int dineroSacar = teclado.nextInt();
				teclado.nextLine();
				boolean resultado2 = cuenta.sacarDinero(dineroSacar);
				if(resultado2) {
					System.out.println("operacion realizada con exito");
				}else {
					System.out.println("Error realizando la operacion");
					break;
				}
			case 5:
				System.out.println("Ingresar nueva direccion");
				String direccionNueva = teclado.nextLine();
				cuenta.setDomicilio(direccionNueva);
				break;
				default:
					System.out.println("Opcion no reconicida");
					break;
			}
			
		} while (opcion != 0);
	teclado.close();	
	}

}
