
package pkg01_collectionsabst;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear objetos
        vehiculos.add(new Auto("1", "ABC123", "Tesla", "Model 3", 2020, 45000, 75000, 12));
        vehiculos.add(new Camioneta("2", "DEF456", "Ford", "Ranger", 2018, 30000, 80, 10.5));
        vehiculos.add(new Moto("3", "GHI789", "Yamaha", "YZF-R3", 2021, 7000, 321, "Bicilíndrico"));

        // Mostrar información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }
            System.out.println();
        }
    }
}

