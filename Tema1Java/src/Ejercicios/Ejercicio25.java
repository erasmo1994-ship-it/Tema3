package Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad;
		int billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5;

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa cuanto dinero va a retirar");
		cantidad = teclado.nextInt();
		
		billetes500 = cantidad / 500;
		cantidad = cantidad % 500;
		
		billetes200 = cantidad / 200;
		cantidad = cantidad % 200;
		
		billetes100 = cantidad / 100;
		cantidad = cantidad % 100;
		
		billetes50 = cantidad / 50;
		cantidad = cantidad % 50;
		
		billetes20 = cantidad / 20;
		cantidad = cantidad % 20;
		
		billetes10 = cantidad / 10;
		cantidad = cantidad % 10;
		
		billetes5 = cantidad / 5;
		cantidad = cantidad % 5;
		teclado.close();
		
		System.out.println("la cantidad de billetes que te tengo que dar es: ");
		System.out.println("\t" + billetes500 + " billetes de 500 €");
		System.out.println("\t" + billetes200 + " billetes de 200 €");
		System.out.println("\t" + billetes100 + " billetes de 100 €");
		System.out.println("\t" + billetes50 + " billetes de 50 €");
		System.out.println("\t" + billetes20 + " billetes de 20 €");
		System.out.println("\t" + billetes10 + " billetes de 10 €");
		System.out.println("\t" + billetes5 + " billetes de 5 €");
		
	}

}
