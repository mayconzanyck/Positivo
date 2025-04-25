//Escreva um algoritmo que mostre na tela uma contagem regressiva de 10 até 0 para o lançamento de um foguete. Após o término da contagem regressiva, deve ser apresentada a palavra "Fogo!".

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int i;

    for(i = 10; i >= 0; i--){
        printf("%d\n", i);
    }
    
    printf("FOGO!!!");

    return 0;
}