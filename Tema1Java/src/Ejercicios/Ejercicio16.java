package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		boolean esNegativo;
		
		System.out.println("Ingresa primer numero");
		numero1 = teclado.nextInt();
		System.out.println("Ingresa segundo numero");
		numero2 = teclado.nextInt();
		System.out.println("Ingresa tercer numero");
		numero3 = teclado.nextInt();
		teclado.close();

		esNegativo = (numero1<0||numero2<0||numero3<0);
		System.out.println("Comprobar si es negativo: " + esNegativo);	
	}

}
