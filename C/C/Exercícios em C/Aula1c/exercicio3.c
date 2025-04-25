#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int num, antecessor, sucessor;
	
	printf("Escreva um numero: ");
	scanf("%d", &num);
	
	antecessor = num - 1;
	sucessor = num + 1;
	
	printf("O antecessor de %d é %d, e o sucessor é %d.", num, antecessor, sucessor);
	
	return 0;
}
