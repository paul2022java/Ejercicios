//3. Pedir que se ingrese una frase por teclado y extraer una palabra de la frase.

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String frase, palabraExtraida;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.print("Ingresar una frase: ");
        frase = teclado.next();

        palabraExtraida = frase.substring(2, 12);

        System.out.println("\nFrase: \'" + frase + "\'");
        System.out.println("Palabra Extraída: \'" + palabraExtraida + "\'");

    }

}