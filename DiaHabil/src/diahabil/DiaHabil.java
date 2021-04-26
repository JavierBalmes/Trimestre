/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class DiaHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce un día de la semana, sin tildes");
        String dia = leer.nextLine();
        if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("Dia Inhabil");
        } else if("lunes".equals(dia) || "martes".equals(dia) || "miercoles".equals(dia) || "jueves".equals(dia) || "viernes".equals(dia)){
            System.out.println("Dia Hábil");
        } else {
            System.out.println("Introduce un dia de la semana correcto");
            
        }
        
      
        
                
    }
    
}
