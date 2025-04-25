//Escreva um algoritmo que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3 + 4 + 5 + ... + 100). Resultado: 5050.
#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int soma = 0, i;

    for(i = 1; i <= 100; i++){
        soma = soma + i;
    }

    printf("A soma dos 100 primeiros numeros inteiros é: %d.\n", soma);

    return 0;
}