//4. Calcular el IVA (21%) y el importe total a pagar de una compra que se ingresará por teclado.
// Una vez obtenido el dato y calculado el importe la salida del programa deberá tener el formato que se da como ejemplo:
//
// Importe total de la compra: $45000
// IVA: $9450
// Importe total a pagar: $54450
// (Los valores numéricos son sólo a título de ejemplo)


import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        double producto, IVA = 0.21;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar precio del producto: ");
        producto = teclado.nextDouble();

        System.out.println("\nImporte total de la compra: $" + producto);
        System.out.println("IVA: $" + (producto * IVA));
        System.out.println("Importe total a pagar: $" + (producto + (producto * IVA)) );
    }

}