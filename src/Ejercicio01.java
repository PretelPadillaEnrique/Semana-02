
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-USR-LN6377-A0507
 */
public class Ejercicio01 {
    public static void main (String[] args){
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese el resultado de la"
                +"evaluacion (0-10)");
        int evaluacion=lector.nextInt();
         String mensaje="";
           switch(evaluacion){
               case 0:
               case 1: case 2: case 3: case 4:
                   mensaje="descartado";
                   break;
               case 5:
                   mensaje="suspenso";
                   break;
               case 6:
                   mensaje="aceptable";
                   break;
               case 7,8:
                   mensaje="notable";
                   break;
               case 9,10:
                   mensaje="sobresaliente";
                   break;
               default:
                   mensaje="OPCION INCORRECTA";
        }
    System.out.printf("La calificacion es %S \n", mensaje );
                
                
    }
    
}
