//Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3+ 4 + 5 + ... + 100). Resultado: 5050

#include <stdio.h>

int main() {

    int i, soma;

    soma = 0;

    for(i = 1; i <= 100; i++){
    soma += i;
    }

    printf("Resultado: %d", soma);

return 0;
}