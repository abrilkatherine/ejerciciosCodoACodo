package unidad4;

import java.util.Scanner;

public class MaxYMin {
    public static void main(String[] args) {

        /* 23) Ingresar por teclado números enteros, la carga finaliza cuando se ingresa un cero. Se pide calcular y
        mostrar el número de valor máximo y el mínimo (utilice do-while). */

        Scanner entrada = new Scanner(System.in);
        int num, min, max;

        System.out.println("Ingrese un número entero:");
        num = entrada.nextInt();

        max = num;
        min = num;

        do {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            System.out.println("Ingrese un número entero:");
            num = entrada.nextInt();
        } while (num != 0);

        System.out.println("Valor máximo ingresado: " + max);
        System.out.println("Valor mínimo ingresado: " + min);
    }
}
