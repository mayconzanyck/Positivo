//Exercicio de saque
#include <stdio.h>
#include <locale.h>

int main() {

    setlocale(LC_ALL, "Portuguese");

    int valor_saque;
    int c100, c50, c20, c10, c5;
    

    printf("Informe o valor do saque: R$ ");
    scanf("%d", &valor_saque);

    c100 = c50 = c20 = c10 = c5 = 0;

    c100 = valor_saque / 100;
    valor_saque %= 100;

    c50 = valor_saque / 50;
    valor_saque %= 50;

    c20 = valor_saque / 20;
    valor_saque %= 20;

    c10 = valor_saque / 10;
    valor_saque %= 10;

    c5 = valor_saque / 5;
    valor_saque %= 5;

    printf("Cédulas de 100: %d\n", c100);
    printf("Cédulas de 50: %d\n", c50);
    printf("Cédulas de 20: %d\n", c20);
    printf("Cédulas de 10: %d\n", c10);
    printf("Cédulas de 5: %d\n", c5);

    return 0;
}
