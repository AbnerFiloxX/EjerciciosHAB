
package tiposdedatos;

public class TiposDeDatos {

   
    public static void main(String[] args) {
        int edad = 25;
        String nombre = "Abner";
        double altura = 1.75;
        boolean EsVerdadero=true;
       
        
        System.out.println("hola tengo "+ edad + " me llamo " + nombre +" y mido " + altura);
        
        if (nombre== "Abner" ) {
            System.out.println("su nombre es: "+ EsVerdadero );
        } else {
            System.out.println("su nombre es falso");
        }
    }
    
}
