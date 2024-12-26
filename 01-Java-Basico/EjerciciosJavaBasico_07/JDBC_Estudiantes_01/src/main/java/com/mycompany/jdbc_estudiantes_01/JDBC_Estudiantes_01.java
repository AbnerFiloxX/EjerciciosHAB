
package com.mycompany.jdbc_estudiantes_01;

/*public class JDBC_Estudiantes_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}*/




import persistencia.EstudianteDAO;
import java.util.Scanner;
import logica.Estudiante;

public class JDBC_Estudiantes_01 {
    public static void main(String[] args) {
        EstudianteDAO dao = new EstudianteDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    scanner.nextLine(); // Consumir salto de línea
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Calificación: ");
                    float calificacion = scanner.nextFloat();
                    dao.agregarEstudiante(new Estudiante(0, nombre, edad, calificacion));
                    System.out.println("Estudiante agregado.");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Estudiantes ---");
                    for (Estudiante estudiante : dao.obtenerEstudiantes()) {
                        System.out.printf("ID: %d, Nombre: %s, Edad: %d, Calificación: %.2f%n",
                                estudiante.getId(), estudiante.getNombre(),
                                estudiante.getEdad(), estudiante.getCalificacion());
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
