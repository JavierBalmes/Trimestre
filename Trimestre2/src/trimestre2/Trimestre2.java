/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre2;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Trimestre2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       Trimestre numMes = new Trimestre();
       
       
        System.out.println("Introduce el número de mes");
        numMes.setTrimestre(leer.nextInt());
        System.out.println(numMes.getTrimestre());
    }            
    }
class Trimestre {
    private int numMes;
    private String trimestre;
    public void setTrimestre(int numMes){
        
        this.numMes = numMes;
        
        switch(this.numMes){
            
            case 1: case 2: case 3:
                this.trimestre = "Primer trimestre";
                break;
            case 4: case 5: case 6:
                this.trimestre = "Segundo trimestre";
                break;
            case 7: case 8: case 9:
                this.trimestre = "Tercer trimestre";
                break;
            case 10: case 11: case 12:
                this.trimestre = "Cuarto trimestre";
                break;
            default:
                this.trimestre = "Numero de mes incorrecto, Introduce un numero entre 1 y 12 segun el mes";
                break;
                
            }
        
        }
    public String getTrimestre(){
        return this.trimestre;
    }
}

    

