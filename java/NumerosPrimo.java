/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1err;

import java.util.Scanner;

/**
 *
 * @author FORMAÇÃO
 */
public class NumerosPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         int n = input.nextInt();
         
         int cont  = 1;
         
         while(cont<n){
             int divi = 0;
             for(int i=1; i<=cont; i++){
                 if(cont%i==0){
                     divi++;
                 }
             } 
             if(divi==2){
                 System.out.print(" "+cont);
             }
             cont++;
         }
    }
    
}
