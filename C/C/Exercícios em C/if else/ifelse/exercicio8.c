#include <stdio.h>
#include <locale.h>
#include <math.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int num;

    printf("Informe um número inteiro: ");
    scanf("%d", &num);

    if (num >= 0) {
        if (num % 2 == 0) {
            printf("O número %d é par.\n", num);
        } else {
            printf("O número %d é ímpar.\n", num);
        }
    } else {
        printf("O valor absoluto do número é %d.\n", abs(num)); // Função abs() de math.h
    }

    return 0;
}