//1. Pedir el nombre y el apellido de una persona y mostrarlos en una sola cadena.

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre, apellido;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar nombre: ");
        nombre = teclado.next();
        System.out.print("Ingresar apellido: ");
        apellido = teclado.next();

        System.out.println("\nNombre y Apellido en una sola cadena: " + nombre.concat(apellido));

    }

}