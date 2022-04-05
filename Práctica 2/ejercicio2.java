//2. Pedir que se ingrese una frase por teclado y contar la cantidad de caracteres (incluidos los espacios).

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String frase;
        int cantidad;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.print("Ingresar una frase: ");
        frase = teclado.next();

        cantidad = frase.length();

        System.out.println("\nLa frase \'" + frase + "\' \nTiene " + cantidad + " caracteres");

    }

}