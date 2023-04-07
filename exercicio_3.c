#include <stdio.h>
#include <stdlib.h>

/*----------------------------
*Autor: Luciano Alfredo
*Email: 20221102@isptec.co.ao
*
*-----------------------------
*Este programa converte a idade de uma pessoa em dia, meses, e horas
*
*-------------------------------
*/

int main(){
    int idade,idadeEmMeses,idadeEmDias,idadeEmHoras;
    printf("\n\n\t\t\t********************************\n");
    printf("\n\n\t\t\t\tConverter idade*\n\n");    
    printf("\n\n\t\t\t********************************\n\n");
    
    printf("\n\t\t\t\t Digite a sua idade: ");
    scanf("%d",&idade);

    idadeEmMeses = idade*12;
    idadeEmDias = idadeEmMeses*30;
    idadeEmHoras = idadeEmDias*24;

    printf("\n\t\t\t\tA  sua idade: %d \n",idade);
    printf("\n\t\t\t\tA  sua idade em meses: %d \n",idadeEmMeses);
    printf("\n\t\t\t\tA  sua idade em dias: %d \n",idadeEmDias);
    printf("\n\t\t\t\tA  sua idade em horas: %d \n",idadeEmHoras);
    

    return 0;
}
