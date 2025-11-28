package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float notaAlumno;
		boolean aprobado;
		
		System.out.println("ingresar numero");
		notaAlumno = teclado.nextFloat();
		aprobado = (notaAlumno >= 5);
		teclado.close();
		System.out.println("la nota alumno es aprobada:" + aprobado);

	}

}
