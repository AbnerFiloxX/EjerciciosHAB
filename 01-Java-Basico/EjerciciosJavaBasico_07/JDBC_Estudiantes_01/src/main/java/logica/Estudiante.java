
package logica;




public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private float calificacion;

    // Constructor
    public Estudiante(int id, String nombre, int edad, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
