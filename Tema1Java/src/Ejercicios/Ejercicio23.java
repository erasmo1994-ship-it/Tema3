package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, cantidad;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa un numero entero");
		numero = teclado.nextInt();
		
		int resto = numero % 6;

        cantidad = (resto == 0) ? 0 : (6 - resto);
        
        System.out.println("Hay que sumarle " + cantidad + " para que " + numero + " sea múltiplo de 6.");
        teclado.close();
	}

}