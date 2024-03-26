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

public class notasAlunoTernario {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a nota final: ");
        double nota = input.nextDouble();
        
        String resultado = nota >=10 ? "Aprovado" :"Reprovado";
        
        System.out.println("O resultado final: "+resultado);
        
        
    }
    
}
