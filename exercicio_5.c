#include <stdio.h>
#include <stdlib.h>


/*----------------------------
*Autor: Luciano Alfredo
*Email: 20221102@isptec.co.ao
*
*-----------------------------
*Dado o numero de vitorias e derrotas, este programa informa GOOD OR BAD
*
*-------------------------------
*/


int main(){
    
    int vitorias,derrotas;

    printf("\nDigite o numero  de vitorias: ");
    scanf("%d",&vitorias);
    
    printf("\nDigite o numero de derrotas: ");
    scanf("%d",&derrotas);
    
    if(derrotas>vitorias){
        printf("\nBAD");
    
    }else{
        printf("\nGOOD");
    }
    

    return 0;
}
