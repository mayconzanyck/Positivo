#include <stdio.h>

int main() {

    char nome[20];
    int i, quant = 0;
    
    printf("Informe nome: ");
    scanf(" %20[^\n]", nome);
    
    for(i = 0; nome[i] != '\0'; i++){
        quant++;
    }

    printf("Seu nome possui %d caractéres!", quant);

    return 0;
}