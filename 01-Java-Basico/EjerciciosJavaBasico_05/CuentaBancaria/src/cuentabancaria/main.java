
package cuentabancaria;

// Clase que contiene el método main para probar CuentaBancaria
public class Main {
    public static void main(String[] args) {
        // Crear un objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.50, 12345678);

        // Acceder al método get de cada atributo y mostrar valores
        System.out.println("Titular: " + cuenta.getTitular());
        // System.out.println("Saldo: " + cuenta.getSaldo()); // Comentado porque getSaldo es privado
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
    }
}
