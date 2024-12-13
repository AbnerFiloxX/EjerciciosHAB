/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_tienda;

/**
 *
 * @author satel
 */
import java.util.Scanner;

public class Repaso_Tienda {

    // Clase Producto
    static class Producto {
        private String nombre;
        private double precio;
        private String categoria;

        public Producto(String nombre, double precio, String categoria) {
            this.nombre = nombre;
            this.precio = precio;
            this.categoria = categoria;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getCategoria() {
            return categoria;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Categoría: " + categoria);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la matriz de productos (3x3)
        Producto[][] estanteria = {
            {new Producto("Manzanas", 10.5, "Frutas"), new Producto("Cereal", 45.0, "Alimentos"), new Producto("Leche", 23.5, "Lácteos")},
            {new Producto("Jabón", 12.0, "Limpieza"), new Producto("Shampoo", 35.0, "Higiene"), new Producto("Pan", 15.0, "Alimentos")},
            {new Producto("Queso", 50.0, "Lácteos"), new Producto("Galletas", 25.0, "Alimentos"), new Producto("Uvas", 30.0, "Frutas")}
        };

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre del producto que desea buscar: ");
            String nombreBuscado = scanner.nextLine();
            boolean encontrado = false;

            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria[i].length; j++) {
                    if (estanteria[i][j].getNombre().equalsIgnoreCase(nombreBuscado)) {
                        System.out.println("Producto encontrado:");
                        estanteria[i][j].mostrarInformacion();
                        System.out.println("Posición: [" + i + "][" + j + "]");
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) break;
            }

            if (!encontrado) {
                System.out.println("El producto no existe en la estantería.");
            }

            System.out.print("¿Desea buscar otro producto? (si/no): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("si");
        }

        System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
        scanner.close();
    }
}

