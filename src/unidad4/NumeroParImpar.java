package unidad4;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String teclado;

        System.out.println("Introducir un numero: ");

        int numero = entrada.nextInt();
        if(numero % 2 == 0){
            System.out.println(numero+" es par");
        }else{
            System.out.println(numero+" es impar");
        }
    }
}
