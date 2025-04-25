//Escreva um programa que forneça quantos números devem existir em sequência a partir do 1 (1, 2, 3, 4,...) para que a sua soma ultrapasse o valor 100 o mínimo possível.

#include <stdio.h>

int main() {

    int num, soma;

    num = 0;
    soma = 0;

    while(soma <= 100){
        num++;
    soma += num;
    }

    printf("\nQuantidade de números: %d", num);
    
return 0;
}