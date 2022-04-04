// 3. Escribir un programa que realice las siguientes acciones:
//    a. Asigne a 2 variables numero1 y numero2 valores distintos de cero
//    b. Efectúe el producto de dichas variables.
//    c. Muestre el resultado por pantalla.
//    d. Obtenga el cuadrado de numero1 y lo muestre por pantalla.


import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Ingresar 1° número: ");
            numero1 = teclado.nextInt();
        } while (numero1 == 0);

        do {
            System.out.print("Ingresar 2° número: ");
            numero2 = teclado.nextInt();
        } while (numero2 == 0);


        System.out.println("\nEl producto es: " + (numero1 * numero2));
        System.out.println("El cuadrado de numero1 es: " + (Math.pow(numero1, 2)));
    }

}