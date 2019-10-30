package unidad4;

import java.util.Scanner;

public class TrianguloRectanculo {
    public static void main(String[] args) {

        /*      6) Ingresar por teclado los lados de un triángulo rectángulo (valores enteros) y calcular el perímetro
           y su superficie. Para la raíz cuadrada de la hipotenusa deberá utilizar la clase Math.
           Ayuda: la superficie es base*altura/2 y el perímetro del triangulo es base+altura+hipotenusa,
           donde hipotenusa = √(𝑏𝑎𝑠𝑒2 + 𝑎𝑙𝑡𝑢𝑟𝑎2) */

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la base del triangulo");

        int base = entrada.nextInt();

        System.out.println("Ingrese la altura del rectágulo:");
        int altura = entrada.nextInt();

        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro = base + altura + hipotenusa;
        double superficie = (double) (base * altura) / 2;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Superficie: " + superficie);
    }
}
