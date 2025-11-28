package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double inversion;
		double año1, año2, año3, año4;
		
		System.out.println("Ingresar inversion");
		inversion = teclado.nextFloat();
		año1 = inversion * 0.04;
		inversion = inversion + año1;
		inversion = (int) inversion;
		System.out.println("Los intereses del primero año son: " + inversion + "€");
		año2 = inversion * 0.04;
		inversion = inversion + año2;
		inversion = (int) inversion;
		System.out.println("Los intereses del segundo año son: " + inversion + "€");
		año3 = inversion * 0.04;
		inversion = inversion + año3;
		inversion = (int) inversion;
		System.out.println("Los intereses del tercer año son: " + inversion + "€");
		año4 = inversion * 0.04;
		inversion = inversion + año4;
		inversion = (int) inversion;
		teclado.close();
		System.out.println("Los intereses de cuarto año son: " + inversion + "€");
		
		
	
	}

}
