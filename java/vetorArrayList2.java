
package com.mycompany.vetoresematrizes;

import java.util.*;

public class vetorArrayList2 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        int[] vetor = new int[30];
        int maximo = 30;
        int minimo = 0;
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        Random gerador = new Random();
        
        System.out.println("Lista!");
        for (int i = 0; i < 30; i++) {
            vetor[i] = gerador.nextInt((maximo-minimo)+1);
        }
        
        int n = input.nextInt();
        int cont = 0;
        
        for (int i = 0; i < 30; i++) {
            if(vetor[i]==n){
                cont++;
            }
            numeros.add(vetor[i]);
        }
        
        System.out.println("O número "+n+" aparece "+cont+" vezes");
        System.out.println("Numeros: "+numeros);
       
        
    }
    
}
