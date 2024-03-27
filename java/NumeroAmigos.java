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
public class NumeroAmigos {

    /**
     * @param args the command line arguments
     */
    public static int somaDivisores(int num){
        
        int cont=1;
        int soma = 0;
        while(cont<num){
            if(num%cont==0){
                soma += cont;
            }
            cont++;
        }
        return soma;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         int n1 = input.nextInt();
         int n2 = input.nextInt();
         
        
         
         if(somaDivisores(n1)==n2 && somaDivisores(n2)==n1){
             System.out.println("Os numero são amigos! ");
         }else{
             System.out.println("Os numeros não são amigos!");
         }
         
         
    }
    
}
