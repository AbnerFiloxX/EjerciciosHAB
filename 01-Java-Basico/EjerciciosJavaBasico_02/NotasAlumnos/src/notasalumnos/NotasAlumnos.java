
package notasalumnos;

import java.util.Scanner;

public class NotasAlumnos {

    public static void main(String[] args) {
       
        double[][] notas = new double[4][4]; 
        
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese las notas del Alumno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble(); 
            }
            
            
            double sumaNotas = notas[i][0] + notas[i][1] + notas[i][2];
            notas[i][3] = sumaNotas / 3; 
        }

        System.out.println("");
        System.out.println("Notas de los alumnos:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nota 1: " + notas[i][0] + ", Nota 2: " + notas[i][1] + ", Nota 3: " + notas[i][2]);
            System.out.println("Promedio: " + notas[i][3]);
            //System.out.println();
        }
    }
    
}
