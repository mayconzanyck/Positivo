//Exercicio 1 - Escreva um algoritmo que leia dois números inteiros, calcule e mostre a sua soma.

#include <stdio.h>

int main() {
    int num1, num2, num3;

    //Usa-se (printf) para escrever algo, e (scanf) para ler
    printf("Informe um numero: ");
    scanf("%d", &num1);

    printf("Informe outro numero: ");
    scanf("%d", &num2);

    num3 = num1 + num2;

    printf("O resultado da soma é de: %.2d", num3);

    return 0;
}
