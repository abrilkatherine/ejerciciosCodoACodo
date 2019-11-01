package unidad4;

import java.util.Scanner;

    public class Escalera {
        public static void main(String[] args) {
    /*
    19) Crear un programa que muestre en pantalla una escalera inversa de asteriscos. La cantidad de filas de la
        escalera se ingresa por teclado. Utilice la instrucción for.
        Ejemplo: Cantidad de filas = 5:
           *****
           ****
           ***
           **
           *
    */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas de la escalera:");
        int filas = entrada.nextInt();
        int cantFilas = filas;

        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print("*");
            }
            System.out.println("");
            filas--;
        }

    }
}

