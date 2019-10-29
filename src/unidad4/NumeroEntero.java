package unidad4;

import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args){

        /*2) Desarrollar un algoritmo que permita ingresar dos números enteros por
            teclado utilizando un objeto Scanner. La computadora deberá mostrar su
            cociente entero. El resto se deberá mostrar en otra línea.*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar un numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingresar otro numero");
        int numero2 = entrada.nextInt();

        int cociente = numero1 / numero2;
        int resto= numero1 % numero2;

        System.out.println("cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
}
