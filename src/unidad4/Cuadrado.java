package unidad4;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args){

        /*1) Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
        Calcular e imprimir el valor del perímetro. */

        Scanner entrada = new Scanner(System.in);

        double lado;
        double area;
        double perimetro;

        System.out.println("Escribir cuanto vale el lado de un cuadrado");

        lado = entrada.nextDouble();
        area = lado*lado;
        perimetro = (lado*4);

        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
