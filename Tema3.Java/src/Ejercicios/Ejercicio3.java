package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anio, mes = 0;
		System.out.println("Introduzca un año");
		anio = teclado.nextInt();
		System.out.println("Introduzca un mes");
		mes = teclado.nextInt();
		
		imprimirCalendario(2025, 11);

	}

	public static void imprimirCalendario(int anio, int mes) {
		String nombreMes = decirNombreMes(mes);
		System.out.println("\t" + nombreMes  + " , " + anio);	
		System.out.println("L" + "\t" + "M" + "\t" + "X" + "\t" + "J" + "\t" + "V" + "\t" + "S" + "\t" + "D");
		String dia = decirNombreMes(mes);
		int contador = 1;
		int dias = Ejercicio2.numeroDeDiasMesAnio(anio, mes);
		for (int i = 1; i <= numeroDeDiasMess(mes) ; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				
					System.out.println("\n");
				} 
			contador++;
			}
		}
	

	public static int numeroDeDiasMess(int mes) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			int anio = 0;
			if (anio % 4 == 0) {
				return 29;
			} else {
				return 28;
			}			
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
	}
	}
	public static String decirNombreMes(int mes) {
		switch (mes) {
		case 1:
			return "ENERO";
		case 2:
			return "FEBRERO";
		case 3:
			return "MARZO";
		case 4:
			return "ABRIL";
		case 5:
			return "MAYO";
		case 6:
			return "JUNIO";
		case 7:
			return "JULIO";
		case 8:
			return "AGOSTO";
		case 9:
			return "SEPTIEMBRE";
		case 10:
			return "OCTUBRE";
		case 11:
			return "NOVIEMBRE";
		case 12:
			return "DICIEMBRE";
		}
		return "error";
	}
	public static int diaComienzoMes(int mes, int anio) {
		switch (mes) {
		case 1, 2:
			return (anio + 31 * (mes - 1) + (anio - 1) / 4 - 3 * ((anio + 99) / 100) / 4) % 7;
		default:
			return (anio + 31 * (mes - 1) - (4 * mes + 23) / 10 + anio / 4 - (3 * (anio / 100 + 1)) / 4) % 7;
		}		
}
}


















