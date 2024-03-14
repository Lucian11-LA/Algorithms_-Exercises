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

public class estruturas_De_Cotrolo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o sinal (Verde - Vermelho - Laranja): ");
        String sinal = input.nextLine();
        
        sinal = sinal.toLowerCase(Locale.ITALY);
        
        if(sinal.equals("verde")){
            System.out.println("Avançar");
        }else if(sinal.equals("amarelo")){
            System.out.println("Abrandar");
        }else if(sinal.equals("vermelho")){
            System.out.println("Parar");
        }else{
            System.out.println("Sinal desconhecido!");
        }
        
    }
    
}
