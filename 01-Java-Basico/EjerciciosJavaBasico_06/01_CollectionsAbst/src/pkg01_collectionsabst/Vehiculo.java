
package pkg01_collectionsabst;

public abstract class Vehiculo {
    protected String id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double costo;

    public Vehiculo(String id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public abstract int calcularAntiguedad();

    public String toString() {
        return String.format("ID: %s, Placa: %s, Marca: %s, Modelo: %s, Año: %d, Costo: %.2f",
                id, placa, marca, modelo, anio, costo);
    }
}



