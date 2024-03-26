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
public class Aproveitamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite as notas: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        
        double media = (n1+n2)/2;
        
        if(media>10){
            System.out.println("Bom aproveitamento");
        }else{
            System.out.println("Não teve bom aproveitamento!");
        }
    }
    
}
