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

public class tresNumerosIguaisOuDiferentes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Digite tres numeros: ");
         int n1 = input.nextInt();
         int n2 = input.nextInt();
         int n3 = input.nextInt();
         
         if(n1==n2 && n2==n3){
             System.out.println("Os tres numeros são iguais");
         }else{
             System.out.println("Os tres numeros não são iguais!");
         }
    }
    
}
