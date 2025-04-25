//Escreva um algoritmo que mostre os números múltiplos de 5, no intervalo de 1 até 100.

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

	int i;
	
	for (i = 5; i <= 100; i = i + 5){
			printf("%d\n", i);
	}

    return 0;
}