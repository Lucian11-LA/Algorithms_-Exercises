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
public class EmpresaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Genero(Femenino/Masculino): ");
        String genero = input.nextLine();
        System.out.print("Salario Atual: ");
        double salario = input.nextDouble();
        System.out.print("Anos de trabalho: ");
        int anos = input.nextInt();
       
        
        genero = genero.toUpperCase();
        
        double novoSalario = 0;
        
        if(genero.equals("femenino")){
            if(anos<15){
                novoSalario = salario +(salario*0.05);
            }else if(anos>15 && anos<20){
                novoSalario = salario +(salario*0.12);
            }else{
                novoSalario = salario +(salario*0.23);
            }
        }else{
            if(anos<20){
                novoSalario = salario +(salario*0.03);
            }else if(anos>20 && anos<30){
                novoSalario = salario +(salario*0.13);
            }else{
                novoSalario = salario +(salario*0.25);
            }
        
        }
        
        System.out.println("Novo salário: "+novoSalario);
        
    }
    
}
