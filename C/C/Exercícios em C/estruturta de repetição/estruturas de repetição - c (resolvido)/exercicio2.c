//Escreva um programa que mostre na tela uma contagem regressiva de 10 até 0 para o lançamento de um foguete. Após o término da contagem regressiva, deve ser apresentada a palavra "Fogo!".

#include <stdio.h>
#include <windows.h>

int main() {

    int i;

    for(i = 10; i >= 0; i--){
    printf("%d\n", i);
    Sleep(1000);
    }

    printf("Fogo!");

return 0;
}