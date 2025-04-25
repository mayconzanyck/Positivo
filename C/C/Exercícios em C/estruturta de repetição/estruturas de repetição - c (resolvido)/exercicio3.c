//Escreva um programa que mostre os números múltiplos de 5, no intervalo de 1 até 100.

#include <stdio.h>

int main() {

    int i;

    for(i = 5; i <= 100; i = i + 5){
    printf("%d ", i);
    }

return 0;
}