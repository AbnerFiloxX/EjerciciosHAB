
package clasificacionarticulos;

import java.util.Scanner;


public class ClasificacionArticulos {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        
        System.out.println("Ingrese el precio del artículo:");
        double precio = teclado.nextDouble();

        
        if (precio < 50) {
            System.out.println("Categoría: Económico");
        } else if (precio >= 50 && precio <= 100) {
            System.out.println("Categoría: Accesible");
        } else if (precio > 100 && precio <= 200) {
            System.out.println("Categoría: Estándar");
        } else if (precio > 200) {
            System.out.println("Categoría: Premium");
        } else {
            System.out.println("Precio inválido.");
        }

        teclado.close(); 
    }
    
}


