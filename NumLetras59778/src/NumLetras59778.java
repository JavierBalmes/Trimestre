
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias
 */
public class NumLetras59778 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, dec, uni;
        String[] unidades = {"cero" , "uno" ,"dos" , "tres" , "cuatro" , "cinco" , "seis" , "siete" , "ocho" , "nueve" };
	String[] decenas = { "diez" , "veinte" , "treinta" , "cuarenta" , "cincuenta" , "sesenta" , "setenta", "ochenta" , "noventa" };
        System.out.println("Ingresa un numero del 1 al 99");
	num = leer.nextInt();
        dec = num / 10;  
        uni = num % 10;
        
        System.out.println( decenas[dec-1] + " y " + unidades[uni]); 
                if (uni == 0) {
                    switch(num) {
                        case 10:
                            System.out.println("diez");
                            break;
                        case 20:
                            System.out.println("veinte");
                            break;
			case 30:
                            System.out.println("treinta");
                            break;
			case 40:
                            System.out.println("cuarenta");
                            break;
			case 50:
                            System.out.println("cincuenta");
                            break;
			case 60:
                            System.out.println("sesenta");
                            break;
			case 70:
                            System.out.println("setenta");
                            break;
			case 80:
                            System.out.println("ochenta");
                            break;
			case 90:
                            System.out.println("noventa");
                            break;
                                        
                    }
                        
                    }
                }    
                          
            
        }
   
    

