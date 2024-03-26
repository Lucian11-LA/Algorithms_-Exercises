/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1err;

/**
 *
 * @author FORMAÇÃO
 */
  

import java.util.Scanner;

public class Radiotivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        float massa = input.nextFloat();
        
        int tempo = 0;
        
        while(massa>=0.8){
            
            if((tempo+1)%110==0){
                massa = massa/2;
            }
            tempo++;
            
        }
        
        System.out.println("Massa final: "+massa);
        System.out.println("Tempo final: "+tempo);
    }
    
}
