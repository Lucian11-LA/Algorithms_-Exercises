#include <stdio.h>
#include <stdlib.h>

/*
*Este programa em c, serviu como exercicio da Universidade
*Ele faz o calculo da area e o perimetro de um quadrado tendo em conta um dos seus lados
*
*/

int main(){
    
    float lado, area,perimetro;
    
    printf("\t\tDIGITE O LADO DO QUADRADO: ");
    scanf("%f",&lado);
    
    area = lado*lado;
    perimetro = lado*4;
    
    printf("\t\tA area do quadrado: %.2f\n",area);
    printf("\t\tO perimetro: %.2f\n",perimetro);    
    
    return 0;
}
