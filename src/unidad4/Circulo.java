package unidad4;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

    /*       5) Ingresar por teclado el radio (tipo de dato entero) de un círculo y calcular su perímetro y
            superficie (definidos como double). Utilice la Clase Math para obtener el valor de PI.
            Ejemplo: Ingresa 5, debe devolver perímetro = 31,41592654 y superficie = 78,53981634. */

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el radio del circulo :");

        Integer radio = entrada.nextInt();

        double perimetro = 2 * Math.PI * radio;
        double superficie = Math.PI * radio * radio;

        System.out.println("perimetro: " + perimetro);
        System.out.println("superficie: " + superficie);
    }
}
