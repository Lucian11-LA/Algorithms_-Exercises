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

public class distanciaEuclidiana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pares X e Y: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        System.out.println("Pares X e Y: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        double d = Math.pow(x1, y1)+Math.pow(x2, y2);
        double distancia  = Math.sqrt(d);
        
        System.out.println("A distancia entre os pontos: "+distancia);
    }
    
}
