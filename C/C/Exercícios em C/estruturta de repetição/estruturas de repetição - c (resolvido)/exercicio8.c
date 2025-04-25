//Escreva um programa que apresente na tela a tabuada de um número lido do teclado. Por exemplo, considerando que o número lido é 2, o formato da apresentação deve ser o seguinte:
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20

#include <stdio.h>

int main() {
    
    int tabuada, i;

    printf("Informe tabuada desejada: ");
    scanf("%d", &tabuada);

    for(i = 1; i <= 10; i++){

        printf("\n%d x %d = %d", tabuada, i , tabuada * i);
    }

return 0;
}