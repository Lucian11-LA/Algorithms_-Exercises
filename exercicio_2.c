#include <stdio.h>
#include <stdlib.h>
/**
*Este programa calcula o quociente e o resto da divisao entre dois numeros 
*
*
*
**/


int main(){

    int num1,num2;
    int resto,quociente;

    printf("\n\n\t\tRESTO E QUOCIENTE ENTRE DOIS NUMEROS ");
    printf("\n\n\t\tDgite um numero: ");
    scanf("%d",&num1);
    printf("\n\n\t\tDgite um outro numero: ");
    scanf("%d",&num2);

    
    quociente = num1/num2;
    resto = num1%num2;


    printf("\n\t\t O quociente entre %d e %d = %d\n",num1,num2,quociente);
    printf("\n\t\t O resto entre %d e %d = %d\n",num1,num2,resto);    

    return 0;
}
