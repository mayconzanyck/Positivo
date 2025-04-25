#include <stdio.h>
#include <string.h>

int main() {

    char nome[21];
    
    printf("Informe seu nome: ");
    scanf(" %20[^\n]", nome);

    printf("Seu nome tem %d carácteres!", strlen(nome));

    return 0;
}