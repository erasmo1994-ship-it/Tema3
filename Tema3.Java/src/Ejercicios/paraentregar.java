package Ejercicios;

import java.util.Scanner;

public class paraentregar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            opcion = mostrar(teclado);

            switch (opcion) {
                case 1:
                    int[] Suma = pedirNumeros(teclado);
                    System.out.println("La suma es: " + sumar(Suma[0], Suma[1]));
                    break;
                case 2:
                    int[] Resta = pedirNumeros(teclado);
                    System.out.println("La resta es: " + restar(Resta[0], Resta[1]));
                    break;
                case 3:
                    int[] numsMult = pedirNumeros(teclado);
                    System.out.println("La multiplicación es: " + multiplicar(numsMult[0], numsMult[1]));
                    break;
                case 4:
                    int[] numsDiv = pedirNumeros(teclado);
                    System.out.println("La división es: " + dividir(numsDiv[0], numsDiv[1]));
                    break;
                case 5:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        teclado.close();
    }

    public static int mostrar(Scanner teclado) {
        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        return teclado.nextInt();
    }

    public static int[] pedirNumeros(Scanner teclado) {
        System.out.print("Ingresa el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = teclado.nextInt();
        return new int[]{num1, num2};
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
            return Double.NaN; 
        }
        return (double) num1 / num2;
    }
}
