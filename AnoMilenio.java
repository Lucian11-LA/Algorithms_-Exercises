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

public class AnoMilenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mes: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();
        
        if(ano>=1000 && ano<=1999){
            if(((ano%400)==0 || (ano%4)==0) && !((ano%100)==0)){
                if(mes>=1 && mes<=12){
                    if(mes!=2 && (dia>=1 && dia<=31)){
                        System.out.println("Data Válida");
                    }else if((dia>=1 && dia<=28)){
                         System.out.println("Data Válida");
                    }else{
                        System.out.println("Dia inválido");
                    }
            
                }else{
                    System.out.println("Mes inválido!");
                }
            }else{
                System.out.println("Ano Inválido! O ano deve ser bissexto");
            }
        }else{
            System.out.println("Ano Inválido! ");
        }
        
    }
    
}
