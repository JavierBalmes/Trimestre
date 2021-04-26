/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la hora en formato de 24 horas para saber tu horario");
        
       int hora = entrada.nextInt();
       
       if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar para arreglarse para clases");
            } else if(hora == 7){
                System.out.println("Entrar a la primera clase");
            } else if(hora >= 8 && hora < 10){
                System.out.println("Entrar a la segunda clase o en caso de que no haya desayunar");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a la tercera clase");
            } else if(hora == 12){
                System.out.println("Tomar la cuarta clase y ultima de dia");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Almorzar y estudiar un poco");
            } else if(hora == 15){
                System.out.println("hacer ejercicio");
            } else if(hora >= 16 && hora < 20 ){
                System.out.println("Jugar lol con amigos ");
            } else if(hora == 20){
                System.out.println("Cenar");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Ver tiktoks mientras me da sueño");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Dormir");
            }
        } else {
            System.out.println("Introduce una hora de 1 a 24 horas");
       }              
    }
}