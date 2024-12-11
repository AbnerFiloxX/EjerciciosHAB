package ejemploif;

import java.util.Scanner;

public class EjemploIf {

    public static void main(String[] args) {
       //quiero avisar si una persona es mayor de edad o no (mayor de edad es quien tiene 18 años o mas)
        System.out.println("ingrese su edad para saber si es mayor");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        
        if(edad>=18){
            System.out.println("eres mayor de edad");
        }else{
            System.out.println("no eres mayor de edad");
        }
        }
    }
    

