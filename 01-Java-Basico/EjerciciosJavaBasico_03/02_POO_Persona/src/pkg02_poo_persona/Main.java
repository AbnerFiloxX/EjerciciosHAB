package pkg02_poo_persona;

public class Main {
    public static void main(String[] args) {
        // a) Crear un vector de tipo Persona con 5 posiciones
        Persona[] personas = new Persona[5];

        // Crear 5 personas y guardarlas en el vector
        personas[0] = new Persona(1, "Carlos", 25, "Calle 1", "123456789");
        personas[1] = new Persona(2, "Ana", 35, "Calle 2", "987654321");
        personas[2] = new Persona(3, "Pedro", 40, "Calle 3", "112233445");
        personas[3] = new Persona(4, "María", 30, "Calle 4", "998877665");
        personas[4] = new Persona(5, "Luis", 28, "Calle 5", "556677889");

        // b) Recorrer el vector y mostrar el nombre y edad de cada persona
        System.out.println("Datos de todas las personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        // c) Cambiar el nombre de dos personas
        // Mostrar por pantalla el antes
        System.out.println("\nAntes del cambio:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());

        // Cambiar los nombres
        personas[0].setNombre("Carlos Eduardo");
        personas[1].setNombre("Ana María");

        // Mostrar por pantalla el después
        System.out.println("\nDespués del cambio:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());

        // d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor a 30
        System.out.println("\nPersonas con edad mayor a 30:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}
