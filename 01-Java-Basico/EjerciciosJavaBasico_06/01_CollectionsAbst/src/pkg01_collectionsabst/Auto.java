
package pkg01_collectionsabst;

public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private int autonomia;

    public Auto(String id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando la batería del auto eléctrico...");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Capacidad de Batería: %d mAh, Autonomía: %d hs", capacidadBateria, autonomia);
    }
}

