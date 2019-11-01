package unidad4;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {

/*      17) Ingresar por teclado 1 número entero y mostrar por pantalla su tabla de multiplicar
            entre 1 y 10 (usando la instrucción for). */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}