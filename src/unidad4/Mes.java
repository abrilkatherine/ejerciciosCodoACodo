package unidad4;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {

        /*      13)  Desarrollar un algoritmo que pida al usuario un número entre 1 y 12. La computadora muestra por pantalla
             el mes al que pertenece tal número. Si se ingresa un número fuera de rango, mostrar un error.
             Ejemplo: se ingresa un 4, la computadora muestra: “ABRIL” (utilice switch-case). */

        int numeroMes;
        String nombreMes;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número entre 1 y 12:");
            numeroMes = entrada.nextInt();
        } while (numeroMes < 1 || numeroMes > 12);

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril <3";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "El número de mes ingresado no es válido.";
                break;
        }

        System.out.println(nombreMes);

    }
}
