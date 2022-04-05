//4. Ingresar dos cadenas de caracteres y comparar si son iguales.

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        String cadena1, cadena2;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.print("Ingresar cadena1: ");
        cadena1 = teclado.next();

        System.out.print("Ingresar cadena2: ");
        cadena2 = teclado.next();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas NO son iguales");
        }

    }

}