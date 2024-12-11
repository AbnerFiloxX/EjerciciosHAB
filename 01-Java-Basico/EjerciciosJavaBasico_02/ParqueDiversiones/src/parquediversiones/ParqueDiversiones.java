
package parquediversiones;

import java.util.Scanner;


public class ParqueDiversiones {

   
    public static void main(String[] args) {
        
        int LIMITE_PESO = 100;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos para verificar si puede subir a la atracción:");
        
        
        double peso = teclado.nextDouble();
        
        if (peso <= LIMITE_PESO) {
            System.out.println("¡Puede subir a la atracción! Disfrute el paseo.");
        } else {
            
            double exceso = peso - LIMITE_PESO;
            
            if (exceso <= 5) {
                
                System.out.println("Ándele pues necio, lo dejaré subir pero se pasa por " + exceso + " kg.");
            } else {
                
                System.out.println("Lo sentimos, no puede subir a la atracción.");
                System.out.println("Excede el límite permitido por " + exceso + " kg.");
            }
        }
        
    }
    
}
