/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1if;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Actividad1if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aActual, aLeer;
        System.out.println("Ingresar el año");
        aActual = 2021;
        aLeer = leer.nextInt();
        
        if (aLeer < aActual ) {
            System.out.println("Han pasado " + (aActual - aLeer) + "años");
        } else  {
            if (aLeer > aActual) {
                System.out.println("Faltan " + (aLeer - aActual ) + " años");
            } else {
                if (aLeer == aActual) {
                    System.out.println("El año que buscas es el actual");
                }
            }            
                           
                    }
                
        
        
        
    }
    
}
