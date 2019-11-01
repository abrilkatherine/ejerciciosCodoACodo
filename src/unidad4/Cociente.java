package unidad4;

import java.util.Scanner;

public class Cociente {
    public static void main(String[] args) {

        /*  3)  Desarrollar un algoritmo que permita ingresar dos números enteros por teclado. La computadora deberá
            mostrar su cociente con decimales. Recuerde utilizar Casting para obtener el resultado con los decimales
            correspondientes. */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = entrada.nextInt();

        Double cociente = (double) num1 / num2;

        System.out.printf("Cociente: %.2f", cociente);
    }
}