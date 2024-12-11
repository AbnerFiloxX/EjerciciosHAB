
package conteonumeros;

import java.util.Scanner;

public class ConteoNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[15];
        int contador = 0; 

        
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese el número " + (i+1) + " de 15:");
            numeros[i] = teclado.nextInt(); 

            
            if (numeros[i] == 7) {
                contador++; 
            }
        }

        
        System.out.println("El número 7 se cargó " + contador + " veces.");
    }
    
}
