
package estructurasrepetitivas_02;

import java.util.Scanner;

public class EstructurasRepetitivas_02 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = teclado.nextInt();  
        
        if (numero > 0) {
            
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }
    }
    
}
