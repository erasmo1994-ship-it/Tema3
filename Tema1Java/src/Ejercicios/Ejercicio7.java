package Ejercicios;
 
import java.util.Scanner;
 
public class Ejercicio7 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       
       double var1;
       double resultado;
       
       System.out.println("introducir numero: ");
       var1 = teclado.nextDouble();
       resultado = Math.sqrt(var1);
       
       System.out.println("La raíz cuadrada de " + var1 + " es: " + resultado);
       teclado.close();
  
	}
 
}