
package operacionesdelectura;

import java.util.Scanner;


public class OperacionesDeLectura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número : ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número : ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = (double) num1 / num2; 

        
        System.out.println("\nResultados de las operaciones:");
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " es: " + multiplicacion);

        
        if (num2 != 0) {
            System.out.println("La división de " + num1 + " / " + num2 + " es: " + division);
        } else {
            System.out.println("La división de " + num1 + " / " + num2 + " es: "+"La división no es posible porque el divisor es 0");
        }
    }
    
}
