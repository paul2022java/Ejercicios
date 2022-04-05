//5. Ingresar una cadena de caracteres en minúscula y mostrarla por pantalla en mayúscula

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        String cadena;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.print("Ingresar cadena: ");
        cadena = teclado.next();

        System.out.println(cadena.toUpperCase());

    }

}