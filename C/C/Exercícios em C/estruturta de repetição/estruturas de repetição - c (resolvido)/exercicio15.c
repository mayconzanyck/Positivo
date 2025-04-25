//Escreva um programa que escreva os 10 primeiros números da sequência de Fibonacci. Resultado: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

#include <stdio.h>

int main() {

    int anterior, atual, i;

    anterior = 1;
    atual = 1;

    printf("%d %d ", anterior, atual);

    for(i = 3; i <= 10; i++){
        atual += anterior;
        anterior = atual - anterior;

        printf("%d ", atual);
    }

return 0;
}