#include <stdio.h>
#include <string.h>

int main() {

    char nome[20];
    
    printf("Informe nome: ");
    scanf(" %20[^\n]", nome);

    printf("Seu nome possui %d caractéres!", strlen(nome));

    return 0;
}