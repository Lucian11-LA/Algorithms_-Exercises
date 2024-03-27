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
public class QuadradoPerfeito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int soma = 0;
        
        int cont = 1;
        
        while(soma<n){
            soma +=cont;
            cont = cont+2;
        }
        
        if(soma==n){
            System.out.println("Quadrado perfeito");
        }else{
            System.out.println("Quadrado n perfeito");
        }
                
    }
        
         
}
