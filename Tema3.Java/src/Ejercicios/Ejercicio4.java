package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número decimal: ");
		int nDecimal = teclado.nextInt();

		String binario = calcularBinario(nDecimal);
		System.out.println("El número binario es: " + binario);
		String numOctal = calcularOctal(nDecimal);
		System.out.println("El número octal es: " + numOctal);
		String numHexadecimal = calcularOctal(nDecimal);
		System.out.println("El numero hexadecimal es: " );

	}

	public static String calcularBinario(int decimal) {
		String numeroBinario = "";
		while (decimal > 0) {
			int cifra = decimal % 2;
			decimal = decimal / 2;
			numeroBinario = cifra + numeroBinario;
		}

		return numeroBinario;
	}

	public static String calcularOctal(int decimal) {
		
		String numOctal = "";
		while(decimal > 0){
			int cifra = decimal % 8;
			numOctal = cifra + numOctal;
			decimal = decimal / 8;
					
	}
		return numOctal;		
}
	public static String numHexadecimal (int decimal) {
		String numHexadecimal = "";
		
		while (decimal > 0) {
			int cifra = decimal % 16;
			decimal = decimal / 16;
			
			if (cifra <= 0 && cifra >= 9 ) {				
			}else {
			
			numHexadecimal = cifra + numHexadecimal;
			
		}
		return numHexadecimal;
	}
		return numHexadecimal;
}
}
