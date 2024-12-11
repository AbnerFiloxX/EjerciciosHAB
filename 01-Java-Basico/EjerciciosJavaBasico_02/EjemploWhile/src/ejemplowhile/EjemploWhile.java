
package ejemplowhile;

import java.util.Scanner;


public class EjemploWhile {


    public static void main(String[] args) {
     /*int cont = 0;
     while(cont <= 10){
         System.out.println("Estoy en el numero:"+cont);
         //cont=cont+1;
         cont++;
     }*/
     
     /*crear un programa que permita ingresar las edades de personas y que pare su ejecucion al encontrar una persona mayor a 70 años*/
     Scanner teclado = new Scanner(System.in);
        
        int edad = 0;
        
        // Bucle que pide edades hasta encontrar una mayor a 70 años
        while (edad <= 70) {
            System.out.println("Ingrese su edad:");
            edad = teclado.nextInt(); // Se ingresa la edad

            // Si la edad es mayor a 70, terminamos el programa
            if (edad > 70) {
                System.out.println("Persona mayor a 70 años encontrada. Terminando el programa.");
                break; // Sale del bucle y termina el programa
            }
        }
    }
    
}
