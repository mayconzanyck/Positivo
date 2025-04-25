#include <stdio.h>

int main(){
	
	int num, soma;
	
	soma = 0;
	
	do{
		printf("Informe número: ");
		scanf("%d", &num);
		
		if(num >= 0)
			soma += num;
	}while(num >= 0);
	
	//soma -= num
	soma = soma - num
	
	printf("Resultado: %d", soma);
	
	returno 0;
}