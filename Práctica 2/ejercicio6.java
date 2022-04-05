//6. Ingresar una cadena de caracteres y reemplazar una parte de la misma por otra.

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        String cadena, cadena2, cadena3;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.print("Ingresar cadena: ");
        cadena = teclado.next();

        System.out.print("Parte que se quiere reemplazar: ");
        cadena2 = teclado.next();

        System.out.print("Parte por la que se va a reemplazar: ");
        cadena3 = teclado.next();

        cadena = cadena.replace(cadena2, cadena3);

        System.out.println("\n" + cadena);

    }

}