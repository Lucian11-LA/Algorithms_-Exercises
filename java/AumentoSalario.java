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
public class AumentoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a avaliação(Excelente,Bom,Mau): ");
        String avaliacao = input.nextLine();
        
        System.out.print("Digite o Salario mensal: ");
        double salario = input.nextDouble();
        
        
        avaliacao = avaliacao.toLowerCase();
        
        double salarioFinal = 0;
        
        if(avaliacao.equals("bom")){
            salarioFinal = salario +(salario*0.04);
        }else if(avaliacao.equals("excelente")){
             salarioFinal = salario +(salario*0.06);
        }else if(avaliacao.equals("mau")){
            salarioFinal = salario +(salario*0.015);
        }
        
        System.out.println("O salario final é: "+salarioFinal);
    }
    
}
