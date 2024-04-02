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
public class Vetores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double[] numeros = new double[20];
        
        int reverso = 20;
        for (int i = 0; i < 10; i++) {
            double n = input.nextDouble();
            numeros[i] = n;
            numeros[reverso-1] = n;
            reverso--;
        }
        
        System.out.println(" ");
        for(double i: numeros){
            System.out.println(i);
        }
        
        
    }
    
}
