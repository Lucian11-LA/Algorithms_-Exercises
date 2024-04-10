
package com.mycompany.vetoresematrizes;

import java.util.Scanner;

public class matriz5x2 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int[][] matriz = new int[5][2];
         int soma = 0;
         
         for (int i = 0; i <5; i++) {
             for (int j = 0; j <2; j++) {
                 int n = input.nextInt();
                 soma +=n;
                 matriz[i][j] = n;
             }
        }
         float media = soma/(10);
         
         System.out.println("---------------------------------");
         for (int i = 0; i <5; i++) {
             for (int j = 0; j <2; j++) {
                 System.out.print(" "+matriz[i][j]);
             }
             System.out.print("\n");
        }
         System.out.println("---------------------------------");
         
         System.out.println("A média dos valores é: "+media);
         
    }
    
}
