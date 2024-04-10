
package com.mycompany.vetoresematrizes;


import java.util.*;


public class vetorEArrayList {

    public static boolean testaPrimalidade(int num){
        int total = 0;
        
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                total++;
            }
        }
        
        if(total==2){
           return true;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        }
        return false;
    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> primos = new ArrayList<>();   
      
      int[] vetor = new int[15];
    
        for (int i = 0; i < 15; i++) {
            
            int n = input.nextInt();
            
            vetor[i] = n;
            
            if(testaPrimalidade(n)){
                primos.add(n);
            }
            
            
        }
        
        System.out.println("Valores: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(" "+vetor[i]);
        }
        
        System.out.println("\nPrimos: ");
        System.out.print(primos);
        
        
    }
    
}
