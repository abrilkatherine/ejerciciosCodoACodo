package unidad4;

import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args){

        /*2) Desarrollar un algoritmo que permita ingresar dos números enteros por
            teclado utilizando un objeto Scanner. La computadora deberá mostrar su
            cociente entero. El resto se deberá mostrar en otra línea.*/

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingresar numeros enteros");

        numero1=entrada.nextInt();
        numero2=entrada.nextInt();

    }
}
