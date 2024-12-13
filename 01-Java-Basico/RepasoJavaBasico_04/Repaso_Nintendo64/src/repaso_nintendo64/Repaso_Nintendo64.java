
package repaso_nintendo64;

public class Repaso_Nintendo64 {

    public static void main(String[] args) {
       // Crear un vector para almacenar 5 videojuegos
        VideoJuego[] videojuegos = new VideoJuego[5];

        // Crear 5 videojuegos y guardarlos en el vector
        videojuegos[0] = new VideoJuego(1, "Super Mario 64", "Nintendo 64", 1, "Plataformas");
        videojuegos[1] = new VideoJuego(2, "The Legend of Zelda: Ocarina of Time", "Nintendo 64", 1, "Aventura");
        videojuegos[2] = new VideoJuego(3, "GoldenEye 007", "Nintendo 64", 4, "Disparos");
        videojuegos[3] = new VideoJuego(4, "FIFA 22", "PlayStation 5", 2, "Deportes");
        videojuegos[4] = new VideoJuego(5, "Minecraft", "PC", 4, "Aventura");

        // Recorrer el vector y mostrar el título, consola y cantidad de jugadores
        System.out.println("Videojuegos almacenados:");
        for (VideoJuego v : videojuegos) {
            System.out.println("Título: " + v.getTitulo() + ", Consola: " + v.getConsola() + ", Jugadores: " + v.getCantidadJugadores());
        }

        // Cambiar el título y cantidad de jugadores de dos videojuegos
        System.out.println("\nCambiando datos de videojuegos...");
        videojuegos[0].setTitulo("Super Mario Galaxy");
        videojuegos[0].setCantidadJugadores(2);

        videojuegos[4].setTitulo("Minecraft Dungeons");
        videojuegos[4].setCantidadJugadores(1);

        // Mostrar los datos actualizados de todos los videojuegos
        System.out.println("\nVideojuegos luego del cambio:");
        for (VideoJuego v : videojuegos) {
            System.out.println("Título: " + v.getTitulo() + ", Consola: " + v.getConsola() + ", Jugadores: " + v.getCantidadJugadores());
        }

        // Mostrar únicamente los videojuegos de la consola "Nintendo 64"
        System.out.println("\nVideojuegos de la consola Nintendo 64:");
        boolean encontrado = false;
        for (VideoJuego v : videojuegos) {
            if ("Nintendo 64".equals(v.getConsola())) {
                System.out.println("Título: " + v.getTitulo() + ", Jugadores: " + v.getCantidadJugadores());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron videojuegos para la consola Nintendo 64.");
        }
    }
    
}
