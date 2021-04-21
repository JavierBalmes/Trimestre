/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
        Scanner leer = new Scanner(System.in);
        String text=null;
        int hora;

        System.out.println("Escribe la hora para saber tu horario");
        hora = leer.nextInt();
        
        if(hora <= 24){
       switch (hora) {
           case 0:
               text="dormir";
               break;
           case 1:
               text="dormir";
               break;
           case 2:
               text="dormir";
               break;    
           case 3:
               text="dormir";
               break;    
           case 4:
               text="dormir";
               break;       
           case 5:
               text="dormir";
               break;
           case 6:
               text="Despertarse";
               break;
           case 7:
               text="lavarse los dientes y arreglarse";
               break;
           case 8:
               text="entrar a clases en linea";
               break;
            case 9:
               text="Estar en clases;
               break;
            case 10:
               text="Estar en clases";
               break; 
            case 11:
               text="estar en clases";
               break;
            case 12:
               text="estar en clases";
               break;
            case 13:
               text="estar en clases";
               break;
            case 14:
               text="comer";
               break;
            case 15:
               text="estudiar y leer un poco";
               break;
            case 16:
               text="hacer ejercicio";
               break; 
            case 17:
               text="hacer ejercicio";
               break;
            case 18:
               text="estar en la computadora jugnado lol";
               break;
            case 19:
               text="estar en la computadora jugando lol";
               break; 
            case 20:
               text="estar en la computadora jugando lol";
               break;
            case 21:
               text="cenar";
               break;
            case 22:
               text="estar en la computadora jugando lol";
               break;
            case 23:
               text="estar en el telefono hasta dormirse";
               break;
            case 24:
               text="dormir";
               break;
             
       }
    }
    
}
