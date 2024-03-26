/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1err;

import java.util.*;

/**
 *
 * @author FORMAÇÃO
 */
public class Advinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        
        int n1 = (int)(1+Math.random()*100);
        
        
     
        int cont = 0;
        System.out.println("N1: "+n1);
        
        
        int n2 = input.nextInt();
        
       
        do{
            int valor = Math.abs(n1-n2);
            
            if(valor>100){
                System.out.println("Frio");
            }else if(valor>=50 && valor<=100){
                System.out.println("Morno");
            }else if(valor<50){
                System.out.println("Quente!");
            }
            cont++;
            n2 = input.nextInt();
            
        }while(n1!=n2);
        
        System.out.println("Tentativas: "+cont);
        System.out.println("N1: "+n1);
        System.out.println("N2: "+n2);
        
      
        
    }
    
}
