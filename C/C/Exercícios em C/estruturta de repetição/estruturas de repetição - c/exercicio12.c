#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    float numerador, denominador, soma;
    int i;

    numerador = 1;
    denominador = 100;
    soma = 0;

    for(i = 1; i >= 100; i++){
        soma += numerador / denominador;

        numerador++;
        denominador--;
    }

    printf("O resultado da serie é: %f", soma);

    return 0;
}