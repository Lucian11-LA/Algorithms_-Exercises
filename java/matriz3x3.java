
package com.mycompany.vetoresematrizes;

import java.util.*;

public class matriz3x3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                int n = input.nextInt();
                matriz[i][j] = n;
            }
        }
        
        for(int i=0;i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("\n");
        }
        
        int soma = 0;
        for(int i=0;i<3; i++){
            soma = 0;
            for(int j=0;j<3;j++){
                soma += matriz[i][j];
            }
            System.out.println("Soma Linha "+(i+1)+": "+soma);
        }
    }
    
}
