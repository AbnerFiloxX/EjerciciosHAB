
package pkg01_estruccond_recital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede ingresar al recital.");
        } else {
            System.out.println("No puede ingresar al recital, debe ser mayor de 18 años.");
        }
    }
    
}
