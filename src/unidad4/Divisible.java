package unidad4;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

       /* 10)Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
                la computadora indique si el mayor es divisible por el menor. Ejemplo:
        Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
        que los números ingresados se encuentren entre 0 y 100 */


        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int mayor;
        int menor;

        do {
            System.out.println("Ingrese el primer número (entre 0 y 100):");
            num1 = entrada.nextInt();
        } while (num1 < 0 || num1 > 100);

        do {
            System.out.println("Ingrese el segundo número (entre 0 y 100):");
            num2 = entrada.nextInt();
        } while (num2 < 0 || num2 > 100);

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        if((mayor % menor) == 0){
            System.out.println(mayor + " es divisible por " + menor);
        } else {
            System.out.println(mayor + " no es divisible por " + menor);
        }
    }
}
