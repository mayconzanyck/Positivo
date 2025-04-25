//Escreva um programa que calcule o fatorial de um número positivo qualquer. Por exemplo, se o número for 5, o resultado será 120 (5 * 4 * 3 * 2 * 1 = 120). É importante obsevar que o fatorial do número 0 é igual a 1.

#include <stdio.h>

int main() {

    int fatorial, num, i;

    fatorial = 1;

    printf("Informe número: ");
    scanf("%d", &num);

    for(i = 1; i <= num; i++){
        fatorial *= i;
    }

    printf("O fatorial de %d é %d", num, fatorial);
    
    return 0;
}