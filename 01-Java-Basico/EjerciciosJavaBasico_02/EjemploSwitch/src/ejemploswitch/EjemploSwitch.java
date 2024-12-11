
package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {


    public static void main(String[] args) {
        System.out.println("ingrese un numero del 1 al 7 para saber que dia de la semana es");
        Scanner teclado= new Scanner (System.in);
        
        int dia = teclado.nextInt();
        switch(dia){
            case 1: System.out.println("el dia es lunes");
            break;
            case 2: System.out.println("el dia es martes");
            break;
            case 3: System.out.println("el dia es miercoles");
            break;
            case 4: System.out.println("el dia es jueves");
            break;
            case 5: System.out.println("el dia es viernes");
            break;
            case 6: System.out.println("el dia es sabado");
            break;
            case 7: System.out.println("el dia es domingo pa mimir");
            break;
            default: System.out.println("ingreso un numero no valido");
            break;
        }
    }
    
}
