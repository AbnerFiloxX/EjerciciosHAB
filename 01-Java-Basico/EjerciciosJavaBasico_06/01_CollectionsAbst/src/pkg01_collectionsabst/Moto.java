
package pkg01_collectionsabst;

public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto...");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Cilindrada: %d cc, Tipo de Motor: %s", cilindrada, tipoMotor);
    }
}

