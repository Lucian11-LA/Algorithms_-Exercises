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

public class AvaliacaoOpcional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random valor = new Random();
        System.out.print("Inserir nota: ");    
        int nota1 = input.nextInt();
        System.out.print("Inserir a segunda nota: ");
        int nota2 = input.nextInt();
        System.out.print("Inserir a  nota opcional(Se sim insira qualquer nota/ Se não insira um numero negativo:): ");
        int nota3 = input.nextInt();
        
        if(nota1<nota2){
            if(nota2<nota3)
                nota1 = nota3;
        }else{
            if(nota1<nota3)
                nota2 = nota3;
        }
        
        
      
        
        double media = (nota1+nota2)/2;
        
        
        
        
        
        
        System.out.println(" "+nota1+" "+nota2+" "+nota3+" "+": "+media);
        
    
    
    }
    
}
