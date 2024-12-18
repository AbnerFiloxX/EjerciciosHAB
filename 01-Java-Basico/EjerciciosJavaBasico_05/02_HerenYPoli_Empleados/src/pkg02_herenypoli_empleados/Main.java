package pkg02_herenypoli_empleados;

// Clase base Empleado
class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular salario
    public double calcularSalario() {
        System.out.println("Debe elegir el tipo de empleado para calcular salario");
        return 0;
    }

    // Método que devuelve una descripción básica del puesto
    public String getDescripcion() {
        return "Empleado general con responsabilidades básicas";
    }
}

// Clase hija EmpleadoDependencia que hereda de Empleado
class EmpleadoDependencia extends Empleado {
    private double bono;

    public EmpleadoDependencia(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    // Sobreescribimos el método calcularSalario para incluir el bono
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    // Sobreescribimos el método getDescripcion para incluir el bono
    @Override
    public String getDescripcion() {
        return "Empleado de dependencia con un bono de: " + bono;
    }
}

// Clase hija EmpleadoPorHora que hereda de Empleado
class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Sobreescribimos el método calcularSalario para calcular salario por hora
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    // Sobreescribimos el método getDescripcion para especificar que es un empleado por hora
    @Override
    public String getDescripcion() {
        return "Empleado por hora con tarifa de " + tarifaPorHora + " por hora";
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de tipo Empleado con 5 posiciones
        Empleado[] empleados = new Empleado[5];

        // Agregar empleados al arreglo
        empleados[0] = new EmpleadoDependencia("Juan Pérez", 5000, 1000);
        empleados[1] = new EmpleadoPorHora("Ana Gómez", 0, 160, 20);
        empleados[2] = new EmpleadoDependencia("Carlos Díaz", 4500, 800);
        empleados[3] = new EmpleadoPorHora("María López", 0, 120, 15);
        empleados[4] = new EmpleadoDependencia("Pedro Fernández", 6000, 1200);

        // Recorrer el arreglo de empleados y mostrar sus datos
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("Descripción: " + empleado.getDescripcion());
            System.out.println();
        }
    }
}
