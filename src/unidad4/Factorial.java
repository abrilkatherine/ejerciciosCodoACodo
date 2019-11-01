package unidad4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

/*      21) Desarrollar un algoritmo que permita ingresar un número natural. La computadora muestra el factorial
            del número. Ejemplo: Se ingresa 5, la computadora muestra: 120. */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número natural:");
        int num = entrada.nextInt();
        int factorial = 1;

        while (num != 0) {
            factorial = factorial * num;
            num--;
        }

        System.out.println("El factorial del número ingresado es: " + factorial);
    }
}