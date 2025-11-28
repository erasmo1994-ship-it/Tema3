package Ejercicios;
 
import java.util.Scanner;
 
import com.sun.source.doctree.SystemPropertyTree;
 
public class Ejercicio6 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int año;
        int mes;
        int dia;
	
	
		System.out.println("introduce año");
		año = teclado.nextInt();
		System.out.println("el año es: " + año);
		
		System.out.println("Introduce tu mes de nacimiento (1-12):");
		mes = teclado.nextInt();
		System.out.println("el mes es: " + mes);
		
		System.out.println("Introduce tu día de nacimiento (1-31):");
        dia = teclado.nextInt();
		System.out.println("el dia es: " + dia);
		
        System.out.println("Tu fecha de nacimiento es: " + dia + "/" + mes + "/" + año);
        teclado.close();
                
	}
 
}