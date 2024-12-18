package sistemaVehiculos;




class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo() {}

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
}

// Clase Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto() {}

    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El auto está acelerando");
    }
}

// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    private double cilindrada;

    public Moto() {}

    public Moto(String marca, String modelo, int anio, double cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando");
    }
}


public class SistemaVehiculos {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, 4);
        System.out.println("Auto:");
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Año: " + miAuto.getAnio());
        System.out.println("Puertas: " + miAuto.getCantidadPuertas());
        miAuto.acelerar();

        Moto miMoto = new Moto("Yamaha", "R3", 2021, 321.0);
        System.out.println("\nMoto:");
        System.out.println("Marca: " + miMoto.getMarca());
        System.out.println("Modelo: " + miMoto.getModelo());
        System.out.println("Año: " + miMoto.getAnio());
        System.out.println("Cilindrada: " + miMoto.getCilindrada());
        miMoto.acelerar();
    }
}



