//Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual a zero. Ao final, mostre o resultado da soma.

#include <stdio.h>

int main() {

    int num, soma;

    soma = 0;

    do{
    printf("Informe número: ");
    scanf("%d", &num);

    soma += num;
    }while(num != 0);

    printf("Resultado: %d", soma);

return 0;
}