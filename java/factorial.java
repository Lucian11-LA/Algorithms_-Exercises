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

public class factorial {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero = input.nextInt();
        int factorial = 1;
        
        for(int i = 1;i<=numero; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial: "+factorial);
        
        factorial = 1;
        int i  = 1;
        while(i<=numero)
        {
            factorial = factorial * i;
            i++;
        }
        
        System.out.println("Factorial: "+factorial);
    }
    
}
