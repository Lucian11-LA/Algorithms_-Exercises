#include <stdio.h>
#include<stdlib.h>

/*----------------------------
*Autor: Luciano Alfredo
*Email: 20221102@isptec.co.ao
*
*-----------------------------
*Este programa verifica se um numero e maior, menor ou igual a dois
*
*-------------------------------
*/


int main(){
    int num;
    
    printf("\nDigite um numero: ");
    scanf("%d",&num);

    if(num>2){

        printf("\n %d maior que dois \n",num);

    }else if(num==2){
        
        printf("\n %d igual a dois \n",num);

    }else{
        printf("\n %d menor que dois \n",num);
    }
    
    return 0;
}
