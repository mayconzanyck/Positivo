//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário (a senha válida é o número 2009). Se a senha informada pelo usuário for inválida, a mensagem "ACESSO NEGADO" deve ser mostrado na tela e deve ser solicitada uma nova senha até que ela seja válida. Caso contrário deve ser mostrado na tela a mensagem "ACESSO PERMITIDO" junto com um número de vezes que a senha foi informada.

#include <stdio.h>

int main() {

    int senha, tentativas;

    printf("Informe senha: ");
    scanf("%d", &senha);

    tentativas = 1;

    while(senha != 2009){
        printf("\nACESSO NEGADO!\n");
        printf("Informe senha: ");
        scanf("%d", &senha);

        tentativas++;
    }

    printf("\nACESSO PERMITIDO!");
    printf("\nNúmero de tentativas: %d", tentativas);

return 0;
}