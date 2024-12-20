
package pkg01_collectionsabst;

public class Camioneta extends Vehiculo implements Combustion {
    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(String id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta...");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Capacidad del Tanque: %d L, Consumo: %.2f L/100km", capacidadTanque, consumoCombustible);
    }
}

