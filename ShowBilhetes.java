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
public class ShowBilhetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Escolha o show: ");
        System.out.println("(1) - Tao Tui --15000 kz -- 03/04/2023 21:0");
        System.out.println("(2) - Mini Band e os Amigos -- 3500 kz -- 04/04/2023 17:0");
        System.out.println("(3) - Kalê -- 5000 kz -- 12/04/2023 18:0");
        System.out.println("(4 )- Kalê -- 5000 kz 12/04/2023 18:0");
        int op = input.nextInt();
        
        switch (op) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
