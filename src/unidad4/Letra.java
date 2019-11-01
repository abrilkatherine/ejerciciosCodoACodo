package unidad4;

import java.util.Scanner;

public class Letra {

    public static void main(String[] args) {

/*      14) Desarrollar un algoritmo que permita el ingreso de una letra, correspondiente a un dígito del sistema
            de numeración romano. La computadora muestra su correspondiente valor decimal. Si se ingresa una
            letra inexistente, computadora informa que no existe tal dígito.
            Ejemplo: Se ingresa 'D', la computadora muestra: 500. */

        char letra;
        int valorLetra = -1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una letra de la numeración romana:");
        letra = entrada.next().charAt(0);

        switch (Character.toUpperCase(letra)) {
            case 'I':
                valorLetra = 1;
                break;
            case 'V':
                valorLetra = 5;
                break;
            case 'X':
                valorLetra = 10;
                break;
            case 'L':
                valorLetra = 50;
                break;
            case 'C':
                valorLetra = 100;
                break;
            case 'D':
                valorLetra = 500;
                break;
            case 'M':
                valorLetra = 1000;
                break;
            default:
                System.out.println("El digito ingresado no existe.");
                break;
        }

        if (valorLetra != -1) {
            System.out.println(valorLetra);
        }

    }

}
