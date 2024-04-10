
package com.mycompany.vetoresematrizes;

import java.util.Scanner;


public class matriz5x5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = input.nextInt();
                matriz[i][j] = n;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.print("\n");
        }
        
        int contePares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                if(matriz[i][j]%2==0){
                    contePares++;
                }
            }
        }
        
        System.out.println("Na matriz tem "+contePares+" valores pares");
    }
    
}
