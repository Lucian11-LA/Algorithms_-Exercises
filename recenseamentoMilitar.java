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
public class recenseamentoMilitar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         System.out.print("Digite a sua idade: ");
         int idade = input.nextInt();
         int tempo;
         
         if(idade>18){
             tempo = idade - 18;
             System.out.println("Já se passaram "+tempo+" anos após o seu recenseamento");
         }else if(idade<18){
             tempo = 18-idade;
             System.out.println("Faltam "+tempo+" anos para o seu  recenseamento");
         }else{
             System.out.println("Efectue o seu recenseamento!");
         }
    }
    
}
