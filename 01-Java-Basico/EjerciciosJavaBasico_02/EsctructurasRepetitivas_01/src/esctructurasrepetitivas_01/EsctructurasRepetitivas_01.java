
package esctructurasrepetitivas_01;

import java.util.Scanner;


public class EsctructurasRepetitivas_01 {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int sumaTotal = 0;

       
        while (numero >= 0) {
            System.out.println("Ingrese un número positivo (o un número negativo para terminar):");
            numero = teclado.nextInt(); 

            if (numero >= 0) {
                sumaTotal += numero; 
            }
        }

        
        System.out.println("La suma total de los números positivos es: " + sumaTotal);
    }
    
}
