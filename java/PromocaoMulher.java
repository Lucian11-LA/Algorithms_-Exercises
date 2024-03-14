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
public class PromocaoMulher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        
        System.out.print("Digite o sexo(Masculino/Femenino): ");
        String sexo = input.nextLine();
        
        System.out.print("Digite o valor das compras: ");
        double valor = input.nextDouble();
        
        sexo = sexo.toLowerCase();
        
        if(sexo.equals("femenino")){
            double d = (valor*0.13);
            double desconto = valor -d;
            System.out.println("A cliente "+nome+" um desconto de "+d+" no seu valor de compra de "+valor+" o que vale "+desconto);
        }else{
            double d = (valor*0.05);
            double desconto = valor -d;
            System.out.println("O cliente "+nome+" um desconto de "+d+" no seu valor de compra de "+valor+" o que vale "+desconto);
        }
        
    }
    
}
