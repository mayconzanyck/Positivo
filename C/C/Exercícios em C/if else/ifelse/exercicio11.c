#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int num1, num2;
    char operacao;
    float resultado;

    printf("Digite o primeiro número inteiro: ");
    scanf("%d", &num1);

    printf("Digite o segundo número inteiro: ");
    scanf("%d", &num2);

    printf("Digite a operação desejada (+, -, *, /): ");
    scanf(" %c", &operacao);  // O espaço antes de %c é necessário para ignorar qualquer caractere anterior.

    // Verifica qual operação foi escolhida e realiza o cálculo
    if (operacao == '+') {
        resultado = num1 + num2;
        printf("Resultado: %d + %d = %.2f\n", num1, num2, resultado);
    } 
    else if (operacao == '-') {
        resultado = num1 - num2;
        printf("Resultado: %d - %d = %.2f\n", num1, num2, resultado);
    } 
    else if (operacao == '*') {
        resultado = num1 * num2;
        printf("Resultado: %d * %d = %.2f\n", num1, num2, resultado);
    } 
    else if (operacao == '/') {
        if (num2 != 0) {
            resultado = (float) num1 / num2;
            printf("Resultado: %d / %d = %.2f\n", num1, num2, resultado);
        } 
        else {
            printf("Erro: divisão por zero não é permitida.\n");
        }
    } 
    else {
        printf("Operação inválida!\n");
    }

    return 0;
}