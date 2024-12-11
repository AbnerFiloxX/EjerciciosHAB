package clasificacionnotas;

import java.util.Scanner;


public class ClasificacionNotas {

   
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante (0-100):");
        double nota = teclado.nextDouble();

        
        if (nota < 60) {
            System.out.println("Rendimiento: Insuficiente");
        } else if (nota >= 60 && nota <= 80) {
            System.out.println("Rendimiento: Bueno");
        } else if (nota >= 81 && nota <= 90) {
            System.out.println("Rendimiento: Notable");
        } else if (nota >= 91 && nota <= 100 ) {
            System.out.println("Rendimiento: Excelente");
        } else if (nota > 100) {
            System.out.println("Rendimiento: Geniooo,ya no te esfuerces tanto");
        } 

        
    }
    
}
