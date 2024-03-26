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

public class AutomoveisPagamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Tipo de carro(Luxo/Popular): ");
       String tipo = input.nextLine();
       System.out.println("Dias de aluguer: ");
       int dias = input.nextInt();
       System.out.println("Kilometros percorrido: ");
       int km = input.nextInt();
       
       tipo = tipo.toUpperCase();
       
       int total = 0;
       
       if(tipo.equals("luxo")){
           total = (45000*dias);
           
           if(km<=200){
               total = total + (850*dias);
           }else{
               total = total + (550*dias);
           }
           
       }else{
           total = (25000*dias);
           
           if(km<=100){
               total = total + (500*dias);
           }else{
               total = total + (250*dias);
           }
       }
       
        System.out.println("Carro "+tipo+" total a pagar: "+total);
        
                
       
    }
    
}
