package Ejercicios;
 
import java.util.Scanner;
 
public class Ejercicioentrega {
 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int edad;
		boolean esMayor;
		float estatura;
		System.out.println("Introduzca la edad");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca el nombre");
		nombre = teclado.nextLine();
		System.out.println("es mayor?");
		System.out.println("\t + true = si");
		System.out.println("\t + false = no");
		esMayor = teclado.nextBoolean();
		System.out.println("Cual es su estarura");
		estatura = teclado.nextFloat();
		System.out.println(" la edad del usuario es " + edad + " el nombre del usuario es " + nombre + " ¿es mayor de edad? " + esMayor + " su estatura es " + estatura);
		teclado.close();
				
	}
 
}