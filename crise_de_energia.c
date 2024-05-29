#include <stdio.h>
#include <stdlib.h>

typedef struct no{
	int valor;
	struct no * prox;
}lista;

lista *inserir(lista *list,int chave){
	lista *no=(lista*)malloc(sizeof(lista));
	if(no){
		no->valor=chave;
		if(list==NULL){
           no->prox=no;
           list=no;
           return list;
		}
		lista *aux=list,*ante=NULL;
		while(aux->prox!=list){
			aux = aux->prox;
		}
		no->prox=list;
		aux->prox=no;
		
	}
	return list;
}

void mostrar(lista *l){
	lista* aux = l;
	
	do{
		printf("%d ",aux->valor);
		aux = aux->prox;	
	}while(aux!=l);
}

lista * remover(lista *l, int chave){
	lista *aux = l, *anterior;
	if(aux->valor==chave){
		lista *t = aux->prox;
		free(aux);
		return t;
	}
	
	do{
		anterior = aux;
		aux = aux->prox;
	}while(aux!=l && aux->valor!=chave);
	
	anterior->prox = aux->prox;
	free(aux);
	return l;
	
}

int size(lista *l){
	int n=0;
	lista *aux = l;
	
	if(l==NULL)
       return 0;
       
	do{
		aux = aux->prox;
		n++;
	}while(aux!=l);
	
	return n;
}

int main(int argc, char *argv[]) {
	
	lista *list = NULL;
	
	int n,i;
	scanf("%d",&n);
	
	i=1;
	while(i<=n){
		list = inserir(list,i);
		i++; 
	}
	
	mostrar(list);
	
	list = remover(list,5);
	printf("\n");
	mostrar(list);
	
	printf("tamanho: %d",size(list));
	
	////////
	
	int j=0;
	lista *aux = list;
	 
	for(i=1;i<=n;i++){
		 int cont=0,chave=1;
		 while(size(list)>1){
		 	 if(cont==i){
		 	    list = remover(list,);
				 			 	
	         }				 	
		 }			  		
	}
	
	return 0;
}
