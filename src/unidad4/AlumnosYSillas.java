package unidad4;

import java.util.Scanner;

public class AlumnosYSillas {
    public static void main(String[] args) {

       /* 9)  Desarrollar un algoritmo que, dada la cantidad de alumnos de un curso y la cantidad de sillas
        disponibles, la computadora indique si alcanzan las sillas, en caso contrario, indique
        cuántas faltan para que todos tengan asiento. */

        Scanner entrada= new Scanner(System.in);

        System.out.println("Indique cantidad de alumnos");
        int alumnos = entrada.nextInt();

        System.out.println("Indique cantidad de sillas");
        int sillas = entrada.nextInt();

        if (sillas >= alumnos) {
            System.out.println("Alcanzan las sillas.");
        } else {
            System.out.println("Faltan " + (alumnos - sillas) + " sillas.");
        }
    }
}
