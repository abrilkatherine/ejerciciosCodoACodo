package unidad4;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {

/*      12) Desarrollar un algoritmo que permita ingresar un caracter.
            La computadora indica si es o no una letra vocal (utilice switch-case). */

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un caracter");
        char caracter= entrada.next().charAt(0);

        switch (Character.toLowerCase(caracter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("El caracter ingresado es una vocal");
                break;
            default:
                System.out.println("El caracter ingresado no es una vocal");
        }
    }
}
