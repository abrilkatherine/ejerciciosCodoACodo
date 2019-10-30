package unidad4;

import java.util.Scanner;

public class Jubilacion {
    public static void main(String[] args) {

            /* 8)   Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120 años)
            y su género ('F' para mujeres, 'M' para hombres), la computadora indique si está en edad de jubilarse.
            Ayuda: Las mujeres se jubilan con 60 años o más. Los hombres se jubilan con 65 años o más.
            Ejemplo: Ingresa 62 y 'M', debe devolver “No se jubila”. */

        Scanner entrada = new Scanner(System.in);

        int edad;
        do {
            System.out.println("Ingrese su edad:");
            edad = entrada.nextInt();
        } while (edad < 1 || edad > 120);

        char genero;
        do {
            System.out.println("Ingrese su género (F o M):");
            genero = entrada.next().charAt(0);
        } while (!generoIngresadoOk(genero));

        if (edad >= 60 && genero == 'F' || edad >= 65 && genero == 'M') {
            System.out.println("Está en edad de jubilarse.");
        } else {
            System.out.println("No tiene la edad suficiente para jubilarse.");
        }
    }

    private static boolean generoIngresadoOk(char genero) {
        boolean resultado = false;
        if (genero == 'F' || genero == 'M') {
            resultado = true;
        }
        return resultado;
    }
}
