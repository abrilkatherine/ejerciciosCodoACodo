package unidad4;

import java.util.Scanner;

public class Clave {
    public static void main(String[] args) {

        /* 25) Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que nos pida una clave. Solo tenemos
        3 intentos para acertar, si fallamos los 3 intentos nos mostrará un mensaje indicándonos que hemos agotado
        esos 3 intentos. Si acertamos la clave, saldremos directamente del programa. Utilice la instrucción while. */

        Scanner entrada = new Scanner(System.in);

        String clave = "eureka";
        String claveIngresada;
        int intentos = 3;

        System.out.println("Ingrese su clave: ");
        claveIngresada = entrada.next();
        intentos--;

        while (!claveIngresada.equals(clave) && intentos > 0) {
            System.out.println("Ingrese su clave (intentos restantes = " + intentos + ")");
            claveIngresada = entrada.next();
            intentos--;
        }

        if (intentos == 0) {
            System.out.println("Agoto el número de intentos permitidos para ingresar.");
        } else {
            System.out.println("Bienvenido.");
        }
    }
}