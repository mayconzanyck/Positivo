//Escreva um programa que escreva os 10 primeiros termos da série 1, 3, 9, 27, ...

#include <stdio.h>

int main() {

    int i, num;

    num = 3;

    for(i = 1; i <= 10; i++){
        printf("%d ", num);
        num *= 3;
    }

return 0;
}