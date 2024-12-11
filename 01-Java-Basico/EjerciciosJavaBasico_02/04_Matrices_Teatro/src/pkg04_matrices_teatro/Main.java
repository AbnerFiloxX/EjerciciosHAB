
package pkg04_matrices_teatro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       char asientos [][]= new char[5][5];
       
       for(int i=0;i<asientos.length;i++){
           for(int j=0;j<asientos[i].length;j++){
               asientos[i][j]='O';
           }
       }
      boolean continuar=true;
      
      while(continuar){
          System.out.println("asientos: ");
           for(int i=0;i<asientos.length;i++){
           for(int j=0;j<asientos[i].length;j++){
               System.out.print(asientos[i][j]+" ");
           }
               System.out.println("");
       }
           System.out.println("Ingresa el numero de fila(1-5): ");
           int fila = teclado.nextInt();
           System.out.println("ingresa el numero de columna(1-5)");
           int columna = teclado.nextInt();
           
           if(fila>=1 && fila <= 5 && columna >=1 && columna <=5){
               if(asientos[fila-1][columna-1]=='O'){
                   asientos[fila-1][columna-1]='X';
                   System.out.println("reserva exitosa");
               }else{
                   System.out.println("ya esta ocupado brou,elige otro");
               }
           }else{
               System.out.println("no existe ese asiento brou,debe ser entre 1 y 5");
           }
           System.out.println("aun quieres realizar otra reserva?(s/n): ");
           String respuesta = teclado.next();
           if(respuesta.equals("s") || respuesta.equals("S")){
           continuar=true;
           }else{
           continuar=false;
           }
      }
        System.out.println("estos son los asientos actualizados");
        for(int i=0;i<asientos.length;i++){
           for(int j=0;j<asientos[i].length;j++){
               System.out.print(asientos[i][j]+" ");
           }
               System.out.println("");
       }
        System.out.println("gracias,los ha atendido AbnercitoOnner");
    }
}
