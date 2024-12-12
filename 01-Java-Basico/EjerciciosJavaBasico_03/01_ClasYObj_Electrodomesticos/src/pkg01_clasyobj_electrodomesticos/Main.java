package pkg01_clasyobj_electrodomesticos;


class Electrodomestico {
    private String cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    
    public Electrodomestico(String cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

   
    public Electrodomestico() {
    }

    
    public String getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }
}

public class Main {

    public static void main(String[] args) {
        //a)con parametros
        Electrodomestico e1 = new Electrodomestico("001", "Samsung", "RT50K", 500.5, "Blanco");
        Electrodomestico e2 = new Electrodomestico("002", "LG", "X200", 450.0, "Negro");
        Electrodomestico e3 = new Electrodomestico("003", "Whirlpool", "WRT321", 400.0, "Plata");

        //b)sin parámetros
        Electrodomestico e4 = new Electrodomestico();

        //c)Mostrar con parámetros
        System.out.println("Electrodoméstico 1: Marca: " + e1.getMarca() + ", Modelo: " + e1.getModelo() + ", Consumo: " + e1.getConsumo() + "W");
        System.out.println("Electrodoméstico 2: Marca: " + e2.getMarca() + ", Modelo: " + e2.getModelo() + ", Consumo: " + e2.getConsumo() + "W");
        System.out.println("Electrodoméstico 3: Marca: " + e3.getMarca() + ", Modelo: " + e3.getModelo() + ", Consumo: " + e3.getConsumo() + "W");

        //d)Mostrar sin parámetros
        System.out.println("Electrodoméstico 4 (sin parámetros): Marca: " + e4.getMarca()); // Debería ser null
    }
    
}
