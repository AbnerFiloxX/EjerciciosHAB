package demostracionoplectesc;
import java.util.Scanner;

public class DemostracionOpLectEsc {

    public static void main(String[] args) {
        //escritura
        System.out.println("Hola Abnercito");
        System.out.print("COMO ESTAS");
        System.out.print("???");
        System.out.println("");
        
        //lectura
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        //String nombre = teclado.next();
        String nombreCompleto = teclado.nextLine();
        
        System.out.println("su nombre es: " + nombreCompleto);
    }
    
}
