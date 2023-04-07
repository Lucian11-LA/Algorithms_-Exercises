#include <stdio.h>
#include <stdlib.h>

/*----------------------------
*Autor: Luciano Alfredo
*Email: 20221102@isptec.co.ao
*
*-----------------------------
*Este programa calcula media ponderada entre tre numeros
*O maior reebe o peso 5 o restante 2.5
*-------------------------------
*/


int main(){
    
    float soma,media,n1,n2,n3;

    printf("\nDigite tres numeros:  \n");
    scanf("%f",&n1);
    scanf("%f",&n2);
    scanf("%f",&n3);

    soma = n1+n2+n3;


    if(n1>n2){

        if(n1>n3){

            media = (n1*5+n2*2.5+n3*2.5)/soma;
        }

    }

    if(n2>n1){

        if(n2>n3){

            media = (n2*5+n1*2.5+n3*2.5)/soma;
        }

    }

    if(n3>n1){

        if(n3>n2){

            media = (n3*5+n1*2.5+n2*2.5)/soma;
        }

    }


    printf("\nA media ponderada entre os numeros = %.2f \n",media);




    return 0;
}
