package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, resto;

		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresar primer numero ");
		numero1 = lector.nextInt();
		System.out.println("Ingresar segundo numero ");
		numero2 = lector.nextInt();
		
		resto = (numero1 % numero2 == 0) ? 0 : numero2 - (numero1 % numero2);
		
		System.out.println("Hay que sumarle: " + resto );
		lector.close();
		
	}

}
