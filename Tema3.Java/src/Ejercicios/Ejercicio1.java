package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("La suma de ambos números es: " + sumar(3, 10));
		System.out.println("La resta de ambos números es: " + restar(3, 10));
		System.out.println("La multiplicacion de ambos números es: " + multiplicar(3, 10));
		System.out.println("La divison de ambos números es: " + dividir(3, 10));
		System.out.println("El resultado de factorizar el números es: " + factorizar(8));
		System.out.println("El resultado del número es: " + primo(8));

	}
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	public static int restar(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	public static int multiplicar(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	public static int dividir(int num1, int num2) {
		if (num2 == 0) {
			return -1;
		} else {
			int resultado = num1 / num2;
			return resultado;
		}
	}
	public static int factorizar(int num1) {
	    if (num1 < 0) {
	        return -1; 
	    } else if (num1 == 0) {
	        return -2; 
	    }
	    int factorial = 1;
	    for (int i = 2; i <= num1; i++) {
	        factorial *= i;
	    }
	    return factorial;
	}
	public static boolean primo(int num1) {
	    if (num1 <= 1) return false;
	    for (int i = 2; i <= Math.sqrt(num1); i++) {
	        if (num1 % i == 0) return false;
	    }
	    return true;
	}
	public static int contarCifras(int numero) {
		if (numero == 0)
			return 1; 
		int cifras = 0;
		while (numero > 0) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}

	public static boolean esNarcisista(int num) {
	    int aux = num;
	    int narc = 0;
	    int cifras = contarCifras(num);

	    while (num > 0) {
	        int c = num % 10;
	        num = num / 10;
	        narc += Math.pow(c, cifras);
	    }

	    return narc == aux;
	}
}