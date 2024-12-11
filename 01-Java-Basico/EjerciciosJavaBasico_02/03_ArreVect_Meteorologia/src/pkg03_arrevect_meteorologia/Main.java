
package pkg03_arrevect_meteorologia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;

        System.out.println("Ingrese las temperaturas máximas de los últimos 7 días:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Día: "+ (i + 1));
            temperaturas[i] = teclado.nextDouble();
            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;
        System.out.printf("La temperatura máxima promedio es: "+ promedio);
    }
    
}
