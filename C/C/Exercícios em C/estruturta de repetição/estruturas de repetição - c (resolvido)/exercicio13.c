//Escreva um programa que mostre o resultado dos primeiros 20 termos da série: 1/1 + 3/2 + 5/4 + 7/8 + ... Resultado: 6.00.

#include <stdio.h>

int main() {

    int i;
    float numerador, denominador, soma;

    numerador = 1;
    denominador = 1;
    soma = 0;

    for(i = 1; i <= 20; i++){
        soma += numerador / denominador;
        numerador += 2;
        denominador *= 2;
    }

    printf("Resultado: %.2f", soma);
    
return 0;
}