//Escreva um programa que mostre o resultado dos primeiros 50 termos da série: 1000/1 - 997/2 + 994/3 - 991/4 + ... Resultado: 685.30

#include <stdio.h>

int main() {

    float numerador, denominador, soma;
    int i;

    numerador = 1000;
    denominador = 1;
    soma = 0;

    for(i = 1; i <= 50; i++){

        if(i % 2 == 0){
            soma -= numerador / denominador;
        }
        else{
            soma += numerador / denominador;
        }

        numerador -= 3;
        denominador++;
    }

    printf("A soma é: %.2f", soma);

return 0;
}