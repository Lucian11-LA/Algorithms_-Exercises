/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1err;

/**
 *
 * @author FORMAÇÃO
 */
import java.util.*;

public class quadradoEcubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int num = input.nextInt();
        
        double cubo = Math.pow(num,3);
        double quadrado = Math.pow(num,2);
        
        System.out.println("Numero: "+num);
        System.out.println("Quadrado: "+quadrado);
        System.out.println("Cubo: "+cubo);
    }
    
}
