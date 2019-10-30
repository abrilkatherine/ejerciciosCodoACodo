package unidad4;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

       /* 10)Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
                la computadora indique si el mayor es divisible por el menor. Ejemplo:
        Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
        que los números ingresados se encuentren entre 0 y 100 */

       //pensar la parte de la validacion,solo falta eso

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero1 = entrada.nextInt();

        System.out.println("ingrese otro numero");
        int numero2 = entrada.nextInt();

        if (numero1 < numero2) {
            System.out.println(numero2 + " es divisble por " + numero1);
        }else{
            System.out.println(numero1 + "es divisible por " + numero2);

        }
    }
}
