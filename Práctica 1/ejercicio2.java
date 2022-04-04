//2. Escribir el programa necesario para calcular la suma de dos números. Mostrar el resultado.

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar 1° número: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingresar 2° número: ");
        numero2 = teclado.nextInt();

        System.out.println("La suma es: " + (numero1 + numero2));

    }

}