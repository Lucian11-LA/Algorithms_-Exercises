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
public class temperaturaLuanda {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Digite a temperatura: ");
        int temperatura = input.nextInt();
        
        if(temperatura<10){
            System.out.println("Muito Frio");
        }else if(temperatura>10 && temperatura<17){
            System.out.println("Frio");
        }else if(temperatura>17 && temperatura<23){
            System.out.println("Bom tempo");
        }if(temperatura>27){
            System.out.println("Perigo de exposição de calor");
        }
    }
    
}
