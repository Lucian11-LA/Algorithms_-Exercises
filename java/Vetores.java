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
public class Vetores {

    
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          int[] numeros  = new int[10];
            
          for (int i = 0; i < 10; i++) {
              
              int n = input.nextInt();
              
              numeros[i] = n;     
            
        }
          
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i : numeros) {
            if(i>maior){
                maior = i;
            }else if(i<menor){
                menor = i;
            }
        }
        System.out.println(" ");
        System.out.println(maior);
        System.out.println(" ");
        System.out.println(menor);
        
          
          
          
    }
    
}
