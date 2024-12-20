
package pkg02_collections_opcional;

public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int cantidadEnStock;

    // Constructor
    public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int cantidadEnStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Métodos getter
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    // Métodos setter
    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método toString para mostrar la información del producto
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo +
               ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", cantidadEnStock=" + cantidadEnStock + "]";
    }
}

