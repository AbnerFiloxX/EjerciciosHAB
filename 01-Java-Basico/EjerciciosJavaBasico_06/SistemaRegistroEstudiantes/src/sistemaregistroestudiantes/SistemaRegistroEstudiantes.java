
package sistemaregistroestudiantes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaRegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Double> registroEstudiantes = new HashMap<>();

        int opcion;

        do {
            System.out.println("\n=== Sistema de Registro de Estudiantes y Notas ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante por matrícula");
            System.out.println("3. Buscar estudiantes por promedio");
            System.out.println("4. Mostrar todos los registros");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante(scanner, registroEstudiantes);
                    break;
                case 2:
                    buscarPorMatricula(scanner, registroEstudiantes);
                    break;
                case 3:
                    buscarPorPromedio(scanner, registroEstudiantes);
                    break;
                case 4:
                    mostrarRegistros(registroEstudiantes);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
            }
        } while (opcion != 5);
    }

    // Método para agregar un estudiante
    public static void agregarEstudiante(Scanner scanner, HashMap<Integer, Double> registro) {
        System.out.print("Ingrese el número de matrícula del estudiante: ");
        int matricula = scanner.nextInt();

        if (registro.containsKey(matricula)) {
            System.out.println("Error: La matrícula ya existe en el sistema.");
            return;
        }

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        registro.put(matricula, promedio);
        System.out.println("Estudiante agregado exitosamente.");
    }

    // Método para buscar un estudiante por matrícula
    public static void buscarPorMatricula(Scanner scanner, HashMap<Integer, Double> registro) {
        System.out.print("Ingrese el número de matrícula a buscar: ");
        int matricula = scanner.nextInt();

        if (registro.containsKey(matricula)) {
            System.out.println("Matrícula: " + matricula + " | Promedio: " + registro.get(matricula));
        } else {
            System.out.println("No se encontró un estudiante con esa matrícula.");
        }
    }

    // Método para buscar estudiantes por promedio
    public static void buscarPorPromedio(Scanner scanner, HashMap<Integer, Double> registro) {
        System.out.print("Ingrese el promedio a buscar: ");
        double promedioBuscado = scanner.nextDouble();
        boolean encontrado = false;

        for (Map.Entry<Integer, Double> entry : registro.entrySet()) {
            if (entry.getValue().equals(promedioBuscado)) {
                System.out.println("Matrícula: " + entry.getKey() + " | Promedio: " + entry.getValue());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron estudiantes con ese promedio.");
        }
    }

    // Método para mostrar todos los registros
    public static void mostrarRegistros(HashMap<Integer, Double> registro) {
        if (registro.isEmpty()) {
            System.out.println("No hay estudiantes registrados aún.");
            return;
        }

        System.out.println("=== Lista de Estudiantes Registrados ===");
        for (Map.Entry<Integer, Double> entry : registro.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + " | Promedio: " + entry.getValue());
        }
    }
}
