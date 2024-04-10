
package com.mycompany.vetoresematrizes;

import java.util.Scanner;

public class matrz4x3 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int[][] matriz = new int[4][3];
       
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
             int n = input.nextInt();
             matriz[i][j] = n;
             
           }
       }
       
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
               System.out.print(" "+matriz[i][j]);
           }
           System.out.print("\n");
       }
       
        System.out.print("Digite um numero: ");
        int n = input.nextInt();
        
        boolean encontrou = false;
        
        for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
             if(matriz[i][j]==n){
                 encontrou = true;
             }
             
           }
       }
        
       if(encontrou){
           System.out.println("O número "+n+" encontra-se na matriz!!");
       }else{
           System.out.println("O número "+n+" não se encontra na matriz!!");
       } 
        
        
    }
    
}
