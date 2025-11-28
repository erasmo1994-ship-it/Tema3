package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, numero3;
		char caracter1, caracter2, caracter3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introducir primer numero entero");
		numero1 = teclado.nextInt();
		System.out.println("introducir segundo numero entero");
		numero2 = teclado.nextInt();
		System.out.println("introduce tercer numero entero");
		numero3 = teclado.nextInt();

		caracter1 = (char) numero1;
		caracter2 = (char) numero2;
		caracter3 = (char) numero3;

		System.out.println("El número " + numero1 + " corresponde al carácter: '" + caracter1
				+ "' porque en la tabla Unicode/ASCII ese valor está asociado a ese símbolo.");
		
		System.out.println("El número " + numero2 + " corresponde al carácter: '" + caracter2
				+ "' porque en la tabla Unicode/ASCII ese valor está asociado a ese símbolo.");
		
		System.out.println("El número " + numero3 + " corresponde al carácter: '" + caracter3
				+ "' porque en la tabla Unicode/ASCII ese valor está asociado a ese símbolo.");

		teclado.close();

	}

}
