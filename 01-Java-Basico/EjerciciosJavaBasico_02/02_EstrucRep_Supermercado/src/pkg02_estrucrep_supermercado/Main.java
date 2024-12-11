
package pkg02_estrucrep_supermercado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total = 0;
        double precio;

        do {
            System.out.print("Ingrese el precio del producto (0 o negativo para finalizar): ");
            precio = teclado.nextDouble();
            if (precio > 0) {
                total += precio;
            }
        } while (precio > 0);

        System.out.printf("El total de la compra es: "+ total);
    }
    
}
