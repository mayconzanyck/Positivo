//Escreva um algoritmo que mostre os números de 1 até 10, um número por linha.

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

	int i;
	
	for (i = 1; i <= 10; i++){
			printf("%d\n", i);
	}

    return 0;
}