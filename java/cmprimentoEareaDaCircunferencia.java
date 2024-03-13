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

public class cmprimentoEareaDaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio da circunferencia r: ");
        double raio = input.nextDouble();
        
        double c = 2*Math.PI;
        double a = Math.PI*Math.pow(raio,2);
        
        System.out.println("Comprimento = "+c+" area = "+a);     
    }
    
}
