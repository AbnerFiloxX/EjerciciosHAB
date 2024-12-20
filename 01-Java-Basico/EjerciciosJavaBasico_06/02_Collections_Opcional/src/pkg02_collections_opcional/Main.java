
package pkg02_collections_opcional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear el ArrayList de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Crear 10 productos
        productos.add(new Producto(1, "Teléfono", "Samsung", "Electrónica", 200.0, 300.0, 10));
        productos.add(new Producto(2, "Laptop", "HP", "Computación", 500.0, 700.0, 5));
        productos.add(new Producto(3, "Auriculares", "Sony", "Accesorios", 30.0, 60.0, 25));
        productos.add(new Producto(4, "Cargador", "Anker", "Accesorios", 10.0, 20.0, 50));
        productos.add(new Producto(5, "Tablet", "Apple", "Electrónica", 300.0, 450.0, 8));
        productos.add(new Producto(6, "Smartwatch", "Garmin", "Accesorios", 150.0, 250.0, 15));
        productos.add(new Producto(7, "Monitor", "Dell", "Computación", 100.0, 150.0, 30));
        productos.add(new Producto(8, "Teclado", "Logitech", "Accesorios", 25.0, 40.0, 60));
        productos.add(new Producto(9, "Mouse", "Razer", "Accesorios", 20.0, 35.0, 45));
        productos.add(new Producto(10, "Cable USB", "Belkin", "Accesorios", 5.0, 10.0, 100));

        // a) Mostrar todos los productos
        System.out.println("Productos en el inventario:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // b) Determinar el producto con el mayor precio de venta
        Producto productoMayorPrecioVenta = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecioVenta.getPrecioVenta()) {
                productoMayorPrecioVenta = producto;
            }
        }
        System.out.println("\nProducto con mayor precio de venta: " + productoMayorPrecioVenta);

        // c) Determinar el producto con el menor precio de costo
        Producto productoMenorPrecioCosto = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < productoMenorPrecioCosto.getPrecioCosto()) {
                productoMenorPrecioCosto = producto;
            }
        }
        System.out.println("\nProducto con menor precio de costo: " + productoMenorPrecioCosto);

        // d) Borrar el producto en la posición 5
        if (productos.size() > 5) {
            productos.remove(5);
            System.out.println("\nProducto en la posición 5 ha sido eliminado.");
        }

        // e) Determinar el producto con la mayor cantidad en stock y descontarle 3 unidades
        Producto productoMayorStock = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getCantidadEnStock() > productoMayorStock.getCantidadEnStock()) {
                productoMayorStock = producto;
            }
        }
        productoMayorStock.setCantidadEnStock(productoMayorStock.getCantidadEnStock() - 3);
        System.out.println("\nProducto con mayor cantidad en stock: " + productoMayorStock);
        System.out.println("Nuevo stock de este producto: " + productoMayorStock.getCantidadEnStock());

        // f) Mostrar el inventario final
        System.out.println("\nInventario final:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}

