//Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do teclado, bem como a quantidade de números apresentados

#include <stdio.h>

int main() {

    int num, i, quant;

    quant = 0;

    printf("Informe número: ");
    scanf("%d", &num);

    for(i = 1; i <= num; i++){
    if(i % 2 == 0){
        printf("%d ", i);
        quant++;
        }
    }

    printf("\nQuantidade de números apresentados: %d", quant);

return 0;
}