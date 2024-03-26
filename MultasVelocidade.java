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
public class MultasVelocidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a velocidade do carro-->");
        int velocidade = input.nextInt();
        
        if(velocidade>80){
            
            int multa = (5000)*(velocidade-80);
            
            System.out.println("Acima da velocidade. Recebeu uma multa de "+multa+" kz");
        }else{
            System.out.println("Não está acima da velocidade!");
        }
    }
    
}
