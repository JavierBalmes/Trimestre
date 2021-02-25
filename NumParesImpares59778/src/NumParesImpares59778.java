/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias
 */
public class NumParesImpares59778 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int numero1 = 0;
        int numero2 = 0;
        
        while(total <= 100){
        
        if(total % 2 == 0){
            numero1 = total +numero1;
            
        } else{
            numero2 = total + numero2;
            
        } 
        total++;
           
        }
        System.out.println("pares: " + numero1);
        System.out.println("impares : " +  numero2);
            
                
                
                
    }
    
}
